package kr.co.jsol.core.util

import java.time.LocalDateTime

fun LocalDateTime.removeTime(): LocalDateTime {
    return this.withHour(0).withMinute(0).withSecond(0).withNano(0)
}