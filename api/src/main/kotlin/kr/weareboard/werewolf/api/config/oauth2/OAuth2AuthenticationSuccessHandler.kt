package kr.weareboard.werewolf.api.config.oauth2

import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import kr.weareboard.werewolf.common.jwt.JwtTokenProvider
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.security.oauth2.core.user.OAuth2User
import org.springframework.security.core.Authentication
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler
import org.springframework.stereotype.Component
import org.springframework.web.util.UriComponentsBuilder
import java.io.IOException

@Component
class OAuth2AuthenticationSuccessHandler : SimpleUrlAuthenticationSuccessHandler() {
    @Autowired
    var jwtTokenUtil: JwtTokenProvider? = null

    @Value("\${spring.profiles.active:local}")
    private val profiles: String? = null

    @Throws(IOException::class)
    override fun onAuthenticationSuccess(
        request: HttpServletRequest,
        response: HttpServletResponse,
        authentication: Authentication
    ) {

//        logger.info("onAuthenticationSuccess")

//        login 성공한 사용자 목록.
        val oAuth2User = authentication.principal as OAuth2User
        val kakao_account = oAuth2User.attributes["kakao_account"] as Map<String, Any>?
        val email = kakao_account!!["email"] as String?
        val properties = oAuth2User.attributes["properties"] as Map<String, Any>?
        val nickname = properties!!["nickname"] as String?
        val jwt = jwtTokenUtil!!.generateTokenForOAuth("kakao", email!!, nickname!!)
//        logger.info { "jwt : $jwt" }
        val url = makeRedirectUrl(jwt)
//        logger.info("url: $url")
        if (response.isCommitted) {
            logger.debug("응답이 이미 커밋된 상태입니다.")
            return
        }
//        response.addHeader("Authorization", jwt)
        redirectStrategy.sendRedirect(request, response, url)
    }

    private fun makeRedirectUrl(token: String): String {
        // url은 프론트 주소로 반환한다. dns 적용 후 변경예정 ?
//        logger.info { "profiles : $profiles" }

//        val local ="http://localhost:5173/oauth2/redirect?token=$token"
        val local = "http://localhost:3000/kakaoLogin?token=$token"

        val dev = "http://localhost:3000/kakaoLogin?token=$token"
//        val prod = "http://localhost:3000/kakaoLogin?token=$token"
        val prod = "https://plz-front-highjoon.vercel.app/kakaoLogin?token=$token"
        val url: String? = profiles?.let {
            when (it) {
                "local" -> local
                "dev" -> dev
                else -> prod
            }
        }
//        return UriComponentsBuilder.fromUriString("/oauth2/redirect/$token")
//        return UriComponentsBuilder.fromUriString("http://localhost:5173/oauth2/redirect/$token")
//        return UriComponentsBuilder.fromUriString(url ?: "/oauth2/redirect/$token")
//            .build().toUriString()

        return UriComponentsBuilder.fromUriString(url ?: prod)
            .build().toUriString()
    }
}