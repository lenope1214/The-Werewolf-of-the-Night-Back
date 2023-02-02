package kr.weareboard.werewolf.common.exception.entities.user

import kr.weareboard.werewolf.common.exception.BasicException

class UserDepartmentInfoNotExist : BasicException(400, "사용자의 부서 정보가 지정되어있지 않습니다.")