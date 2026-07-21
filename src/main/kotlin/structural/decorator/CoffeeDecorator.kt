// PRACTICE:
// A coffee order starts simple, but customers can add toppings in any combination.
// Layer add-ons so description and price are built dynamically without conditionals.
// Add more extras later by wrapping the base drink instead of rewriting it.
package structural.decorator

interface Coffee {
    fun description(): String
    fun cost(): Double
}

class Espresso : Coffee {
    override fun description(): String {
        TODO("Return the base coffee description")
    }

    override fun cost(): Double {
        TODO("Return the base coffee price")
    }
}

abstract class CoffeeDecorator(protected val wrapped: Coffee) : Coffee

class MilkDecorator(wrapped: Coffee) : CoffeeDecorator(wrapped) {
    override fun description(): String {
        TODO("Append milk to the wrapped coffee description")
    }

    override fun cost(): Double {
        TODO("Add the milk surcharge to the wrapped coffee cost")
    }
}

class CaramelDecorator(wrapped: Coffee) : CoffeeDecorator(wrapped) {
    override fun description(): String {
        TODO("Append caramel to the wrapped coffee description")
    }

    override fun cost(): Double {
        TODO("Add the caramel surcharge to the wrapped coffee cost")
    }
}

class WhippedCreamDecorator(wrapped: Coffee) : CoffeeDecorator(wrapped) {
    override fun description(): String {
        TODO("Append whipped cream to the wrapped coffee description")
    }

    override fun cost(): Double {
        TODO("Add the whipped cream surcharge to the wrapped coffee cost")
    }
}

fun main() {
    // 1. Create a plain espresso
    // 2. Wrap it with multiple decorators in different orders
    // 3. Print the final description and total cost
    TODO()
}
