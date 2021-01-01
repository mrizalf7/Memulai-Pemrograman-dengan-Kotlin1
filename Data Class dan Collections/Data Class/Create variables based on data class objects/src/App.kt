data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("nrohmen", 17)
    val (name, age) = dataUser

    println("My name is $name, I am $age years old")
    val dataUzer = DataUser("rijal",22)
    val (nama,umur) = dataUzer

    println("My name is $nama, and I am $umur years old")
}