package kr.weareboard.werewolf.common.exception.entities.user

import kr.weareboard.werewolf.common.exception.BasicException

class UserClientInfoNotExist : BasicException(400, "사용자의 거래처 정보가 지정되어있지 않습니다.")