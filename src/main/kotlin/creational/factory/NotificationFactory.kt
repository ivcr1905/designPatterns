// PRACTICE:
// A product sends messages through email, SMS, and push notifications.
// Centralize creation so callers depend only on a shared notification interface.
// Add more channels later without changing the sending workflow.
package creational.factory

enum class NotificationChannel {
    EMAIL,
    SMS,
    PUSH
}

interface Notification {
    fun send(message: String)
}

class EmailNotification : Notification {
    override fun send(message: String) {
        TODO("Send the message through an email provider")
    }
}

class SmsNotification : Notification {
    override fun send(message: String) {
        TODO("Send the message through an SMS provider")
    }
}

class PushNotification : Notification {
    override fun send(message: String) {
        TODO("Send the message through a push notification provider")
    }
}

object NotificationFactory {
    fun create(type: NotificationChannel): Notification {
        TODO("Return the correct Notification implementation for the channel")
    }
}

fun main() {
    // 1. Choose each notification channel
    // 2. Create notifications through the factory
    // 3. Send a sample message with each implementation
    TODO()
}
