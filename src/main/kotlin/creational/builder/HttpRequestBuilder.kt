// PRACTICE:
// Building HTTP requests with optional headers, bodies, and timeouts gets messy quickly.
// Guide callers through a readable step-by-step builder with sane defaults.
// Add more request options later without exploding constructor parameters.
package creational.builder

data class HttpRequest(
    val url: String,
    val method: String,
    val headers: Map<String, String>,
    val body: String?,
    val timeout: Int
) {
    class Builder {
        private var url: String = ""
        private var method: String = "GET"
        private val headers = mutableMapOf<String, String>()
        private var body: String? = null
        private var timeout: Int = 30

        fun url(value: String): Builder {
            TODO("Store the request URL and return the builder")
        }

        fun method(value: String): Builder {
            TODO("Store the HTTP method and return the builder")
        }

        fun header(key: String, value: String): Builder {
            TODO("Add a header entry and return the builder")
        }

        fun body(value: String): Builder {
            TODO("Store the request body and return the builder")
        }

        fun timeout(value: Int): Builder {
            TODO("Store the timeout in seconds and return the builder")
        }

        fun build(): HttpRequest {
            TODO("Validate required fields and create the HttpRequest")
        }
    }
}

fun main() {
    // 1. Build a simple GET request
    // 2. Build a POST request with headers, body, and timeout
    // 3. Print the final request objects to inspect the builder output
    TODO()
}
