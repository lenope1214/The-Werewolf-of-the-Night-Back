package kr.weareboard.werewolf.api.rest

import io.swagger.v3.oas.annotations.Operation
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/test")
class TestRest {
    
    @ResponseStatus(HttpStatus.OK)
    @Operation(
        summary = "테스트"
    )
    @GetMapping("")
    fun test001(): String{
        return "hi"
    }
}