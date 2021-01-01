// main function
fun main() {
    printMessage("Hello From Lambda")
    p("Kotlin")
}

val printMessage = { message: String -> println(message) }
val p = {m:String -> println(m)}