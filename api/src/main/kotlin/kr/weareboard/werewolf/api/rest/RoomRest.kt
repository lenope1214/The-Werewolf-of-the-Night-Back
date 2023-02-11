package kr.weareboard.werewolf.api.rest

import io.swagger.v3.oas.annotations.Operation
import kr.co.jsol.core.paging.PageRequest
import kr.weareboard.werewolf.domain.entity.room.RoomService
import kr.weareboard.werewolf.domain.entity.room.dto.request.RoomCreateRequestDto
import kr.weareboard.werewolf.domain.entity.room.dto.request.RoomSearchCondition
import kr.weareboard.werewolf.domain.entity.room.dto.response.RoomResponseDto
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1")
class RoomRest(
    private val roomService: RoomService,
) {

    @Operation(
        summary = "방 생성"
    )
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    fun createRoom(@RequestBody request: RoomCreateRequestDto): Long {
        return roomService.saveRoom(request)
    }

    @Operation(
        summary = "방 리스트 조회"
    )
    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("")
    fun getAll(
        searchCondition: RoomSearchCondition,
        pageRequest: PageRequest,
    ): List<RoomResponseDto> {
        val pageable = pageRequest.of()
        return roomService.findAll(searchCondition, pageable)
    }
}