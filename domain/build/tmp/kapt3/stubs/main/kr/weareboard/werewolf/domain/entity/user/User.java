package kr.weareboard.werewolf.domain.entity.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B[\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\r\u001a\u00020\'2\u0006\u0010(\u001a\u00020\u0004H\u0016J\b\u0010)\u001a\u00020\u000eH\u0016J\u0010\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020,0+H\u0016J\b\u0010-\u001a\u00020\u0004H\u0016J\b\u0010.\u001a\u00020\u0004H\u0016J\b\u0010/\u001a\u00020\u000eH\u0016J\b\u00100\u001a\u00020\u000eH\u0016J\b\u00101\u001a\u00020\u000eH\u0016J\b\u00102\u001a\u00020\u000eH\u0016J\b\u00103\u001a\u00020\u000eH\u0016J\b\u00104\u001a\u00020\u000eH\u0016J\b\u00105\u001a\u00020\'H\u0016J\b\u00106\u001a\u00020\u0004H\u0016J\b\u00107\u001a\u00020\u0004H\u0016J\u0010\u00108\u001a\u00020\'2\u0006\u00109\u001a\u00020:H\u0016J\u0018\u0010;\u001a\u00020\'2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016R\u0016\u0010\r\u001a\u00020\u000e8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0007\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0016X\u0097\u0004\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u0017R\u0012\u0010\u0005\u001a\u00020\u00048\u0012@\u0012X\u0093\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u00020\t8\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R \u0010\n\u001a\u0004\u0018\u00010\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\f8\u0016X\u0097\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0010\u0010\u0003\u001a\u00020\u00048\u0012X\u0093\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006<"}, d2 = {"Lkr/weareboard/werewolf/domain/entity/user/User;", "Lorg/springframework/security/core/userdetails/UserDetails;", "Lkr/weareboard/werewolf/domain/entity/BaseEntity;", "username", "", "password", "name", "email", "provider", "Lkr/weareboard/werewolf/domain/entity/user/enum/OAuth2Provider;", "providerId", "role", "Lkr/weareboard/werewolf/domain/entity/user/enum/UserRoleType;", "changePassword", "", "id", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkr/weareboard/werewolf/domain/entity/user/enum/OAuth2Provider;Ljava/lang/String;Lkr/weareboard/werewolf/domain/entity/user/enum/UserRoleType;ZLjava/lang/Long;)V", "getChangePassword", "()Z", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "loginAt", "Ljava/time/LocalDateTime;", "getName", "setName", "getProvider", "()Lkr/weareboard/werewolf/domain/entity/user/enum/OAuth2Provider;", "setProvider", "(Lkr/weareboard/werewolf/domain/entity/user/enum/OAuth2Provider;)V", "getProviderId", "setProviderId", "getRole", "()Lkr/weareboard/werewolf/domain/entity/user/enum/UserRoleType;", "", "encryptPassword", "checkEmail", "getAuthorities", "", "Lorg/springframework/security/core/GrantedAuthority;", "getPassword", "getUsername", "isAccountNonExpired", "isAccountNonLocked", "isChangePassword", "isCredentialsNonExpired", "isEnabled", "isLoggedIn", "login", "toRefererString", "toString", "updateInfo", "userUpdateRequest", "Lkr/weareboard/werewolf/domain/entity/user/dto/request/UserUpdateRequest;", "updateProvider", "domain"})
@jakarta.persistence.Table(name = "tb_user")
@jakarta.persistence.Entity
@org.hibernate.annotations.Where(clause = "deleted_at IS NULL")
public class User extends kr.weareboard.werewolf.domain.entity.BaseEntity implements org.springframework.security.core.userdetails.UserDetails {
    @org.hibernate.annotations.Comment(value = "\uc0ac\uc6a9\uc790 \ub85c\uadf8\uc778 \uc544\uc774\ub514")
    @jakarta.persistence.Column(name = "username", length = 20, nullable = false)
    private final java.lang.String username = null;
    @org.hibernate.annotations.Comment(value = "\uc0ac\uc6a9\uc790 \ub85c\uadf8\uc778 \ube44\ubc00\ubc88\ud638")
    @jakarta.persistence.Column(name = "password", length = 255, nullable = false)
    private java.lang.String password;
    @org.jetbrains.annotations.NotNull
    @org.hibernate.annotations.Comment(value = "\uc0ac\uc6a9\uc790 \uc774\ub984(\uc131\ud568)")
    @jakarta.persistence.Column(name = "name", length = 50, nullable = false)
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull
    @org.hibernate.annotations.Comment(value = "\uc0ac\uc6a9\uc790 \uc774\uba54\uc77c")
    @jakarta.persistence.Column(name = "email", length = 255, nullable = false)
    private java.lang.String email;
    @org.jetbrains.annotations.Nullable
    @org.hibernate.annotations.Comment(value = "\uc0ac\uc6a9\uc790 oauth2 \uc778\uc99d\uc18c id")
    @jakarta.persistence.Column(name = "provider_id", length = 255)
    private java.lang.String providerId;
    @org.hibernate.annotations.Comment(value = "\uc0ac\uc6a9\uc790 \ube44\ubc00\ubc88\ud638 \ubcc0\uacbd \uc720\ubb34")
    @jakarta.persistence.Column(name = "changePassword", length = 50, nullable = false)
    private final boolean changePassword = false;
    @org.jetbrains.annotations.Nullable
    @jakarta.persistence.Column(name = "user_id")
    @org.hibernate.annotations.Comment(value = "\uae30\ubcf8\ud0a4")
    @jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @jakarta.persistence.Id
    private final java.lang.Long id = null;
    private java.time.LocalDateTime loginAt;
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getName() {
        return null;
    }
    
    public void setName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String getEmail() {
        return null;
    }
    
    public void setEmail(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.String getProviderId() {
        return null;
    }
    
    public void setProviderId(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public boolean getChangePassword() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable
    public java.lang.Long getId() {
        return null;
    }
    
    public void updateInfo(@org.jetbrains.annotations.NotNull
    kr.weareboard.werewolf.domain.entity.user.dto.request.UserUpdateRequest userUpdateRequest) {
    }
    
    public void login() {
    }
    
    public boolean isLoggedIn() {
        return false;
    }
    
    public boolean checkEmail() {
        return false;
    }
    
    public boolean isChangePassword() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.util.Collection<? extends org.springframework.security.core.GrantedAuthority> getAuthorities() {
        return null;
    }
    
    @java.lang.Override
    public boolean isAccountNonExpired() {
        return false;
    }
    
    @java.lang.Override
    public boolean isAccountNonLocked() {
        return false;
    }
    
    @java.lang.Override
    public boolean isCredentialsNonExpired() {
        return false;
    }
    
    @java.lang.Override
    public boolean isEnabled() {
        return false;
    }
    
    public void changePassword(@org.jetbrains.annotations.NotNull
    java.lang.String encryptPassword) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String toRefererString() {
        return null;
    }
}