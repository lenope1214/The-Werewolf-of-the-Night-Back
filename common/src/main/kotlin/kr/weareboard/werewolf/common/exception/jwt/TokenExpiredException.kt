package kr.weareboard.werewolf.common.exception.jwt

import kr.weareboard.werewolf.common.exception.BasicException

class TokenExpiredException : BasicException(401, "로그인 세션이 만료되었습니다.")
