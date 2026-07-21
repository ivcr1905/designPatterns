// PRACTICE:
// Investors watch stock tickers and react when prices cross personal targets.
// Notify only subscribed investors whenever the market updates a followed stock.
// Let each investor keep its own strategy while sharing the same market feed.
package behavioral.observer

enum class InvestorStrategy {
    BUY_BELOW,
    SELL_ABOVE
}

interface StockObserver {
    fun update(stock: String, price: Double)
}

interface Subject {
    fun subscribe(stock: String, observer: StockObserver)
    fun unsubscribe(stock: String, observer: StockObserver)
    fun notifyObservers(stock: String, price: Double)
}

class StockMarket : Subject {
    private val subscriptions = mutableMapOf<String, MutableList<StockObserver>>()

    override fun subscribe(stock: String, observer: StockObserver) {
        TODO("Register an observer for the given stock symbol")
    }

    override fun unsubscribe(stock: String, observer: StockObserver) {
        TODO("Remove an observer from the given stock symbol")
    }

    override fun notifyObservers(stock: String, price: Double) {
        TODO("Notify all observers currently subscribed to the stock")
    }

    fun updatePrice(stock: String, price: Double) {
        TODO("Store or announce the new price and notify observers")
    }
}

class Investor(
    private val name: String,
    private val targetPrice: Double,
    private val strategy: InvestorStrategy
) : StockObserver {
    override fun update(stock: String, price: Double) {
        TODO("Decide how this investor reacts to the stock price update")
    }
}

fun main() {
    // 1. Create a stock market and a few investors
    // 2. Subscribe investors to different symbols
    // 3. Publish price changes and observe who gets notified
    TODO()
}
