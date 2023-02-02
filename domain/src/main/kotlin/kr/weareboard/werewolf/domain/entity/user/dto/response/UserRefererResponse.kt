package kr.weareboard.werewolf.domain.entity.user.dto.response

import io.swagger.v3.oas.annotations.media.Schema
import kr.weareboard.werewolf.domain.entity.user.User

data class UserRefererResponse(
    @field:Schema(name = "기본키")
    val id: Long,

    @field:Schema(name = "사용자 이름")
    val name: String,

) {
    companion object {
        fun of(
            user: User
        ): UserRefererResponse {
            return UserRefererResponse(
                id = user.id!!,
                name = user.name,
            )
        }
    }
}