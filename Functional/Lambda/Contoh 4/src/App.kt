// main function
fun main() {
    printResult(10){ value ->
        value + value
    }
    cobaHighOrder(5 ){
        nilai -> nilai*nilai
    }
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

fun cobaHighOrder(nilai:Int, kuadrat:(Int)->Int){
    val result = kuadrat(nilai)
    println(result)
}