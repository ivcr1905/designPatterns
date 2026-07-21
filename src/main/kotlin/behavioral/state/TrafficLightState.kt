// PRACTICE:
// A traffic light cycles through fixed states, and each state knows its own timing.
// Move transition logic out of the context and into dedicated state objects.
// Add more signals later, such as blinking mode, without rewriting the context.
package behavioral.state

interface TrafficLightState {
    fun display()
    fun duration(): Int
    fun nextState(): TrafficLightState
}

class RedState : TrafficLightState {
    override fun display() {
        TODO("Describe or render the red light state")
    }

    override fun duration(): Int {
        TODO("Return how long the red state lasts")
    }

    override fun nextState(): TrafficLightState {
        TODO("Return the next state after red")
    }
}

class GreenState : TrafficLightState {
    override fun display() {
        TODO("Describe or render the green light state")
    }

    override fun duration(): Int {
        TODO("Return how long the green state lasts")
    }

    override fun nextState(): TrafficLightState {
        TODO("Return the next state after green")
    }
}

class YellowState : TrafficLightState {
    override fun display() {
        TODO("Describe or render the yellow light state")
    }

    override fun duration(): Int {
        TODO("Return how long the yellow state lasts")
    }

    override fun nextState(): TrafficLightState {
        TODO("Return the next state after yellow")
    }
}

class TrafficLight(private var currentState: TrafficLightState = RedState()) {
    fun cycle() {
        TODO("Display the current state, use its duration, and advance to the next state")
    }
}

fun main() {
    // 1. Create a traffic light context
    // 2. Cycle through several transitions
    // 3. Observe that each state controls its own next step and duration
    TODO()
}
