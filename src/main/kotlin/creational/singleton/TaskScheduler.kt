// PRACTICE:
// A background scheduler should be shared across the whole app.
// Make singleton access thread-safe while keeping prioritized tasks.
// Leave room for retries, delayed jobs, or queue inspection later.
package creational.singleton

data class ScheduledTask(val name: String, val priority: Int)

class TaskScheduler private constructor() {
    private val queue = mutableListOf<ScheduledTask>()

    fun addTask(name: String, priority: Int) {
        TODO("Create a ScheduledTask and add it to the internal queue")
    }

    fun runNext(): ScheduledTask? {
        TODO("Pick and remove the highest-priority task from the queue")
    }

    fun showQueue(): List<ScheduledTask> {
        TODO("Return tasks ordered the same way they would be executed")
    }

    companion object {
        @Volatile
        private var instance: TaskScheduler? = null

        fun getInstance(): TaskScheduler {
            TODO("Implement double-checked locking for the singleton instance")
        }
    }
}

fun main() {
    // 1. Obtain the scheduler twice
    // 2. Add several tasks with different priorities
    // 3. Show the queue, run tasks, and verify the same instance is reused
    TODO()
}
