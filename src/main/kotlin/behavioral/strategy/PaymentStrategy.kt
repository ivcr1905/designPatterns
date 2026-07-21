// PRACTICE:
// A shopping cart should switch payment behavior based on the user's checkout choice.
// Swap card, PayPal, and crypto logic while keeping cart code unchanged.
// Let each strategy own its own validation and payment details.
package behavioral.strategy

interface PaymentStrategy {
    fun validate(): Boolean
    fun pay(amount: Double): String
}

class CreditCardStrategy(
    private val cardNumber: String,
    private val cvv: String
) : PaymentStrategy {
    override fun validate(): Boolean {
        TODO("Validate the card details before payment")
    }

    override fun pay(amount: Double): String {
        TODO("Process a credit card payment and return a result message")
    }
}

class PayPalStrategy(private val email: String) : PaymentStrategy {
    override fun validate(): Boolean {
        TODO("Validate the PayPal account information")
    }

    override fun pay(amount: Double): String {
        TODO("Process a PayPal payment and return a result message")
    }
}

class CryptoStrategy(private val walletAddress: String) : PaymentStrategy {
    override fun validate(): Boolean {
        TODO("Validate the crypto wallet information")
    }

    override fun pay(amount: Double): String {
        TODO("Process a crypto payment and return a result message")
    }
}

class ShoppingCart {
    private val items = mutableListOf<Pair<String, Double>>()
    private var paymentStrategy: PaymentStrategy? = null

    fun addItem(name: String, price: Double): ShoppingCart {
        TODO("Add an item to the cart and return the cart for chaining")
    }

    fun setPaymentStrategy(strategy: PaymentStrategy): ShoppingCart {
        TODO("Store the selected payment strategy and return the cart")
    }

    fun checkout(): String {
        TODO("Validate the strategy, total the cart, and delegate payment")
    }
}

fun main() {
    // 1. Add items to the shopping cart
    // 2. Choose a payment strategy at checkout time
    // 3. Run checkout with different strategies without changing cart logic
    TODO()
}
