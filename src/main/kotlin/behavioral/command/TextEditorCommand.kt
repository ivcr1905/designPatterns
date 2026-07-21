// PRACTICE:
// A text editor should treat typing, deleting, and formatting as undoable actions.
// Encapsulate each operation as a command while supporting undo and redo stacks.
// Clear redo history whenever a brand-new command is executed.
package behavioral.command

interface Command {
    fun execute()
    fun undo()
}

class TextEditor {
    fun append(text: String) {
        TODO("Append text to the editor content")
    }

    fun removeLast(count: Int) {
        TODO("Remove the requested number of trailing characters")
    }

    fun deleteLastWord(): String {
        TODO("Delete and return the last word from the editor content")
    }

    fun restoreWord(word: String) {
        TODO("Restore a previously deleted word")
    }

    fun setBold(enabled: Boolean) {
        TODO("Toggle bold formatting state")
    }

    fun snapshot(): String {
        TODO("Return a string representation of the current editor state")
    }
}

class TypeTextCommand(
    private val editor: TextEditor,
    private val text: String
) : Command {
    override fun execute() {
        TODO("Append the stored text through the editor receiver")
    }

    override fun undo() {
        TODO("Undo the typed text by removing it from the editor")
    }
}

class DeleteLastWordCommand(private val editor: TextEditor) : Command {
    private var deletedWord: String = ""

    override fun execute() {
        TODO("Delete the last word and remember it for undo")
    }

    override fun undo() {
        TODO("Restore the previously deleted word")
    }
}

class SetBoldCommand(
    private val editor: TextEditor,
    private val enabled: Boolean
) : Command {
    private var previousState: Boolean = false

    override fun execute() {
        TODO("Capture the previous bold state and apply the new one")
    }

    override fun undo() {
        TODO("Restore the previous bold state")
    }
}

class EditorHistory {
    private val undoStack = mutableListOf<Command>()
    private val redoStack = mutableListOf<Command>()

    fun execute(command: Command) {
        TODO("Run a command, push it to undo history, and clear redo history")
    }

    fun undo() {
        TODO("Undo the latest command and move it to redo history")
    }

    fun redo() {
        TODO("Redo the latest undone command and move it back to undo history")
    }
}

fun main() {
    // 1. Create an editor and command history
    // 2. Execute typing, formatting, and delete commands
    // 3. Undo and redo commands while inspecting editor snapshots
    TODO()
}
