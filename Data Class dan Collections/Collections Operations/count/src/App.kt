// main function
fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println(numberList.count())
    println(numberList.count { it % 3 == 0 })
    println(numberList.count{it ==1})
}