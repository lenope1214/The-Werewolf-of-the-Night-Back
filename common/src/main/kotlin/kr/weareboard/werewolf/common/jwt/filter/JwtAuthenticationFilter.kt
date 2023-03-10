package kr.weareboard.werewolf.common.jwt.filter

import io.jsonwebtoken.ExpiredJwtException
import io.jsonwebtoken.MalformedJwtException
import io.jsonwebtoken.UnsupportedJwtException
import io.jsonwebtoken.io.IOException
import io.jsonwebtoken.security.SecurityException
import kr.weareboard.werewolf.common.jwt.JwtTokenProvider
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.stereotype.Component
import org.springframework.web.filter.OncePerRequestFilter
import jakarta.servlet.FilterChain
import jakarta.servlet.ServletException
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse

@Component
class JwtAuthenticationFilter(private val jwtTokenProvider: JwtTokenProvider) : OncePerRequestFilter() {

    val log: Logger = LoggerFactory.getLogger(this.javaClass)

    @Throws(
        IOException::class,
        ServletException::class,
        SecurityException::class,
        MalformedJwtException::class,
        ExpiredJwtException::class,
        UnsupportedJwtException::class,
        IllegalArgumentException::class,
    )
    override fun doFilterInternal(request: HttpServletRequest, response: HttpServletResponse, chain: FilterChain) {
        val res: HttpServletResponse = response as HttpServletResponse
        res.setHeader("Access-Control-Allow-Origin", "*")
        res.setHeader("Access-Control-Allow-Methods", "*")
        res.setHeader("Access-Control-Max-Age", "3600")
        res.setHeader(
            "Access-Control-Allow-Headers",
            "Origin, Content-Type, Accept, Authorization"
        )

        val token: String? = jwtTokenProvider.resolveToken((request as HttpServletRequest))

//        val path = request.requestURI

//        log.info("token.isNullOrBlank() : ${token.isNullOrBlank()}")
//        log.info("validPaths.isNotEmpty() : ${validPaths.isNotEmpty()}")
//        log.info("validPaths.contains(path) : ${validPaths.contains(path)}\nvalidPaths : $validPaths")

        if (!token.isNullOrBlank() &&
            // ?????? ?????? ?????? ?????? ????????? ?????? ???????????? validPaths ???????????? ???????????? ?????? ?????????.
//            && validPaths.isNotEmpty()
//            // ?????? ????????? ????????? ????????? ???????????? ?????????, ?????? ?????? o
//            // ?????? ????????? ????????? ????????? ?????????????????? ????????? ?????? ?????? x
//            && validPaths.contains(path)
            // ????????? ?????? ????????? ????????????
            jwtTokenProvider.validateToken(token)
        ) {
//            log.info("[${request.method}] ${path}?${request.queryString} -: ?????? ?????? ?????? ??????")
            val authentication = jwtTokenProvider.getAuthentication(token)
            SecurityContextHolder.getContext().authentication = authentication
        }

        chain.doFilter(request, response)
    }
}
