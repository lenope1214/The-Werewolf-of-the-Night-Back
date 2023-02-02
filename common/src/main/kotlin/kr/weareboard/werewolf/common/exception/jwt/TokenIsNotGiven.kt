package kr.weareboard.werewolf.common.exception.jwt

import kr.weareboard.werewolf.common.exception.BasicException

class TokenIsNotGiven(name: String) : BasicException(400, name + "토큰이 넘어오지 않았습니다.")
