package gucchi.service

import gucchi.user.User as UserCore
import gucchi.user.UserService as UserSericeCore

data class UserDTO(val id: Long, val name: String)

class UserService() {

    val userService: UserSericeCore = UserSericeCore()

    fun createUser(id: Long, name: String): UserDTO {
        val user = userService.createUser(id, name)
        return UserDTO(user.id, user.name)
    }

    fun getUser(id: Long): UserDTO? {
        val user = userService.getUser(id)
        return user?.let { UserDTO(it.id, it.name) }
    }
}
