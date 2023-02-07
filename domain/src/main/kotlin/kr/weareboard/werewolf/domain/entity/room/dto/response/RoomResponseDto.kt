package kr.weareboard.werewolf.domain.entity.room.dto.response

import com.querydsl.core.annotations.QueryProjection
import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "방 정보")
class RoomResponseDto @QueryProjection constructor(
    @Schema(description = "방 ID", example = "1")
    val roomId: Long,

    @Schema(description = "방 이름", example = "방 이름")
    val name: String,

    @Schema(description = "방 설명", example = "방 설명")
    val description: String,

    @Schema(description = "방 최대 인원", example = "10")
    val maxPlayer: Int,

    @Schema(description = "게임 시작 여부", example = "false")
    val isStarted: Boolean,

    @Schema(description = "게임 종료 여부", example = "false")
    val isFinished: Boolean,

    @Schema(description = "방 삭제 여부", example = "false")
    val isDeleted: Boolean,

    @Schema(description = "방 비공개 여부", example = "false")
    val isPrivate: Boolean,

    @Schema(description = "방장 ID", example = "1")
    val ownerId: Long,

    @Schema(description = "방장 이름", example = "방장 이름")
    val ownerName: String,

    @Schema(description = "방 현재 인원", example = "5")
    val currentCount: Int,
)