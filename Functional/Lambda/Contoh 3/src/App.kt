// main function
fun main() {
    printResult(10)
}

fun printResult(valu: Int) {
    val result = sum(valu)
    println(result)
}



val sum: (Int) -> Int = { value -> value + value*2 }