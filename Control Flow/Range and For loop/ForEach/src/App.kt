// main function
fun main() {
    val ranges = 1.rangeTo(10) step 3

    ranges.forEach { value ->
        println("value is $value!")
    }
    val jarak = 5.rangeTo(25) step 5

    jarak.forEach{value->
    println("Value is $value")}
}