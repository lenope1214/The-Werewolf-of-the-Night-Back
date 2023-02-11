package kr.weareboard.werewolf.common

import kr.co.jsol.core.util.removeTime
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDateTime

open class BaseCondition(
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    val startDate: LocalDateTime? = LocalDateTime.now().minusMonths(1).removeTime(),
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    val endDate: LocalDateTime? = LocalDateTime.now().plusDays(1).removeTime(),
)