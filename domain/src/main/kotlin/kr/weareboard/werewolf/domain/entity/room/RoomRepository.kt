package kr.weareboard.werewolf.domain.entity.room

import org.springframework.data.jpa.repository.JpaRepository

interface RoomRepository : JpaRepository<Room, Long> {
//    fun findByUsernameAndDeletedAtIsNull(username: String): User?
}