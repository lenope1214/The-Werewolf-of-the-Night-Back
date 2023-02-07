package kr.weareboard.werewolf.domain.entity.room

import kr.weareboard.werewolf.domain.entity.room.dto.request.RoomCreateRequestDto
import kr.weareboard.werewolf.domain.entity.room.dto.response.RoomResponseDto
import kr.weareboard.werewolf.domain.entity.user.UserRepository
import org.springframework.stereotype.Service

@Service
class RoomService(
    private val roomRepository: RoomRepository,
    private val roomQueryRepository: RoomQueryRepository,
    private val userRepository: UserRepository,
) {

    // save room
    fun saveRoom(roomCreateResponseDto: RoomCreateRequestDto): Long {
        val room = roomCreateResponseDto.toEntity()
        return roomRepository.save(room).id!!
    }

    // find room by id
    fun findRoomById(id: Long): RoomResponseDto? {
        return roomQueryRepository.findById(id)
    }

    // find room list by name contains
    fun findRoomListByNameContains(name: String): List<RoomResponseDto> {
        return roomQueryRepository.findByNameContains(name)
    }
}