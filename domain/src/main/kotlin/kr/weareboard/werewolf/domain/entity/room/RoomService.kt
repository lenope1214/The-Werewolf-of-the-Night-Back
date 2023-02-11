package kr.weareboard.werewolf.domain.entity.room

import kr.weareboard.werewolf.domain.entity.room.dto.request.RoomCreateRequestDto
import kr.weareboard.werewolf.domain.entity.room.dto.request.RoomSearchCondition
import kr.weareboard.werewolf.domain.entity.room.dto.response.RoomResponseDto
import kr.weareboard.werewolf.domain.entity.user.UserRepository
import kr.weareboard.werewolf.domain.entity.user.UserService
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class RoomService(
    private val roomRepository: RoomRepository,
    private val roomQueryRepository: RoomQueryRepository,
    private val userRepository: UserRepository,
    private val userService: UserService,
) {

    // save room
    fun saveRoom(roomCreateResponseDto: RoomCreateRequestDto): Long {
        val loginUser = userService.getLoginUserInfo()

        val room = roomCreateResponseDto.toEntity()
        room.create(loginUser.username)

        return roomRepository.save(room).id!!
    }

    // find room by id
    fun findRoomById(id: Long): RoomResponseDto? {
        return roomQueryRepository.findById(id)
    }

    // find room list by name contains
    fun findAll(
        searchCondition: RoomSearchCondition,
        pageable: Pageable = Pageable.unpaged(),
    ): List<RoomResponseDto> {
        return roomQueryRepository.findAll(searchCondition, pageable)
    }


}