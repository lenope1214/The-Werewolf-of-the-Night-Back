package kr.weareboard.werewolf.domain.entity.user

import kr.weareboard.werewolf.domain.entity.BaseEntity
import kr.weareboard.werewolf.domain.entity.user.dto.request.UserUpdateRequest
import kr.weareboard.werewolf.domain.entity.user.enum.OAuth2Provider
import kr.weareboard.werewolf.domain.entity.user.enum.UserRoleType
import org.hibernate.annotations.Comment
import org.hibernate.annotations.Where
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import java.time.LocalDateTime
import jakarta.persistence.*
import kr.weareboard.werewolf.domain.entity.room.Room

@Where(clause = "deleted_at IS NULL")
@Entity
@Table(name = "tb_user")
class User(

    @Column(name = "username", length = 20, nullable = false)
    @Comment(value = "사용자 로그인 아이디")
    private val username: String,

    @Column(name = "password", length = 255, nullable = false)
    @Comment(value = "사용자 로그인 비밀번호")
    private var password: String,

    @Column(name = "name", length = 50, nullable = false)
    @Comment(value = "사용자 이름(성함)")
    var name: String,

    @Column(name = "email", length = 255, nullable = false)
    @Comment(value = "사용자 이메일")
    var email: String,

    @Column(name = "provider", length = 255, nullable = false)
    @Comment(value = "사용자 oauth2 인증소")
    var provider: OAuth2Provider = OAuth2Provider.LOCAL,

    @Column(name = "provider_id", length = 255,)
    @Comment(value = "사용자 oauth2 인증소 id")
    var providerId: String? = null,

    @Column(name = "role", length = 50, nullable = false)
    @Comment(value = "사용자 권한(ROLE_XXX)")
    @Enumerated(EnumType.STRING)
    val role: UserRoleType = UserRoleType.ROLE_USER,

    @Column(name = "changePassword", length = 50, nullable = false)
    @Comment(value = "사용자 비밀번호 변경 유무")
    val changePassword: Boolean = false,

    // 참가한 룸 정보
    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH])
    @JoinColumn(name = "room_id")
    @Comment(value = "참가한 룸 정보")
    var room: Room? = null,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment(value = "기본키")
    @Column(name = "user_id")
    val id: Long? = null,
) : UserDetails, BaseEntity() {

    private var loginAt: LocalDateTime? = null

    fun updateInfo(userUpdateRequest: UserUpdateRequest) {
        this.name = userUpdateRequest.name ?: this.name
    }

    fun login() {
        loginAt = LocalDateTime.now()
    }

    fun isLoggedIn(): Boolean {
        return loginAt != null
    }

    fun checkEmail(): Boolean {
        return email.isNotEmpty()
    }

    fun isChangePassword(): Boolean = this.changePassword

    override fun getUsername(): String = this.username

    override fun getPassword(): String = this.password

    override fun getAuthorities(): MutableCollection<out GrantedAuthority> {
        val authorities: MutableList<GrantedAuthority> = ArrayList()
        authorities.add(SimpleGrantedAuthority(this.role.name))
        return authorities
    }

    override fun isAccountNonExpired(): Boolean {
        return true
    }

    override fun isAccountNonLocked(): Boolean {
        return true
    }

    override fun isCredentialsNonExpired(): Boolean {
        return true
    }

    override fun isEnabled(): Boolean {
        return true
    }

    fun changePassword(encryptPassword: String) {
        this.password = encryptPassword
    }

    override
    fun toString(): String {
        return "User(id=$id, username='$username', password='$password', name='$name', role=$role, changePassword=$changePassword, loginAt=$loginAt)"
    }

    fun toRefererString(): String {
        return "User(id=$id, username='$username', password='$password', name='$name', role=$role)"
    }

    fun updateProvider(provider: OAuth2Provider, providerId: String) {
        this.provider = provider
        this.providerId = providerId
    }
}