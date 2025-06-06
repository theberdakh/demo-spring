package com.theberdakh.demo.user

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(@Autowired private val userRepository: UserRepository) {

    @GetMapping
    fun getAllUsers(): List<User> = userRepository.findAll().toList()

    @PostMapping
    fun createUser(@RequestBody user: User): ResponseEntity<User> {
        val newUser = userRepository.save(user)
        return ResponseEntity(newUser, HttpStatus.CREATED)
    }

    @DeleteMapping
    fun deleteUsers() : ResponseEntity<String>{
        return try {
            val count = userRepository.count()
            if (count>0){
                userRepository.deleteAll()
                ResponseEntity("All users deleted", HttpStatus.OK)
            } else {
                ResponseEntity("No users found", HttpStatus.NO_CONTENT)
            }
        } catch (e: Exception){
            ResponseEntity("Error happened: ${e.message}", HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @GetMapping("/test")
    fun test() = "Working"

}