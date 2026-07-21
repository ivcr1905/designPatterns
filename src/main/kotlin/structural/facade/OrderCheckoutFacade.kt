// PRACTICE:
// Checkout spans inventory, reservation, payment, invoicing, and shipping services.
// Expose one simple checkout call while handling orchestration and failure cleanup.
// Add more backend services later without leaking details into controllers.
package structural.facade

data class OrderItem(val sku: String, val quantity: Int)
data class PaymentInfo(val method: String, val shouldFail: Boolean)
data class OrderConfirmation(val orderId: String, val invoiceId: String, val shipmentId: String, val status: String)

class InventoryService {
    fun checkAvailability(items: List<OrderItem>): Boolean {
        TODO("Validate that all requested items are available")
    }
}

class StockReservationService {
    fun reserve(orderId: String, items: List<OrderItem>): Boolean {
        TODO("Reserve stock for the requested order")
    }

    fun release(orderId: String) {
        TODO("Release any stock reserved for the order")
    }
}

class PaymentService {
    fun process(orderId: String, paymentInfo: PaymentInfo): Boolean {
        TODO("Process payment for the order")
    }
}

class InvoiceService {
    fun generate(orderId: String): String {
        TODO("Generate an invoice identifier for the order")
    }
}

class ShippingService {
    fun dispatch(orderId: String, items: List<OrderItem>): String {
        TODO("Create shipment details for the order")
    }
}

class CheckoutFacade(
    private val inventoryService: InventoryService,
    private val reservationService: StockReservationService,
    private val paymentService: PaymentService,
    private val invoiceService: InvoiceService,
    private val shippingService: ShippingService
) {
    fun checkout(orderId: String, items: List<OrderItem>, paymentInfo: PaymentInfo): OrderConfirmation? {
        TODO("Orchestrate inventory, reservation, payment, invoice, and shipping steps")
    }
}

fun main() {
    // 1. Create the checkout facade with all subsystem services
    // 2. Attempt a successful checkout
    // 3. Try a failure path and release stock if payment fails
    TODO()
}
