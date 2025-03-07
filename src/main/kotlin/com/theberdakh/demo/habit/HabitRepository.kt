package com.theberdakh.demo.habit

import org.springframework.data.jpa.repository.JpaRepository

interface HabitRepository: JpaRepository<Habit, Long>{

}