// main function
fun main() {
    loop@ for (i in 1..5) {
        println("Outside Loop")

        for (j in 1..9) {
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }
}