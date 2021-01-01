// main function
fun main() {
    println(10.kuadrat())

    "Kotlin is Awesome!".printInteger()
}

fun Int.kuadrat(): Int {
    return this*this
}
fun String.printInteger(){
    print("$this")
}
