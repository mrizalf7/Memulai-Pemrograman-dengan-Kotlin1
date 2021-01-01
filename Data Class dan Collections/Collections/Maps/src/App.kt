fun main(){
    val total = listOf(1, 2, 3, 4, 5, 6)

val result1 = total.take(5)
    println(result1)
val result2 = result1.takeLast(4)
    println(result2)
val result3 = result2.drop(1)
    println(result3)
val result4 = result3.dropLast(2)
println(result4)
}