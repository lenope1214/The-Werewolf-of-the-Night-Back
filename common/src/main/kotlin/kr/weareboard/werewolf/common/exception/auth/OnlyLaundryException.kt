package kr.weareboard.werewolf.common.exception.auth

import kr.weareboard.werewolf.common.exception.UnauthorizedException

class OnlyLaundryException : UnauthorizedException("세탁소 관리자만 가능합니다.")