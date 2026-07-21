// PRACTICE:
// Files and folders should behave uniformly when printing a tree or calculating size.
// Treat individual files and nested directories through one shared component interface.
// Extend the model later with permissions or timestamps without breaking recursion.
package structural.composite

interface FileSystemItem {
    fun getSize(): Long
    fun print(indent: String)
}

class File(
    private val name: String,
    private val size: Long
) : FileSystemItem {
    override fun getSize(): Long {
        TODO("Return the size of this file")
    }

    override fun print(indent: String) {
        TODO("Print a single file entry with the provided indentation")
    }
}

class Folder(private val name: String) : FileSystemItem {
    private val children = mutableListOf<FileSystemItem>()

    fun add(item: FileSystemItem): Folder {
        TODO("Add a child item and return this folder for chaining")
    }

    override fun getSize(): Long {
        TODO("Return the total size of all nested children")
    }

    override fun print(indent: String) {
        TODO("Print the folder and recursively print its children")
    }
}

fun main() {
    // 1. Create files and nested folders
    // 2. Add them into a composite tree
    // 3. Print the structure and total size through the shared interface
    TODO()
}
