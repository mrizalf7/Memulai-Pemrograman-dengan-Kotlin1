class Animal{
    var name: String = "Dicoding Miaw"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}

class Computer{
    var name : String ="Laptop"

    get(){
        println("Fungsi getter terpanggil")
        return field
    }

    set(value){
        println("Fungsi setter terpanggil")

    }
}

// main function
fun main(){
    val dicodingCat = Animal()
   println("Nama: ${dicodingCat.name}" )
//    dicodingCat.name = "Goose"
//    println("Nama: ${dicodingCat.name}")

//    val s = Computer()
//    println("Nama: ${s.name}")
//    s.name= "netbook"
//    println("Nama: ${s.name}")
}