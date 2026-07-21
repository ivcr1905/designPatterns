// PRACTICE:
// A data pipeline should optionally compress, encrypt, and log around a base stream.
// Stack decorators so each layer adds behavior while preserving one stream interface.
// Change the wrapping order to explore how encoded output would differ.
package structural.decorator

interface DataStream {
    fun write(data: String): String
    fun read(encoded: String): String
}

class FileDataStream : DataStream {
    override fun write(data: String): String {
        TODO("Write raw data to the underlying file stream representation")
    }

    override fun read(encoded: String): String {
        TODO("Read raw data from the underlying file stream representation")
    }
}

abstract class DataStreamDecorator(protected val stream: DataStream) : DataStream

class CompressionDecorator(stream: DataStream) : DataStreamDecorator(stream) {
    override fun write(data: String): String {
        TODO("Compress data before delegating to the wrapped stream")
    }

    override fun read(encoded: String): String {
        TODO("Read from the wrapped stream and then decompress the result")
    }
}

class EncryptionDecorator(stream: DataStream) : DataStreamDecorator(stream) {
    override fun write(data: String): String {
        TODO("Encrypt data before delegating to the wrapped stream")
    }

    override fun read(encoded: String): String {
        TODO("Read from the wrapped stream and then decrypt the result")
    }
}

class LoggingDecorator(stream: DataStream) : DataStreamDecorator(stream) {
    override fun write(data: String): String {
        TODO("Log the write operation before or after delegating")
    }

    override fun read(encoded: String): String {
        TODO("Log the read operation before or after delegating")
    }
}

fun main() {
    // 1. Wrap a FileDataStream with compression, encryption, and logging
    // 2. Write sample data through the decorated stream
    // 3. Read it back and compare the encoded and decoded values
    TODO()
}
