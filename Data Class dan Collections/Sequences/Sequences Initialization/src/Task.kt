fun main() {
    val list = (1..100).toList()
    list.asSequence().filter { it % 5 == 0 }.map { it*2 }.forEach { println(it) }
}