package kr.weareboard.werewolf

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["kr.weareboard.werewolf"])
class ApiApplication

fun main(args: Array<String>) {
    runApplication<ApiApplication>(*args)
}