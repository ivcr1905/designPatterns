// PRACTICE:
// A vending machine changes behavior depending on selection, payment, dispensing, or stock state.
// Model valid and invalid actions per state without giant conditional blocks.
// Extend the machine later with refunds or more products while keeping state logic focused.
package behavioral.state

interface VendingMachineState {
    fun selectItem(item: String)
    fun insertCoin(amount: Int)
    fun cancelTransaction()
    fun dispense()
}

class IdleState(private val machine: VendingMachine) : VendingMachineState {
    override fun selectItem(item: String) {
        TODO("Handle item selection when the machine is idle")
    }

    override fun insertCoin(amount: Int) {
        TODO("Reject or defer coins until an item is selected")
    }

    override fun cancelTransaction() {
        TODO("Handle cancel attempts while idle")
    }

    override fun dispense() {
        TODO("Prevent dispensing while no item is selected")
    }
}

class ItemSelectedState(private val machine: VendingMachine) : VendingMachineState {
    override fun selectItem(item: String) {
        TODO("Handle reselection or replacement of the chosen item")
    }

    override fun insertCoin(amount: Int) {
        TODO("Accept the first payment toward the selected item")
    }

    override fun cancelTransaction() {
        TODO("Cancel the item selection and reset the machine")
    }

    override fun dispense() {
        TODO("Prevent dispensing until enough money has been inserted")
    }
}

class PaymentPendingState(private val machine: VendingMachine) : VendingMachineState {
    override fun selectItem(item: String) {
        TODO("Handle selection changes while payment is in progress")
    }

    override fun insertCoin(amount: Int) {
        TODO("Accept additional payment toward the selected item")
    }

    override fun cancelTransaction() {
        TODO("Refund the inserted amount and reset the machine")
    }

    override fun dispense() {
        TODO("Dispense only if the inserted amount covers the selected item")
    }
}

class DispensingState(private val machine: VendingMachine) : VendingMachineState {
    override fun selectItem(item: String) {
        TODO("Reject new selections during dispensing")
    }

    override fun insertCoin(amount: Int) {
        TODO("Reject coins while the machine is dispensing")
    }

    override fun cancelTransaction() {
        TODO("Reject cancellation once dispensing has started")
    }

    override fun dispense() {
        TODO("Release the selected item and finalize the transaction")
    }
}

class OutOfStockState(private val machine: VendingMachine) : VendingMachineState {
    override fun selectItem(item: String) {
        TODO("Handle item selection when stock is unavailable")
    }

    override fun insertCoin(amount: Int) {
        TODO("Reject payment when the machine is out of stock")
    }

    override fun cancelTransaction() {
        TODO("Handle cancellation while out of stock")
    }

    override fun dispense() {
        TODO("Prevent dispensing while out of stock")
    }
}

class VendingMachine(val inventory: MutableMap<String, Pair<Int, Int>>) {
    var state: VendingMachineState = IdleState(this)
    var selectedItem: String? = null
    var insertedCoins: Int = 0

    fun selectItem(item: String) {
        TODO("Delegate item selection to the current state")
    }

    fun insertCoin(amount: Int) {
        TODO("Delegate coin insertion to the current state")
    }

    fun cancelTransaction() {
        TODO("Delegate cancellation to the current state")
    }

    fun dispense() {
        TODO("Delegate dispensing to the current state")
    }
}

fun main() {
    // 1. Create a vending machine with inventory and prices
    // 2. Walk through selection, payment, cancellation, and dispense flows
    // 3. Observe how behavior changes as the machine state changes
    TODO()
}
