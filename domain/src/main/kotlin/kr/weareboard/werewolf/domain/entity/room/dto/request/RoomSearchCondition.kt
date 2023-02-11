package kr.weareboard.werewolf.domain.entity.room.dto.request

import kr.weareboard.werewolf.common.BaseCondition

data class RoomSearchCondition(
    val name: String = "",
) : BaseCondition()