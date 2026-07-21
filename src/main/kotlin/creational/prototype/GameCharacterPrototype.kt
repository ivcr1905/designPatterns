// PRACTICE:
// Creating fully configured RPG archetypes from scratch is repetitive and expensive.
// Clone a warrior or mage template, then customize the copy without touching the original.
// Be careful to deep-copy mutable collections like the skill list.
package creational.prototype

data class GameCharacter(
    var name: String,
    var level: Int,
    var health: Int,
    var skills: MutableList<String>
) {
    fun clone(): GameCharacter {
        TODO("Return a deep copy so cloned skill lists do not share references")
    }
}

fun main() {
    // 1. Create a template character
    // 2. Clone it and customize the clone
    // 3. Show that the original skills stay unchanged
    TODO()
}
