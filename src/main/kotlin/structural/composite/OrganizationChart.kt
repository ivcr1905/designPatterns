// PRACTICE:
// An org chart should treat managers and contributors as one employee hierarchy.
// Recursively compute salary budget and headcount while printing readable structure.
// Add more employee roles later without changing reporting code.
package structural.composite

abstract class Employee(
    protected val name: String,
    protected val salary: Double
) {
    abstract fun getSalaryBudget(): Double
    abstract fun getHeadCount(): Int
    abstract fun printHierarchy(indent: String)
}

class IndividualContributor(name: String, salary: Double) : Employee(name, salary) {
    override fun getSalaryBudget(): Double {
        TODO("Return the salary budget for a single contributor")
    }

    override fun getHeadCount(): Int {
        TODO("Return the headcount for a single contributor")
    }

    override fun printHierarchy(indent: String) {
        TODO("Print the contributor entry with indentation")
    }
}

class Manager(name: String, salary: Double) : Employee(name, salary) {
    private val reports = mutableListOf<Employee>()

    fun addReport(employee: Employee): Manager {
        TODO("Add a direct report and return this manager")
    }

    override fun getSalaryBudget(): Double {
        TODO("Return this manager salary plus all nested report salaries")
    }

    override fun getHeadCount(): Int {
        TODO("Return this manager plus all nested reports")
    }

    override fun printHierarchy(indent: String) {
        TODO("Print this manager and recursively print reports")
    }
}

fun main() {
    // 1. Build a hierarchy with a manager and several reports
    // 2. Print the hierarchy from the top
    // 3. Calculate total budget and headcount recursively
    TODO()
}
