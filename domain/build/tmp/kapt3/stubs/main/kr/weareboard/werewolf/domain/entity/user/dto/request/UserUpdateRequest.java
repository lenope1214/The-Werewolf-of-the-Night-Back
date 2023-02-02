package kr.weareboard.werewolf.domain.entity.user.dto.request;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lkr/weareboard/werewolf/domain/entity/user/dto/request/UserUpdateRequest;", "", "id", "", "name", "", "phone", "(JLjava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getPhone", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain"})
public final class UserUpdateRequest {
    @jakarta.validation.constraints.Min(value = 1L, message = "\uacc4\uc815 \ubc88\ud638\ub294 1 \uc774\uc0c1 \uc785\ub825\ud574\uc8fc\uc138\uc694.")
    @io.swagger.v3.oas.annotations.media.Schema(name = "\uacc4\uc815 \ubc88\ud638", description = "\ud544\uc218 \uc785\ub825\uc785\ub2c8\ub2e4.")
    private final long id = 0L;
    @org.jetbrains.annotations.Nullable
    @org.hibernate.validator.constraints.Length(min = 2, message = "\uc774\ub984\uc740 2\uc790 \uc774\uc0c1 \uc785\ub825\ud574\uc8fc\uc138\uc694.")
    @io.swagger.v3.oas.annotations.media.Schema(name = "\uc774\ub984", description = "\uc0ac\uc6a9\uc790 \uc774\ub984")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable
    @io.swagger.v3.oas.annotations.media.Schema(name = "\uc5f0\ub77d\ucc98", description = "\uad6c\ubd84\uc790\ub85c \uc0ac\uc774\uc5d0 -\ub97c \uc785\ub825\ud574\uc8fc\uc138\uc694.")
    private final java.lang.String phone = null;
    
    @org.jetbrains.annotations.NotNull
    public final kr.weareboard.werewolf.domain.entity.user.dto.request.UserUpdateRequest copy(long id, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String phone) {
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
    
    public UserUpdateRequest(long id, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String phone) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPhone() {
        return null;
    }
}