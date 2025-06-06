package com.theberdakh.demo.user

import org.springframework.data.repository.CrudRepository

interface UserRepository: CrudRepository<User, Long> {

}