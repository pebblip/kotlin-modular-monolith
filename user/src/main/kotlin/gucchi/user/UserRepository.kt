package gucchi.user

interface UserRepository {
    fun findById(id: Long): User?
    fun save(user: User): User
}
