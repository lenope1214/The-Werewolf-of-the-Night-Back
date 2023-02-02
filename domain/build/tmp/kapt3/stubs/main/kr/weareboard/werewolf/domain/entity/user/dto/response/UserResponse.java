package kr.weareboard.werewolf.domain.entity.user.dto.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\rJD\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\b\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\""}, d2 = {"Lkr/weareboard/werewolf/domain/entity/user/dto/response/UserResponse;", "", "id", "", "name", "", "role", "Lkr/weareboard/werewolf/domain/entity/user/enum/UserRoleType;", "isFirst", "", "changePassword", "(JLjava/lang/String;Lkr/weareboard/werewolf/domain/entity/user/enum/UserRoleType;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getChangePassword", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getId", "()J", "getName", "()Ljava/lang/String;", "getRole", "()Lkr/weareboard/werewolf/domain/entity/user/enum/UserRoleType;", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/String;Lkr/weareboard/werewolf/domain/entity/user/enum/UserRoleType;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lkr/weareboard/werewolf/domain/entity/user/dto/response/UserResponse;", "equals", "other", "hashCode", "", "toString", "Companion", "domain"})
public final class UserResponse {
    @io.swagger.v3.oas.annotations.media.Schema(name = "\uae30\ubcf8\ud0a4")
    private final long id = 0L;
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.media.Schema(name = "\uc0ac\uc6a9\uc790 \uc774\ub984")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable
    @io.swagger.v3.oas.annotations.media.Schema(name = "\uc0ac\uc6a9\uc790 \ucc98\uc74c \ub85c\uadf8\uc778 \uc5ec\ubd80, true\ub77c\uba74 \ube44\ubc00\ubc88\ud638 \ubcc0\uacbd \ud544\uc694")
    private final java.lang.Boolean isFirst = null;
    @org.jetbrains.annotations.Nullable
    @io.swagger.v3.oas.annotations.media.Schema(name = "\uc0ac\uc6a9\uc790 \ube44\ubc00\ubc88\ud638 \ubcc0\uacbd \uc720\ubb34, true\ub77c\uba74 \ube44\ubc00\ubc88\ud638 \ubcc0\uacbd \ud544\uc694")
    private final java.lang.Boolean changePassword = null;
    @org.jetbrains.annotations.NotNull
    public static final kr.weareboard.werewolf.domain.entity.user.dto.response.UserResponse.Companion Companion = null;
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isFirst() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getChangePassword() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lkr/weareboard/werewolf/domain/entity/user/dto/response/UserResponse$Companion;", "", "()V", "of", "Lkr/weareboard/werewolf/domain/entity/user/dto/response/UserResponse;", "user", "Lkr/weareboard/werewolf/domain/entity/user/User;", "domain"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final kr.weareboard.werewolf.domain.entity.user.dto.response.UserResponse of(@org.jetbrains.annotations.NotNull
        kr.weareboard.werewolf.domain.entity.user.User user) {
            return null;
        }
    }
}