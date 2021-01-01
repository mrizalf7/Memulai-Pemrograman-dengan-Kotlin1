import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start new job!")
    }

    job.start()
    println("job is joining")
    delay(2000)
    job.cancel()
    println("Cancelling job...")
    if (job.isCancelled){
        println("Job is cancelled")
    }

}