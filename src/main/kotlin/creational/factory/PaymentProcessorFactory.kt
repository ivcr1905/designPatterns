// PRACTICE:
// Checkout supports card, PayPal, and crypto payment processors.
// Hide construction details while each processor keeps its own rules.
// Add more payment methods later without changing checkout orchestration.
package creational.factory

enum class PaymentMethod {
    CREDIT_CARD,
    PAYPAL,
    CRYPTO
}

interface PaymentProcessor {
    fun validate(amount: Double): Boolean
    fun process(amount: Double): String
}

class CreditCardProcessor : PaymentProcessor {
    override fun validate(amount: Double): Boolean {
        TODO("Validate card payment rules for the amount")
    }

    override fun process(amount: Double): String {
        TODO("Process a credit card payment and return a status message")
    }
}

class PayPalProcessor : PaymentProcessor {
    override fun validate(amount: Double): Boolean {
        TODO("Validate PayPal payment rules for the amount")
    }

    override fun process(amount: Double): String {
        TODO("Process a PayPal payment and return a status message")
    }
}

class CryptoProcessor : PaymentProcessor {
    override fun validate(amount: Double): Boolean {
        TODO("Validate crypto payment rules for the amount")
    }

    override fun process(amount: Double): String {
        TODO("Process a crypto payment and return a status message")
    }
}

object PaymentProcessorFactory {
    fun create(method: PaymentMethod): PaymentProcessor {
        TODO("Return the processor that matches the requested payment method")
    }
}

fun main() {
    // 1. Pick a payment method
    // 2. Create a processor through the factory
    // 3. Validate and process a sample payment
    TODO()
}
