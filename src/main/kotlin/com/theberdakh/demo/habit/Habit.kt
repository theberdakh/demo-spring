package com.theberdakh.demo.habit

import jakarta.persistence.*

@Entity
@Table(name = "habits")
 data class Habit(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long =0,
    val name: String,
) {
     constructor() : this(0L, "")
 }
