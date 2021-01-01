class Animal(var name: String, var weight: Double, var age: Int, var isMammal: Boolean)

val Animal.getAnimalInfop : String
    get() =  "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age} Mamalia: ${this.isMammal}"

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 5.0, 2, true)
    println(dicodingCat.getAnimalInfop)
}