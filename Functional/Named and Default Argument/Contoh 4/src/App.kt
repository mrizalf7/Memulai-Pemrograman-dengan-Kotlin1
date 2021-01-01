// main function
fun main() {
    val fullName = getFullName(first = "Dicoding")
    println(fullName)
    val name = getName()
    println(name)
}

fun getFullName(first: String = "Kotlin", middle: String = " is ", last: String = "Awesome"): String {
    return "$first $middle $last"
}

fun getName(f:String = "", m:String = "" , l:String= ""):String{
    return "$f $m $l"
}