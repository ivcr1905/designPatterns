// PRACTICE:
// CSV and JSON parsing share the same high-level workflow but differ in details.
// Define one parsing skeleton while letting subclasses customize header and rows.
// Add more formats later without duplicating the workflow.
package behavioral.templatemethod

abstract class DataParser(private val source: String) {
    fun parse() {
        TODO("Call openFile, parseHeader, parseRows, and closeFile in order")
    }

    protected fun openFile() {
        TODO("Open or prepare the source data")
    }

    abstract fun parseHeader()

    abstract fun parseRows()

    protected fun closeFile() {
        TODO("Close or clean up the source data")
    }
}

class CsvDataParser(source: String) : DataParser(source) {
    override fun parseHeader() {
        TODO("Parse the CSV header row")
    }

    override fun parseRows() {
        TODO("Parse the CSV data rows")
    }
}

class JsonDataParser(source: String) : DataParser(source) {
    override fun parseHeader() {
        TODO("Interpret the JSON structure as a header schema")
    }

    override fun parseRows() {
        TODO("Parse JSON records from the source")
    }
}

fun main() {
    // 1. Create a CSV parser and a JSON parser
    // 2. Invoke parse() on both instances
    // 3. Observe how the shared algorithm would call different subclass steps
    TODO()
}
