// PRACTICE:
// Your app wants one analytics interface, but vendor SDKs expose different APIs.
// Adapt multiple providers and fan one event out to all of them consistently.
// Add or remove analytics vendors later without touching feature code.
package structural.adapter

interface AnalyticsTracker {
    fun trackEvent(name: String, properties: Map<String, Any>)
}

class FirebaseAnalyticsSDK {
    fun logEvent(eventName: String, bundle: Map<String, Any>) {
        TODO("Pretend to send the event to Firebase")
    }
}

class MixpanelSDK {
    fun track(event: String, props: Map<String, Any>) {
        TODO("Pretend to send the event to Mixpanel")
    }
}

class FirebaseAnalyticsAdapter(private val sdk: FirebaseAnalyticsSDK) : AnalyticsTracker {
    override fun trackEvent(name: String, properties: Map<String, Any>) {
        TODO("Translate the common event into the Firebase SDK call")
    }
}

class MixpanelAnalyticsAdapter(private val sdk: MixpanelSDK) : AnalyticsTracker {
    override fun trackEvent(name: String, properties: Map<String, Any>) {
        TODO("Translate the common event into the Mixpanel SDK call")
    }
}

class CompositeAnalyticsTracker(private val trackers: List<AnalyticsTracker>) : AnalyticsTracker {
    override fun trackEvent(name: String, properties: Map<String, Any>) {
        TODO("Forward the event to every configured analytics tracker")
    }
}

fun main() {
    // 1. Wrap Firebase and Mixpanel with adapters
    // 2. Combine them in a composite tracker
    // 3. Publish a shared event through the unified interface
    TODO()
}
