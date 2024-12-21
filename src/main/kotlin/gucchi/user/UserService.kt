package gucchi.user;

class UserService(private val userRepository: UserRepository = UserRepositoryImpl()) {

    fun createUser(id: Long, name: String): User {
        val user = User(id, name)
        return userRepository.save(user)
    }

    fun getUser(id: Long): User? {
        return userRepository.findById(id)
    }
}
