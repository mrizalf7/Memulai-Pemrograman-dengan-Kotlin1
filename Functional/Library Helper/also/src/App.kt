// main function
fun main() {
    val text = "Hello Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $text")

    val test = "Rizal F"
    println(test.length)
}