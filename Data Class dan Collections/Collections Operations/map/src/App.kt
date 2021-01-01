// main function
fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val multipliedBy5 = numberList.map { it * 5 }
    val multipliedBy2 = numberList.map {it*2}

    println(multipliedBy5)
    println(multipliedBy2)
}