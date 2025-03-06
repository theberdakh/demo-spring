package com.theberdakh.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    @GetMapping("/greeting")
    fun greeting(): Greeting {
        return Greeting(1L, "Greeting")
    }
}