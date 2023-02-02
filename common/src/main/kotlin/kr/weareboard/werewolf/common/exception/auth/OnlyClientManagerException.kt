package kr.weareboard.werewolf.common.exception.auth

import kr.weareboard.werewolf.common.exception.UnauthorizedException

class OnlyClientManagerException : UnauthorizedException("거래처, 부서 관리자만 가능합니다.")