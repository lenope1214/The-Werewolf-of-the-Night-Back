package kr.weareboard.werewolf.domain.entity.user

import jakarta.persistence.LockModeType
import kr.weareboard.werewolf.domain.entity.user.dto.request.*
import kr.weareboard.werewolf.domain.entity.user.dto.response.UserResponse
import kr.weareboard.werewolf.domain.entity.util.findByIdOrThrow
import kr.weareboard.werewolf.common.exception.UnauthorizedException
import kr.weareboard.werewolf.common.exception.entities.user.UserAlreadyExistUserException
import kr.weareboard.werewolf.common.jwt.JwtTokenProvider
import kr.weareboard.werewolf.common.jwt.dto.JwtToken
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.data.jpa.repository.Lock
import org.springframework.security.authentication.*
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import org.springframework.security.authentication.AuthenticationManager

@Service
class UserService(
    private val jwtTokenProvider: JwtTokenProvider,
    private val authenticationManager: AuthenticationManager,
    private val userRepository: UserRepository,
    private val userQueryRepository: UserQueryRepository,
    private val passwordEncoder: PasswordEncoder,
) {

    @Value("\${auth.kakao.key.admin}")
    private lateinit var adminKey: String

    @Value("\${auth.kakao.logout.redirect.url}")
    private lateinit var kakaoLogoutRedirectUrl: String

    fun refreshToken(refreshTokenRequest: RefreshTokenRequest): JwtToken {
        val userPk = jwtTokenProvider.getUserPk(refreshTokenRequest.refreshToken)
        return JwtToken(jwtTokenProvider.createAccessToken(userPk), jwtTokenProvider.createRefreshToken(userPk))
    }

//    fun login(loginRequest: LoginRequest): LoginResponse {
//        val user: User = userQueryRepository.findByUsername(loginRequest.username)
//            ?: throw BasicException(403, "로그인 실패하셨습니다.")
//
//        try {
// //            log.info("username : ${user.username}\npassword : ${loginRequest.password}")
//            authenticationManager.authenticate(
//                UsernamePasswordAuthenticationToken(
//                    user.username,
//                    loginRequest.password
//                )
//            )
//
//            user.login()
// //            log.info("user : ${user.username} is logged in")
//            userRepository.save(user)
//        } catch (e: AuthenticationException) {
//            e.printStackTrace()
//            throw BasicException(403, "로그인 실패하셨습니다.")
//        } catch (e: LockedException) {
//            throw BasicException(403, "계정이 잠겨 있습니다.")
//        } catch (e: DisabledException) {
//            throw BasicException(403, "계정이 비활성화 상태입니다.")
//        } catch (e: CredentialsExpiredException) {
//            throw BasicException(403, "비밀번호가 만료 되었습니다.")
//        } catch (e: AccountExpiredException) {
//            throw BasicException(403, "계정이 만료되었습니다.")
//        }
//
//        return LoginResponse(
//            username = user.username,
// //            laundryId = user.getLaundry()?.id,
// //            laundryName = user.getLaundry()?.name,
// //            clientId = user.getClient()?.id,
// //            clientName = user.getClient()?.name,
// //            departmentId = user.getDepartment()?.id,
// //            departmentName = user.getDepartment()?.name,
//            userId = user.id!!,
//            name = user.name,
//            role = user.role,
//            accessToken = jwtTokenProvider.createAccessToken(user.username),
//            refreshToken = jwtTokenProvider.createRefreshToken(user.username),
//        )
//    }

    fun isExistUser(username: String) {
        try {
            getUserByUsername(username)
            // exception이 throw 되지 않았다면 존재하므로 에러 throw
            throw UserAlreadyExistUserException()
        } catch (ignore: IllegalArgumentException) {
            // throw 되면 존재 하지 않으므로 정상 처리.
        }
    }

//    fun createUser(userCreateRequest: UserCreateRequest): UserResponse {
//
//        val encryptPassword = passwordEncoder.encode(userCreateRequest.password)
//        userCreateRequest.encryptedPassword = encryptPassword
//
//        isExistUser(userCreateRequest.username)
//
//        val user = User(
//            username = userCreateRequest.username,
//            password = encryptPassword,
//            name = userCreateRequest.name,
//            role = userCreateRequest.role,
//            phone = userCreateRequest.phone,
//            email = userCreateRequest.email,
//        )
//
//        try {
//            val loginUser = getAccountFromSecurityContext()
//            user.createdBy(loginUser.username)
// //            if (loginUser.getLaundry() != null && loginUser.getLaundry()?.id != null) user.updateLaundry(loginUser.getLaundry()!!)
//        } catch (ignore: Exception) {
//            log.error("사용자 등록 - 세탁소 정보 지정 중 에러발생!")
//            ignore.printStackTrace()
//        }
//
//        try {
//            val loginUser = getAccountFromSecurityContext()
// //            if (loginUser.getClient() != null && loginUser.getClient()?.id != null) user.updateClient(loginUser.getClient()!!)
//        } catch (ignore: Exception) {
//            log.error("사용자 등록 - 거래처 정보 지정 중 에러발생!")
//            ignore.printStackTrace()
//        }
//
//        userRepository.save(user)
//        return UserResponse.of(user)
//    }

    fun getUserById(id: Long): User {
        return userRepository.findByIdOrThrow(id, "사용자를 찾을 수 없습니다.")
    }

    fun getMyInfo(): UserResponse {
        val loginUser = getAccountFromSecurityContext()
//        val newLpList = lpQueryRepository.findMyNewLpList(loginUser.id!!)
        return UserResponse.of(loginUser)
    }

    fun updateUser(userUpdateRequest: UserUpdateRequest): UserResponse {
        val loginUser = getAccountFromSecurityContext()

        val user = getUserById(userUpdateRequest.id)

//        val laundryId = loginUser.getLaundry()?.id
//        val clientId = loginUser.getClient()?.id
//        val departmentId = loginUser.getDepartment()?.id
//        if (!loginUser.beAbleRole(laundryId, clientId, departmentId)) throw ForbiddenException()

        user.updateInfo(userUpdateRequest)

        userRepository.save(user)

        user.updatedBy(loginUser.username)

        return UserResponse.of(user)
    }

    @Lock(value = LockModeType.PESSIMISTIC_WRITE) // 읽기 쓰기 모두 불가능하도록 LOCK 걸기
    fun deleteUser(id: Long): Boolean {
        val user = getUserById(id)

        val loginUser = getAccountFromSecurityContext()

        user.softDelete(loginUser.username)

        userRepository.save(user)

        return user.isDeleted()
    }

    fun changePassword(putPasswordRequest: PutPasswordRequest): Boolean {
        val loginUser = getAccountFromSecurityContext()

        val user = getUserByUsername(putPasswordRequest.username)

//        val laundryId = loginUser.getLaundry()?.id
//        val clientId = loginUser.getClient()?.id
//        val departmentId = loginUser.getDepartment()?.id
//        if (!loginUser.beAbleRole(laundryId, clientId, departmentId)) throw ForbiddenException()

        val encryptPassword = passwordEncoder.encode(putPasswordRequest.password)
        user.changePassword(encryptPassword)

        userRepository.save(user)

        return true
    }

    fun getUserByUsername(username: String): User {
        return userRepository.findByUsername(username)
            ?: throw IllegalArgumentException("사용자를 찾을 수 없습니다.")
    }

    fun kakaoLogout(): String {
        val loginUser: User = getAccountFromSecurityContext()
        log.info("카카오 로그아웃 - $adminKey,${loginUser.providerId!!}")

        val logoutUrl: String = "https://kapi.kakao.com/v1/user/logout"

        val client: HttpClient = HttpClient.newBuilder().build()
        val request: HttpRequest = HttpRequest.newBuilder()
            .uri(URI.create("$logoutUrl?target_id_type=user_id&target_id=${loginUser.providerId!!}"))
            .setHeader("Authorization", "KakaoAK $adminKey")
            .POST(HttpRequest.BodyPublishers.ofString(""))
            .build()

        log.info("request : $request")
        request.headers().map().forEach { (key, value) -> log.info("key : $key, value : $value") }

        val response = client.send(request, HttpResponse.BodyHandlers.ofString())
        log.info("${response.body()[0]} 유저 로그아웃")
        return "success"
//        return response.body()
//        val url = URL("")
//
//        val postData = ""
//
//        val conn = url.openConnection()
//        conn.doOutput = true
//        conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
//        conn.setRequestProperty("Content-Length", postData.length.toString())
//
//        DataOutputStream(conn.getOutputStream()).use { it.writeBytes(postData) }
//        BufferedReader(InputStreamReader(conn.getInputStream())).use { bf ->
//            var line: String?
//            while (bf.readLine().also { line = it } != null) {
//                println(line)
//            }
//        }
    }

    companion object {
        val log: Logger = LoggerFactory.getLogger(this::class.java)

        fun getAccountFromSecurityContext(): User {
            val authentication = SecurityContextHolder.getContext().authentication
            log.info("authentication : $authentication")
            val principal = authentication.principal
            log.info("principal : $principal")
            if (principal == "anonymousUser") throw UnauthorizedException("계정이 확인되지 않습니다. 다시 로그인 해주세요.")
            return principal as User
        }
    }
}