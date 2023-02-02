package kr.weareboard.werewolf.common.exception.auth

import kr.weareboard.werewolf.common.exception.UnauthorizedException

class OnlyClientException : UnauthorizedException("거래처 관리자만 가능합니다.")