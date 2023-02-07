package kr.weareboard.werewolf.api.rest

import io.swagger.v3.oas.annotations.Operation
import kr.weareboard.werewolf.domain.entity.room.RoomService
import kr.weareboard.werewolf.domain.entity.room.dto.request.RoomCreateRequestDto
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
}