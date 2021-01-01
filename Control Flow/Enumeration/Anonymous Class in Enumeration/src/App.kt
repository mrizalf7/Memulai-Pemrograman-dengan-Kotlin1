// main function
fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE
    val colorYellow = Coloc.YELLOW

    colorRed.printValue()
    colorGreen.printValue()
    colorBlue.printValue()
    colorYellow.printValue()
}

enum class Color(val value: Int) {
    RED(0xFF0000) {
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00) {
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF) {
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()

}


enum class Coloc(val value:Int){
    YELLOW(1234){
        override fun printValue() {
            println("Value of Yellow is $value")
        }
    };


    abstract fun printValue()
}