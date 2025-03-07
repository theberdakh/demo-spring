package com.theberdakh.demo.habit

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/habits")
class HabitController(val habitRepository: HabitRepository) {

    @GetMapping
    fun getHabits() : List<Habit> = habitRepository.findAll()

    @PostMapping
    fun addHabit(@RequestBody habit: Habit) = habitRepository.save(habit)

    @GetMapping("/test")
    fun createTestHabit(): Habit {
        val testHabit = Habit(name = "Morning Jog")
        return habitRepository.save(testHabit)
    }

    @GetMapping("/test2")
    fun createTestHabit2(): Habit {
        val testHabit = Habit(name = "Morning Jog2")
        return habitRepository.save(testHabit)
    }

}