package kr.weareboard.werewolf.domain.entity.room

import jakarta.persistence.*
import kr.weareboard.werewolf.domain.entity.BaseEntity
import kr.weareboard.werewolf.domain.entity.user.User
import org.hibernate.annotations.Comment
import org.hibernate.annotations.Where

@Where(clause = "deleted_at IS NULL")
@Entity
@Table(name = "tb_room")
class Room(
    @Column(name = "name", length = 50, nullable = false)
    @Comment(value = "방 이름")
    var name: String,

    //방 설명
    @Column(name = "description", length = 255, nullable = false)
    @Comment(value = "방 설명")
    var description: String,

    @Column(name = "max_player", length = 2, nullable = false)
    @Comment(value = "최대 플레이어 수")
    var maxPlayer: Int,

    @Column(name = "is_started", length = 1, nullable = false)
    @Comment(value = "게임 시작 여부")
    var isStarted: Boolean = false,

    @Column(name = "is_finished", length = 1, nullable = false)
    @Comment(value = "게임 종료 여부")
    var isFinished: Boolean = false,

    @Column(name = "is_private", length = 1, nullable = false)
    @Comment(value = "비공개 여부")
    var isPrivate: Boolean = false,

    @Column(name = "password", length = 255, nullable = false)
    @Comment(value = "비밀번호")
    var password: String? = null,

    @ManyToOne(fetch = FetchType.LAZY, cascade = [CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH ])
    @JoinColumn(name = "owner_id")
    @Comment(value = "방장 번호")
    var owner: User? = null,

    @OneToMany(mappedBy = "room", cascade = [CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH ], orphanRemoval = true)
    @Comment(value = "룸에 참여한 유저들")
    var users: MutableList<User> = mutableListOf(),

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Comment(value = "기본키")
    @Column(name = "room_id")
    val id: Long? = null,
) : BaseEntity(){
}