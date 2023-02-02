package kr.weareboard.werewolf.common.exception.auth

import kr.weareboard.werewolf.common.exception.UnauthorizedException

class OnlyDepartmentException : UnauthorizedException("부서 관리자만 가능합니다.")