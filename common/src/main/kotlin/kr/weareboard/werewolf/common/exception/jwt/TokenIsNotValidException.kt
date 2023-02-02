package kr.weareboard.werewolf.common.exception.jwt

import kr.weareboard.werewolf.common.exception.BasicException

class TokenIsNotValidException : BasicException(400, "토큰정보가 비정상입니다.")
