package kr.weareboard.werewolf.domain.entity.user.dto.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lkr/weareboard/werewolf/domain/entity/user/dto/request/PutPasswordRequest;", "", "username", "", "password", "(Ljava/lang/String;Ljava/lang/String;)V", "getPassword", "()Ljava/lang/String;", "getUsername", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"})
public final class PutPasswordRequest {
    @org.jetbrains.annotations.NotNull
    @org.hibernate.validator.constraints.Length(min = 4, max = 16, message = "\uc544\uc774\ub514\ub294 4~16\uc790 \uc774\ub0b4\ub85c \uc124\uc815\ud574\uc8fc\uc138\uc694.")
    @jakarta.validation.constraints.NotBlank(message = "\uc544\uc774\ub514\ub97c \uc785\ub825\ud574\uc8fc\uc138\uc694.")
    @io.swagger.v3.oas.annotations.media.Schema(name = "\ube44\ubc00\ubc88\ud638\ub97c \ubcc0\uacbd\ud560 \uacc4\uc815 \uc544\uc774\ub514", description = "\uc544\uc774\ub514\ub294 4~16\uc790 \uc774\ub0b4\ub85c \uc124\uc815\ud574\uc8fc\uc138\uc694.")
    private final java.lang.String username = null;
    @org.jetbrains.annotations.NotNull
    @org.hibernate.validator.constraints.Length(min = 4, max = 20, message = "\ube44\ubc00\ubc88\ud638\ub294 4~20\uc790 \uc774\ub0b4\ub85c \uc124\uc815\ud574\uc8fc\uc138\uc694.")
    @jakarta.validation.constraints.NotBlank(message = "\ube44\ubc00\ubc88\ud638\ub97c \uc785\ub825\ud574\uc8fc\uc138\uc694.")
    @io.swagger.v3.oas.annotations.media.Schema(name = "\ubcc0\uacbd\ud560 \uacc4\uc815 \ube44\ubc00\ubc88\ud638", description = "\ube44\ubc00\ubc88\ud638\ub294 4~20\uc790 \uc774\ub0b4\ub85c \uc124\uc815\ud574\uc8fc\uc138\uc694.")
    private final java.lang.String password = null;
    
    @org.jetbrains.annotations.NotNull
    public final kr.weareboard.werewolf.domain.entity.user.dto.request.PutPasswordRequest copy(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return null;
    }
    
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
    
    public PutPasswordRequest(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        super();
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
}