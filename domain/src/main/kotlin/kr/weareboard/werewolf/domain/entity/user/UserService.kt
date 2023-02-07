package kr.weareboard.werewolf.domain.entity.user

import kr.weareboard.werewolf.common.jwt.dto.JwtToken
import kr.weareboard.werewolf.domain.entity.user.dto.request.RefreshTokenRequest
import kr.weareboard.werewolf.domain.entity.user.dto.request.UserUpdateRequest
import kr.weareboard.werewolf.domain.entity.user.dto.response.UserResponse

interface UserService {
    fun refreshToken(refreshTokenRequest: RefreshTokenRequest): JwtToken

    fun getUserById(id: Long): User

    fun getLoginUserInfo(): User

    fun getUserByUsername(username: String): User

    fun updateUser(userUpdateRequest: UserUpdateRequest): Long

    fun deleteUser(id: Long): Boolean

    fun kakaoLogout(): String
}