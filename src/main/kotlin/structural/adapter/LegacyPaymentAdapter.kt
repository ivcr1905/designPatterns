// PRACTICE:
// Your code expects a modern payment gateway, but a third-party SDK uses a legacy API.
// Wrap the SDK so the rest of the app talks to one clean charging interface.
// Keep conversion details hidden and leave the SDK unmodified.
package structural.adapter

interface PaymentGateway {
    fun charge(amount: Double, currency: String)
}

// Pretend this is a third-party SDK you cannot modify.
class LegacyPaymentSDK {
    fun makePayment(amountInCents: Int) {
        TODO("Forward the payment to the external SDK entry point")
    }
}

class LegacyPaymentAdapter(private val sdk: LegacyPaymentSDK) : PaymentGateway {
    override fun charge(amount: Double, currency: String) {
        TODO("Convert the amount and delegate the charge to LegacyPaymentSDK")
    }
}

fun main() {
    // 1. Create the adapter around the legacy SDK
    // 2. Charge a payment through the PaymentGateway interface
    // 3. Confirm callers never touch the SDK-specific API directly
    TODO()
}
