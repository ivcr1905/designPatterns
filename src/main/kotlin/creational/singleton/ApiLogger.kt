// PRACTICE:
// A mobile app needs one shared logger for all outgoing API calls.
// Guarantee every feature gets the same logger instance.
// Store timestamp, URL, and status code for each request.
package creational.singleton

object ApiLogger {
    private val logs = mutableListOf<String>()

    fun log(url: String, statusCode: Int) {
        TODO("Store a formatted entry with timestamp, url, and statusCode")
    }

    fun getLogs(): List<String> {
        TODO("Return an immutable snapshot of the collected logs")
    }
}

class AuthRepository {
    fun login() {
        TODO("Use ApiLogger to record a successful login API call")
    }
}

class FeedRepository {
    fun fetchFeed() {
        TODO("Use ApiLogger to record a feed fetch API call")
    }
}

fun main() {
    // 1. Trigger login and fetchFeed
    // 2. Print all logs from ApiLogger
    // 3. Prove both repositories share the same singleton
    TODO()
}
