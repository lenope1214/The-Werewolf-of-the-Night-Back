package kr.weareboard.werewolf.domain.entity.user.dto.response

import com.fasterxml.jackson.annotation.JsonInclude
import io.swagger.v3.oas.annotations.media.Schema
import kr.weareboard.werewolf.domain.entity.user.User
import kr.weareboard.werewolf.domain.entity.user.enum.UserRoleType

data class UserResponse(
    @Schema(description = "기본키")
    val id: Long,

//    @field:Schema(name = "사용자 아이디")
//    val username: String,

    @Schema(description = "사용자 이름")
    val name: String,

    @Schema(description = "사용자 권한")
    val role: UserRoleType = UserRoleType.ROLE_USER,

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Schema(description = "사용자 처음 로그인 여부, true라면 비밀번호 변경 필요")
    val isFirst: Boolean? = null,

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Schema(description = "사용자 비밀번호 변경 유무, true라면 비밀번호 변경 필요")
    val changePassword: Boolean? = null,

//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    @field:Schema(name = "사용자가 읽지(확인하지) 않은 LP Id 리스트")
//    var newLpIds: List<LpSummaryResponse> = listOf(),
)