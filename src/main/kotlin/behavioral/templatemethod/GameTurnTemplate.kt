// PRACTICE:
// Each turn in a strategy game follows the same skeleton, but player types plan differently.
// Keep common turn flow while letting human and AI players customize decisions.
// Override only the parts that truly vary, such as attack planning or hooks.
package behavioral.templatemethod

abstract class GameTurn(private val name: String) {
    fun takeTurn() {
        TODO("Run the template steps for one full game turn")
    }

    abstract fun buildUnits()

    abstract fun planAttack()

    open fun executeAttack() {
        TODO("Provide the default attack execution hook")
    }
}

class HumanPlayer : GameTurn("Human Player") {
    override fun buildUnits() {
        TODO("Let the human player choose units to build")
    }

    override fun planAttack() {
        TODO("Let the human player decide how to attack")
    }
}

class AggressiveAIPlayer : GameTurn("Aggressive AI") {
    override fun buildUnits() {
        TODO("Build units for an aggressive AI strategy")
    }

    override fun planAttack() {
        TODO("Plan an aggressive attack route")
    }

    override fun executeAttack() {
        TODO("Override the default hook with an aggressive attack style")
    }
}

class DefensiveAIPlayer : GameTurn("Defensive AI") {
    override fun buildUnits() {
        TODO("Build units for a defensive AI strategy")
    }

    override fun planAttack() {
        TODO("Plan a cautious or defensive attack response")
    }
}

fun main() {
    // 1. Create a human, aggressive AI, and defensive AI player
    // 2. Call takeTurn() on each player
    // 3. Compare which template steps stay the same and which vary
    TODO()
}
