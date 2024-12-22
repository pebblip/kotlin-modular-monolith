package gucchi.cli

import gucchi.user.UserService


fun main() {
    val userService = UserService()

    while (true) {
        print("> ")
        when (val input = readLine()?.split(" ") ?: continue) {
            listOf("exit") -> break
            else -> when (input[0]) {
                "add" -> input.getOrNull(1)?.toLongOrNull()?.let { id ->
                    input.drop(2).joinToString(" ").takeIf { it.isNotBlank() }?.let { name ->
                        println("added: ${userService.createUser(id, name)}")
                    }
                } 
                "get" -> input.getOrNull(1)?.toLongOrNull()?.let { id ->
                    println(userService.getUser(id)?.let { "Found: $it" } ?: "Not found")
                }
                else -> println("Commands: create <id> <name>, get <id>, exit")
            }
        }
    }
}
