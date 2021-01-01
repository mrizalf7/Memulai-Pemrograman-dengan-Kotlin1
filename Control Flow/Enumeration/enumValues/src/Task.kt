// main function
fun main() {
    val colors: Array<Color> = enumValues()
    colors.forEach {color ->
        println(color)
    }

    val color: Color = enumValueOf("RED")
    println("Color is $color")

    val Majors:Array<Majors> = enumValues()
    Majors.forEach { Majors->
        println(Majors)
    }

//    val major:Majors = enumValueOf("Informatics")
//    println("$major")
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class Majors(val value:Int){
    Informatics(123456),
    Mathematics(1234),
    Physics(123)
}