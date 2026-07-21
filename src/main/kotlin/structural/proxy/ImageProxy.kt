// PRACTICE:
// High-resolution images are expensive to load, but users may never open all of them.
// Lazy-load the real image only on first display while keeping one public interface.
// Reuse the loaded object on later calls instead of loading from disk again.
package structural.proxy

interface Image {
    fun display()
}

class RealImage(private val filename: String) : Image {
    override fun display() {
        TODO("Load or display the real image data")
    }
}

class ImageProxy(private val filename: String) : Image {
    private var realImage: RealImage? = null

    override fun display() {
        TODO("Create the RealImage lazily and delegate display calls to it")
    }
}

fun main() {
    // 1. Create image proxies for a gallery
    // 2. Display one image multiple times
    // 3. Observe that loading should happen only on first access
    TODO()
}
