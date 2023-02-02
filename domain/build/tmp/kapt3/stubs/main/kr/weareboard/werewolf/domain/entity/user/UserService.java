package kr.weareboard.werewolf.domain.entity.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u0000 \'2\u00020\u0001:\u0001\'B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0017J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016J\b\u0010\u001f\u001a\u00020\u000eH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0016R\u0012\u0010\r\u001a\u00020\u000e8\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u000e8\u0012@\u0012X\u0093.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lkr/weareboard/werewolf/domain/entity/user/UserService;", "", "jwtTokenProvider", "Lkr/weareboard/werewolf/common/jwt/JwtTokenProvider;", "authenticationManager", "Lorg/springframework/security/authentication/AuthenticationManager;", "userRepository", "Lkr/weareboard/werewolf/domain/entity/user/UserRepository;", "userQueryRepository", "Lkr/weareboard/werewolf/domain/entity/user/UserQueryRepository;", "passwordEncoder", "Lorg/springframework/security/crypto/password/PasswordEncoder;", "(Lkr/weareboard/werewolf/common/jwt/JwtTokenProvider;Lorg/springframework/security/authentication/AuthenticationManager;Lkr/weareboard/werewolf/domain/entity/user/UserRepository;Lkr/weareboard/werewolf/domain/entity/user/UserQueryRepository;Lorg/springframework/security/crypto/password/PasswordEncoder;)V", "adminKey", "", "kakaoLogoutRedirectUrl", "changePassword", "", "putPasswordRequest", "Lkr/weareboard/werewolf/domain/entity/user/dto/request/PutPasswordRequest;", "deleteUser", "id", "", "getMyInfo", "Lkr/weareboard/werewolf/domain/entity/user/dto/response/UserResponse;", "getUserById", "Lkr/weareboard/werewolf/domain/entity/user/User;", "getUserByUsername", "username", "isExistUser", "", "kakaoLogout", "refreshToken", "Lkr/weareboard/werewolf/common/jwt/dto/JwtToken;", "refreshTokenRequest", "Lkr/weareboard/werewolf/domain/entity/user/dto/request/RefreshTokenRequest;", "updateUser", "userUpdateRequest", "Lkr/weareboard/werewolf/domain/entity/user/dto/request/UserUpdateRequest;", "Companion", "domain"})
@org.springframework.stereotype.Service
public class UserService {
    private final kr.weareboard.werewolf.common.jwt.JwtTokenProvider jwtTokenProvider = null;
    private final org.springframework.security.authentication.AuthenticationManager authenticationManager = null;
    private final kr.weareboard.werewolf.domain.entity.user.UserRepository userRepository = null;
    private final kr.weareboard.werewolf.domain.entity.user.UserQueryRepository userQueryRepository = null;
    private final org.springframework.security.crypto.password.PasswordEncoder passwordEncoder = null;
    @org.springframework.beans.factory.annotation.Value(value = "${auth.kakao.key.admin}")
    private java.lang.String adminKey;
    @org.springframework.beans.factory.annotation.Value(value = "${auth.kakao.logout.redirect-url}")
    private java.lang.String kakaoLogoutRedirectUrl;
    @org.jetbrains.annotations.NotNull
    public static final kr.weareboard.werewolf.domain.entity.user.UserService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    private static final org.slf4j.Logger log = null;
    
    public UserService(@org.jetbrains.annotations.NotNull
    kr.weareboard.werewolf.common.jwt.JwtTokenProvider jwtTokenProvider, @org.jetbrains.annotations.NotNull
    org.springframework.security.authentication.AuthenticationManager authenticationManager, @org.jetbrains.annotations.NotNull
    kr.weareboard.werewolf.domain.entity.user.UserRepository userRepository, @org.jetbrains.annotations.NotNull
    kr.weareboard.werewolf.domain.entity.user.UserQueryRepository userQueryRepository, @org.jetbrains.annotations.NotNull
    org.springframework.security.crypto.password.PasswordEncoder passwordEncoder) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public kr.weareboard.werewolf.common.jwt.dto.JwtToken refreshToken(@org.jetbrains.annotations.NotNull
    kr.weareboard.werewolf.domain.entity.user.dto.request.RefreshTokenRequest refreshTokenRequest) {
        return null;
    }
    
    public void isExistUser(@org.jetbrains.annotations.NotNull
    java.lang.String username) {
    }
    
    @org.jetbrains.annotations.NotNull
    public kr.weareboard.werewolf.domain.entity.user.User getUserById(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public kr.weareboard.werewolf.domain.entity.user.dto.response.UserResponse getMyInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public kr.weareboard.werewolf.domain.entity.user.dto.response.UserResponse updateUser(@org.jetbrains.annotations.NotNull
    kr.weareboard.werewolf.domain.entity.user.dto.request.UserUpdateRequest userUpdateRequest) {
        return null;
    }
    
    @org.springframework.data.jpa.repository.Lock(value = jakarta.persistence.LockModeType.PESSIMISTIC_WRITE)
    public boolean deleteUser(long id) {
        return false;
    }
    
    public boolean changePassword(@org.jetbrains.annotations.NotNull
    kr.weareboard.werewolf.domain.entity.user.dto.request.PutPasswordRequest putPasswordRequest) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public kr.weareboard.werewolf.domain.entity.user.User getUserByUsername(@org.jetbrains.annotations.NotNull
    java.lang.String username) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public java.lang.String kakaoLogout() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\t"}, d2 = {"Lkr/weareboard/werewolf/domain/entity/user/UserService$Companion;", "", "()V", "log", "Lorg/slf4j/Logger;", "getLog", "()Lorg/slf4j/Logger;", "getAccountFromSecurityContext", "Lkr/weareboard/werewolf/domain/entity/user/User;", "domain"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final org.slf4j.Logger getLog() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final kr.weareboard.werewolf.domain.entity.user.User getAccountFromSecurityContext() {
            return null;
        }
    }
}