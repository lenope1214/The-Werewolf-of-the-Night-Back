package kr.weareboard.werewolf.domain.entity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\t\u0010\u0011\u001a\u00020\u0000H\u0096\u0002J\u0010\u0010\t\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\nX\u0092\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0006\"\u0004\b\u000f\u0010\bR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0092\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lkr/weareboard/werewolf/domain/entity/BaseEntity;", "", "()V", "createdAt", "Ljava/time/LocalDateTime;", "getCreatedAt", "()Ljava/time/LocalDateTime;", "setCreatedAt", "(Ljava/time/LocalDateTime;)V", "createdBy", "", "deletedAt", "deletedBy", "updatedAt", "getUpdatedAt", "setUpdatedAt", "updatedBy", "component1", "", "username", "isDeleted", "", "softDelete", "domain"})
@jakarta.persistence.EntityListeners(value = {org.springframework.data.jpa.domain.support.AuditingEntityListener.class})
@jakarta.persistence.MappedSuperclass
public class BaseEntity {
    @org.jetbrains.annotations.NotNull
    @org.springframework.data.annotation.CreatedDate
    private java.time.LocalDateTime createdAt;
    private java.lang.String createdBy;
    @org.jetbrains.annotations.NotNull
    @org.springframework.data.annotation.LastModifiedDate
    private java.time.LocalDateTime updatedAt;
    private java.lang.String updatedBy;
    private java.time.LocalDateTime deletedAt;
    private java.lang.String deletedBy;
    
    public BaseEntity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public java.time.LocalDateTime getCreatedAt() {
        return null;
    }
    
    public void setCreatedAt(@org.jetbrains.annotations.NotNull
    java.time.LocalDateTime p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public java.time.LocalDateTime getUpdatedAt() {
        return null;
    }
    
    public void setUpdatedAt(@org.jetbrains.annotations.NotNull
    java.time.LocalDateTime p0) {
    }
    
    public void createdBy(@org.jetbrains.annotations.NotNull
    java.lang.String username) {
    }
    
    public void updatedBy(@org.jetbrains.annotations.NotNull
    java.lang.String username) {
    }
    
    public void softDelete(@org.jetbrains.annotations.NotNull
    java.lang.String username) {
    }
    
    public boolean isDeleted() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public kr.weareboard.werewolf.domain.entity.BaseEntity component1() {
        return null;
    }
}