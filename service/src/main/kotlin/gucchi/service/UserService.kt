package gucchi.service

import gucchi.user.User
import gucchi.user.UserService as UserSericeCore

class UserService() {

    val userService: UserSericeCore = UserSericeCore()

    fun createUser(id: Long, name: String): User {
        return userService.createUser(id, name)
    }

    fun getUser(id: Long): User? {
        return userService.getUser(id)
    }
}
