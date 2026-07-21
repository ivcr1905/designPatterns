// PRACTICE:
// Different datasets may need different sorting approaches at runtime.
// Swap between bubble sort, quick sort, and merge sort without changing the client.
// Choose strategies based on data size, stability, or readability needs.
package behavioral.strategy

interface SortStrategy {
    fun sort(list: MutableList<Int>)
}

class BubbleSort : SortStrategy {
    override fun sort(list: MutableList<Int>) {
        TODO("Sort the list using the bubble sort approach")
    }
}

class QuickSort : SortStrategy {
    override fun sort(list: MutableList<Int>) {
        TODO("Sort the list using the quick sort approach")
    }
}

class MergeSort : SortStrategy {
    override fun sort(list: MutableList<Int>) {
        TODO("Sort the list using the merge sort approach")
    }
}

class Sorter(private var strategy: SortStrategy) {
    fun setStrategy(strategy: SortStrategy) {
        TODO("Replace the current sorting strategy")
    }

    fun sort(list: MutableList<Int>): MutableList<Int> {
        TODO("Delegate sorting to the active strategy and return the list")
    }
}

fun main() {
    // 1. Create a list of unsorted numbers
    // 2. Sort it with different strategies by swapping the sorter strategy
    // 3. Compare the outputs while keeping the client code unchanged
    TODO()
}
