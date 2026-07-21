// PRACTICE:
// Starting movie mode touches lights, sound, projector, and streaming hardware in sequence.
// Hide that setup and teardown complexity behind two simple operations.
// Add more theater devices later without changing client code.
package structural.facade

class Projector {
    fun on() {
        TODO("Turn the projector on")
    }

    fun wideScreenMode() {
        TODO("Switch the projector into wide-screen mode")
    }

    fun off() {
        TODO("Turn the projector off")
    }
}

class SoundSystem {
    fun on() {
        TODO("Turn the sound system on")
    }

    fun setSurround() {
        TODO("Enable surround sound mode")
    }

    fun setVolume(level: Int) {
        TODO("Adjust the sound system volume")
    }

    fun off() {
        TODO("Turn the sound system off")
    }
}

class StreamingBox {
    fun on() {
        TODO("Power on the streaming box")
    }

    fun play(title: String) {
        TODO("Start playing the selected movie title")
    }

    fun stop() {
        TODO("Stop playback on the streaming box")
    }

    fun off() {
        TODO("Power off the streaming box")
    }
}

class Lights {
    fun dim(level: Int) {
        TODO("Dim the room lights to the requested level")
    }

    fun on() {
        TODO("Restore the room lights")
    }
}

class HomeTheaterFacade(
    private val projector: Projector,
    private val soundSystem: SoundSystem,
    private val streamingBox: StreamingBox,
    private val lights: Lights
) {
    fun watchMovie(title: String) {
        TODO("Coordinate all subsystems to start movie mode")
    }

    fun endMovie() {
        TODO("Coordinate all subsystems to shut movie mode down")
    }
}

fun main() {
    // 1. Build the facade with projector, sound, streaming, and lights
    // 2. Start movie mode for a chosen title
    // 3. End movie mode and restore the room
    TODO()
}
