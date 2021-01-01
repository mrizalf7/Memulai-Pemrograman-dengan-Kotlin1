import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val dispatcher = newSingleThreadContext("myThread")
    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(3000)
        println("Resuming in ${Thread.currentThread().name}")
    }
}