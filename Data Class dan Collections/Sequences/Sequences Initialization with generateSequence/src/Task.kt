fun main() {
    val sequenceNumber = generateSequence(4) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
//    val sequenceNumber = generateSequence(1) { it + 1 }
//    println(sequenceNumber)
    println()
    val seq = generateSequence(1){it+2}
    seq.take(10).forEach{print("$it ")}
}