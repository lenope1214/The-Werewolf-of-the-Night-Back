package kr.weareboard.werewolf.domain.entity.user;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0006H&\u00a8\u0006\t"}, d2 = {"Lkr/weareboard/werewolf/domain/entity/user/UserRepository;", "Lorg/springframework/data/jpa/repository/JpaRepository;", "Lkr/weareboard/werewolf/domain/entity/user/User;", "", "findByEmail", "email", "", "findByUsername", "username", "domain"})
public abstract interface UserRepository extends org.springframework.data.jpa.repository.JpaRepository<kr.weareboard.werewolf.domain.entity.user.User, java.lang.Long> {
    
    @org.jetbrains.annotations.Nullable
    public abstract kr.weareboard.werewolf.domain.entity.user.User findByUsername(@org.jetbrains.annotations.NotNull
    java.lang.String username);
    
    @org.jetbrains.annotations.Nullable
    public abstract kr.weareboard.werewolf.domain.entity.user.User findByEmail(@org.jetbrains.annotations.NotNull
    java.lang.String email);
}