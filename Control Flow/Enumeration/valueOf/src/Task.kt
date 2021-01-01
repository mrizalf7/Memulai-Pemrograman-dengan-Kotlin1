// main function
fun main() {
    val color: Color = Color.valueOf("GREEN")
    println("Color is $color")
    val height:Height = Height.valueOf("Tall")
    print("Height is $height")
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class Height(val value:String){
    Tall("180 CM"),
    Middle("170 CM"),
    Short("160 CM")
}