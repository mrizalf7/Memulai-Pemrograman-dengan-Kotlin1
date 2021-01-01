abstract class Animal(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }
}
class semut(val sName:String,val sWeight:Double,val sAge:Int,val sIsCarnivore:Boolean )
    :Animal(sName,sWeight,sAge,sIsCarnivore)
    {
        override fun eat(){
        println("$name sedang ngemil")
    }

        override fun sleep(){
            println("$name sedang tidur")
        }
        fun fight(){
            println("$name sedang berkelahi")
        }

    }

fun main() {
    println("Abstract Class")
    val e = semut("jek",4.2,5,true)
    println("Semut bernama ${e.sName} berusia ${e.sAge} tahun, berat ${e.weight} ")
    e.fight()
    e.eat()
    e.sleep()

}