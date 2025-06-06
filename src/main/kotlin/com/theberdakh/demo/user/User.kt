package com.theberdakh.demo.user

import jakarta.persistence.*

@Entity
@Table(name = "users")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    val name: String = "",
    val phone: String = "",
    val password: String = "",
    val telegram: String = ""
)
