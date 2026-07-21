// PRACTICE:
// A smart home remote should trigger single actions, grouped scenes, and scheduled routines.
// Model device operations as commands with undo support and macro execution.
// Program remote slots with reusable home-automation scenes.
package behavioral.command

class Light(private val room: String) {
    fun turnOn(level: Int = 100) {
        TODO("Turn on the light for the room at the requested brightness")
    }

    fun turnOff() {
        TODO("Turn off the light for the room")
    }
}

class Thermostat {
    fun setTemperature(value: Int) {
        TODO("Set the thermostat to the requested temperature")
    }

    fun currentTemperature(): Int {
        TODO("Return the current thermostat temperature")
    }
}

class Door {
    fun lock() {
        TODO("Lock the door")
    }

    fun unlock() {
        TODO("Unlock the door")
    }
}

class TurnOnLightCommand(
    private val light: Light,
    private val level: Int = 100
) : Command {
    override fun execute() {
        TODO("Turn on the light receiver")
    }

    override fun undo() {
        TODO("Undo the light-on action")
    }
}

class TurnOffLightCommand(private val light: Light) : Command {
    override fun execute() {
        TODO("Turn off the light receiver")
    }

    override fun undo() {
        TODO("Undo the light-off action")
    }
}

class SetThermostatCommand(
    private val thermostat: Thermostat,
    private val target: Int
) : Command {
    private var previous: Int = 0

    override fun execute() {
        TODO("Capture the old temperature and set the new target")
    }

    override fun undo() {
        TODO("Restore the previous thermostat temperature")
    }
}

class LockDoorCommand(private val door: Door) : Command {
    override fun execute() {
        TODO("Lock the door receiver")
    }

    override fun undo() {
        TODO("Undo the door lock action")
    }
}

class MacroCommand(private val commands: List<Command>) : Command {
    override fun execute() {
        TODO("Execute all child commands in order")
    }

    override fun undo() {
        TODO("Undo all child commands in reverse order")
    }
}

class RemoteControl(slotCount: Int) {
    private val slots = MutableList<Command?>(slotCount) { null }
    private val undoHistory = mutableListOf<Command>()

    fun programSlot(index: Int, command: Command) {
        TODO("Assign a command to the requested remote slot")
    }

    fun pressSlot(index: Int) {
        TODO("Execute the command currently assigned to the slot")
    }

    fun undoLast() {
        TODO("Undo the most recently executed remote command")
    }
}

class CommandScheduler {
    private val queue = mutableListOf<Command>()

    fun schedule(command: Command) {
        TODO("Add a command to the scheduler queue")
    }

    fun runAll() {
        TODO("Execute every scheduled command in order")
    }
}

fun main() {
    // 1. Create lights, thermostat, and door receivers
    // 2. Program remote slots with single commands and a macro scene
    // 3. Schedule commands and practice undoing the latest action
    TODO()
}
