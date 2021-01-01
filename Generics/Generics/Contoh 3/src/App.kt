// main function
fun main() {
    val numbers = ListNumber<Long>()
    val numbers2 = ListNumber<Int>()
    //  val numbers3 = ListNumber<String>() error : Type argument is not within its bounds

}

class ListNumber<p : Number> : List<p>{   // it returns generic data type
    override fun get(index: Int):p {
        return this[index]
    }
}
interface List<T> {
    operator fun get(index: Int): T
}