package kr.weareboard.werewolf.domain.entity.user.dto.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f\u00a8\u0006\""}, d2 = {"Lkr/weareboard/werewolf/domain/entity/user/dto/request/UserCreateRequest;", "", "username", "", "password", "encryptedPassword", "name", "role", "Lkr/weareboard/werewolf/domain/entity/user/enum/UserRoleType;", "phone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkr/weareboard/werewolf/domain/entity/user/enum/UserRoleType;Ljava/lang/String;)V", "getEncryptedPassword", "()Ljava/lang/String;", "setEncryptedPassword", "(Ljava/lang/String;)V", "getName", "getPassword", "getPhone", "getRole", "()Lkr/weareboard/werewolf/domain/entity/user/enum/UserRoleType;", "getUsername", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"})
public final class UserCreateRequest {
    @org.jetbrains.annotations.NotNull
    @org.hibernate.validator.constraints.Length(min = 4, max = 16, message = "\uc544\uc774\ub514\ub294 4~16\uc790 \uc774\ub0b4\ub85c \uc124\uc815\ud574\uc8fc\uc138\uc694.")
    @jakarta.validation.constraints.NotBlank(message = "\uc544\uc774\ub514\ub97c \uc785\ub825\ud574\uc8fc\uc138\uc694.")
    @io.swagger.v3.oas.annotations.media.Schema(name = "\uacc4\uc815 \uc544\uc774\ub514", description = "\uc544\uc774\ub514\ub294 4~16\uc790 \uc774\ub0b4\ub85c \uc124\uc815\ud574\uc8fc\uc138\uc694.")
    private final java.lang.String username = null;
    @org.jetbrains.annotations.NotNull
    @org.hibernate.validator.constraints.Length(min = 4, max = 20, message = "\ube44\ubc00\ubc88\ud638\ub294 4~20\uc790 \uc774\ub0b4\ub85c \uc124\uc815\ud574\uc8fc\uc138\uc694.")
    @jakarta.validation.constraints.NotBlank(message = "\ube44\ubc00\ubc88\ud638\ub97c \uc785\ub825\ud574\uc8fc\uc138\uc694.")
    @io.swagger.v3.oas.annotations.media.Schema(name = "\uacc4\uc815 \ube44\ubc00\ubc88\ud638", description = "\ube44\ubc00\ubc88\ud638\ub294 4~20\uc790 \uc774\ub0b4\ub85c \uc124\uc815\ud574\uc8fc\uc138\uc694.")
    private final java.lang.String password = null;
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.media.Schema(hidden = true)
    private java.lang.String encryptedPassword;
    @org.jetbrains.annotations.NotNull
    @org.hibernate.validator.constraints.Length(min = 2, max = 50, message = "\uc774\ub984\uc740 \ucd5c\ub300 50\uc790 \uc785\ub2c8\ub2e4.")
    @jakarta.validation.constraints.NotBlank(message = "\uc774\ub984\uc744 \uc785\ub825\ud574\uc8fc\uc138\uc694.")
    @io.swagger.v3.oas.annotations.media.Schema(name = "\uc774\ub984", description = "\uc0ac\uc6a9\uc790 \uc774\ub984")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    @io.swagger.v3.oas.annotations.media.Schema(name = "\uc5f0\ub77d\ucc98", description = "\uad6c\ubd84\uc790\ub85c \uc0ac\uc774\uc5d0 -\ub97c \uc785\ub825\ud574\uc8fc\uc138\uc694.")
    private final java.lang.String phone = null;
    
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
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPassword() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEncryptedPassword() {
        return null;
    }
    
    public final void setEncryptedPassword(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPhone() {
        return null;
    }
}