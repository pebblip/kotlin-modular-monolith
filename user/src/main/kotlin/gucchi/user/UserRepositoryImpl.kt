package gucchi.user;

internal class UserRepositoryImpl : UserRepository {

    private val users = mutableMapOf<Long, User>()

    override fun findById(id: Long): User? {
        return users[id];
    }

    override fun save(user: User): User {
        users.put(user.id, user)
        return user
    }  
}
