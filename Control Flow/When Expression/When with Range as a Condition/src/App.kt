// main function
fun main() {
    val value =  27
    val ranges = 10..50
    val value2 = 100
    val ranges2 = 100..150

    when(value){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }

    when (value2){
        in ranges2 -> println("value is in the range")
        !in ranges2 -> println("value is outside the range")
        else -> println("value undefined")
    }
}