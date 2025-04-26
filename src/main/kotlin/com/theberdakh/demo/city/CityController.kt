package com.theberdakh.demo.city

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CityController {

    @GetMapping("/cities")
    fun getCities(): List<City> {
        return CityList.getAllCities()
    }
}