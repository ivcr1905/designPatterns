// PRACTICE:
// A user API should enforce auth and place checks in front of a real service.
// Add cross-cutting behavior in a proxy without changing the underlying service.
// Extend the proxy later with caching or rate limits while keeping one interface.
package structural.proxy

interface UserService {
    fun getUser(id: String): String
    fun updateUser(id: String, data: String): String
}

class RealUserService : UserService {
    override fun getUser(id: String): String {
        TODO("Fetch a user record from the underlying system")
    }

    override fun updateUser(id: String, data: String): String {
        TODO("Update a user record in the underlying system")
    }
}

class SecureApiProxy(
    private val service: UserService,
    private val authToken: String?
) : UserService {
    override fun getUser(id: String): String {
        TODO("Authorize the request and then delegate user retrieval")
    }

    override fun updateUser(id: String, data: String): String {
        TODO("Authorize the request and then delegate user updates")
    }
}

fun main() {
    // 1. Wrap the real service in the secure proxy
    // 2. Attempt reads and updates with a token
    // 3. Observe how the proxy can allow or reject calls before delegation
    TODO()
}
