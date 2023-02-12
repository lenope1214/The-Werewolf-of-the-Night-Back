package kr.weareboard.werewolf.domain.entity.user.dto.response

import io.swagger.v3.oas.annotations.media.Schema
import kr.weareboard.werewolf.domain.entity.user.User

data class UserRefererResponse(
    @Schema(description = "기본키")
    val id: Long,

    @Schema(description = "사용자 이름")
    val name: String,

)