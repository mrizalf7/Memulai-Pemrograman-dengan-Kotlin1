// main function

fun main() {

    val message = buildString {
        append("Hello ")
        append("from ")
        append("lambda ")
        append("kotlin")
    }
    println(message)
}

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}