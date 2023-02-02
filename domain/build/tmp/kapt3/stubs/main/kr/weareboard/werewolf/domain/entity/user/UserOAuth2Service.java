package kr.weareboard.werewolf.domain.entity.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0092\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lkr/weareboard/werewolf/domain/entity/user/UserOAuth2Service;", "Lorg/springframework/security/oauth2/client/userinfo/DefaultOAuth2UserService;", "userService", "Lkr/weareboard/werewolf/domain/entity/user/UserDetailServiceImpl;", "(Lkr/weareboard/werewolf/domain/entity/user/UserDetailServiceImpl;)V", "log", "Lorg/slf4j/Logger;", "loadUser", "Lorg/springframework/security/oauth2/core/user/OAuth2User;", "userRequest", "Lorg/springframework/security/oauth2/client/userinfo/OAuth2UserRequest;", "domain"})
@org.springframework.stereotype.Service
public class UserOAuth2Service extends org.springframework.security.oauth2.client.userinfo.DefaultOAuth2UserService {
    private final kr.weareboard.werewolf.domain.entity.user.UserDetailServiceImpl userService = null;
    private final org.slf4j.Logger log = null;
    
    public UserOAuth2Service(@org.jetbrains.annotations.NotNull
    kr.weareboard.werewolf.domain.entity.user.UserDetailServiceImpl userService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @kotlin.jvm.Throws(exceptionClasses = {org.springframework.security.oauth2.core.OAuth2AuthenticationException.class})
    @java.lang.Override
    public org.springframework.security.oauth2.core.user.OAuth2User loadUser(@org.jetbrains.annotations.NotNull
    org.springframework.security.oauth2.client.userinfo.OAuth2UserRequest userRequest) throws org.springframework.security.oauth2.core.OAuth2AuthenticationException {
        return null;
    }
}