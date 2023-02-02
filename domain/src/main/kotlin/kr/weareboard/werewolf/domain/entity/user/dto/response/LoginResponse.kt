package kr.weareboard.werewolf.domain.entity.user.dto.response

import kr.weareboard.werewolf.domain.entity.user.enum.UserRoleType
import kr.weareboard.werewolf.common.jwt.dto.JwtToken

data class LoginResponse(
    val username: String,

//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    val laundryId: Long? = null,
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    val laundryName: String? = null,
//
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    val clientId: Long? = null,
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    val clientName: String? = null,
//
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    val departmentId: Long? = null,
//    @JsonInclude(JsonInclude.Include.NON_NULL)
//    val departmentName: String? = null,

    val userId: Long,
    val name: String,
    val role: UserRoleType,
    override val accessToken: String,
    override val refreshToken: String,
) : JwtToken(accessToken, refreshToken)
