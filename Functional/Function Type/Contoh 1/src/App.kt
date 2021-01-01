val sum: (Int, Int) -> Int = { valueA, valueB -> valueA + valueB }
//sebuah value bernama sum dijadikan sebuah fungsi yang bertipe integer dan integer akan menjadi integeer
// yang paling kanan akan dieksekusi dan membalikkan sebuah nilai(return).
val multiply: (Int, Int) -> Int = { valueA, valueB -> valueA * valueB }

fun main() {
    val sumResult = sum.invoke(10, 10)
    val multiplyResult = multiply.invoke(20, 20)
    val hasilTambah = jml(20,30)
    println(sumResult)
    println(multiplyResult)
    println(hasilTambah)



}

fun jml(angk1:Int,angk2:Int):Int{
    return angk1+angk2
}