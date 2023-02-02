package kr.weareboard.werewolf.domain.entity.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016J\"\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lkr/weareboard/werewolf/domain/entity/user/UserDetailServiceImpl;", "Lorg/springframework/security/core/userdetails/UserDetailsService;", "userRepository", "Lkr/weareboard/werewolf/domain/entity/user/UserRepository;", "userQueryRepository", "Lkr/weareboard/werewolf/domain/entity/user/UserQueryRepository;", "passwordEncoder", "Lorg/springframework/security/crypto/password/PasswordEncoder;", "(Lkr/weareboard/werewolf/domain/entity/user/UserRepository;Lkr/weareboard/werewolf/domain/entity/user/UserQueryRepository;Lorg/springframework/security/crypto/password/PasswordEncoder;)V", "createMemberKakao", "", "providerId", "", "email", "nickname", "isNonExistEmail", "", "loadUserByUsername", "Lorg/springframework/security/core/userdetails/UserDetails;", "username", "oauthLogin", "provider", "Lkr/weareboard/werewolf/domain/entity/user/enum/OAuth2Provider;", "domain"})
@org.springframework.stereotype.Service
public class UserDetailServiceImpl implements org.springframework.security.core.userdetails.UserDetailsService {
    private final kr.weareboard.werewolf.domain.entity.user.UserRepository userRepository = null;
    private final kr.weareboard.werewolf.domain.entity.user.UserQueryRepository userQueryRepository = null;
    private final org.springframework.security.crypto.password.PasswordEncoder passwordEncoder = null;
    
    public UserDetailServiceImpl(@org.jetbrains.annotations.NotNull
    kr.weareboard.werewolf.domain.entity.user.UserRepository userRepository, @org.jetbrains.annotations.NotNull
    kr.weareboard.werewolf.domain.entity.user.UserQueryRepository userQueryRepository, @org.jetbrains.annotations.NotNull
    org.springframework.security.crypto.password.PasswordEncoder passwordEncoder) {
        super();
    }
    
    public boolean isNonExistEmail(@org.jetbrains.annotations.Nullable
    java.lang.String email) {
        return false;
    }
    
    public void createMemberKakao(@org.jetbrains.annotations.Nullable
    java.lang.String providerId, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String nickname) {
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(@org.jetbrains.annotations.NotNull
    java.lang.String username) {
        return null;
    }
}