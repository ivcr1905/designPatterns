// PRACTICE:
// Infrastructure provisioning should support AWS or GCP without cloud-specific branching.
// Create matching storage and compute resources from one cloud family at a time.
// Extend the setup later with more services while staying cloud-agnostic.
package creational.abstractfactory

interface CloudFactory {
    fun createStorage(): CloudStorage
    fun createComputeInstance(): ComputeInstance
}

interface CloudStorage {
    fun upload(fileName: String)
}

interface ComputeInstance {
    fun start()
}

class AwsFactory : CloudFactory {
    override fun createStorage(): CloudStorage {
        TODO("Create the AWS storage implementation")
    }

    override fun createComputeInstance(): ComputeInstance {
        TODO("Create the AWS compute implementation")
    }
}

class GcpFactory : CloudFactory {
    override fun createStorage(): CloudStorage {
        TODO("Create the GCP storage implementation")
    }

    override fun createComputeInstance(): ComputeInstance {
        TODO("Create the GCP compute implementation")
    }
}

class AwsStorage : CloudStorage {
    override fun upload(fileName: String) {
        TODO("Upload a file using AWS storage semantics")
    }
}

class AwsComputeInstance : ComputeInstance {
    override fun start() {
        TODO("Start an AWS compute instance")
    }
}

class GcpStorage : CloudStorage {
    override fun upload(fileName: String) {
        TODO("Upload a file using GCP storage semantics")
    }
}

class GcpComputeInstance : ComputeInstance {
    override fun start() {
        TODO("Start a GCP compute instance")
    }
}

fun main() {
    // 1. Choose AWS or GCP factory
    // 2. Create matching storage and compute resources
    // 3. Upload a file and start the instance through the abstract interfaces
    TODO()
}
