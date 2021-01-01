// main function
fun main() {
    val fullName = getFullName("Rizal","Firmansyah","")
    print(fullName)
//    val myName = getFullName(last = "Firmansyah", middle = "Rizal", first = "Muhamad")
//    print(myName)
}

fun getFullName(first: String , middle: String , last: String): String {
    return "$first $middle $last"
}