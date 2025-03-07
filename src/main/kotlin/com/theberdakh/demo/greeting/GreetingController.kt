package com.theberdakh.demo.greeting

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    @GetMapping("/greeting")
    fun greeting(): Greeting {
        return Greeting(1L, "Greeting")
    }

    @GetMapping("/me")
    fun me(): Greeting {
        return Greeting(1L, "Berdakh Tlepov")
    }
}