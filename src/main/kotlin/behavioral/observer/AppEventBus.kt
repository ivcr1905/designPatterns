// PRACTICE:
// An app emits multiple event types, and listeners should receive only relevant events.
// Build a type-safe event bus that supports many listeners per event type.
// Add more event classes later without rewriting dispatch logic.
package behavioral.observer

import kotlin.reflect.KClass

sealed class AppEvent

data class UserLoggedIn(val userId: String) : AppEvent()
data class OrderPlaced(val orderId: String, val amount: Double) : AppEvent()
data class PaymentFailed(val orderId: String, val reason: String) : AppEvent()

class EventBus {
    private val listeners = mutableMapOf<KClass<out AppEvent>, MutableList<(AppEvent) -> Unit>>()

    fun <T : AppEvent> subscribe(eventType: KClass<T>, listener: (T) -> Unit) {
        TODO("Register the listener under the requested event type")
    }

    fun publish(event: AppEvent) {
        TODO("Dispatch the event to every listener subscribed to its type")
    }
}

fun main() {
    // 1. Subscribe listeners for login, order, and payment-failed events
    // 2. Publish one instance of each AppEvent subtype
    // 3. Observe that only matching listeners should run
    TODO()
}
