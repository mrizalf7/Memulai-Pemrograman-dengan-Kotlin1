// main function
fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE
    val colorWhite = Color.White

    println(colorRed)
    println(colorGreen)
    println(colorBlue)
    println(colorWhite)
}

enum class Color(val value: Int) {  //enum seperti interface bersifat final
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    White(1142145)
}