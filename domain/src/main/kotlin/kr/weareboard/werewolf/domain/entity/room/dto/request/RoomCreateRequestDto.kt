package kr.weareboard.werewolf.domain.entity.room.dto.request

import kr.weareboard.werewolf.domain.entity.room.Room

data class RoomCreateRequestDto(
    val name: String = "방 제목",
    val description: String = "",
    val maxPlayer: Int = 8,
    val isPrivate: Boolean = false,
    val password: String = "",
) {
    fun toEntity(): Room = Room(
        name = name,
        description = description,
        maxPlayer = maxPlayer,
        isPrivate = isPrivate,
        password = password,
    )
}