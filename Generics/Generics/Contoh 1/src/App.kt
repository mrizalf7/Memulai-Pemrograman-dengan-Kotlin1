// main function
fun main() {
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList[0]
}

class ArrayList<e> : List<e> {
    override fun get(index: Int): e {
        return this[index]
    }
}

interface List<p> {
    operator fun get(index: Int): p
}