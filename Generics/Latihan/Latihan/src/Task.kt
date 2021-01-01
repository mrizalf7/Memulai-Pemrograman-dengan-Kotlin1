/**
 * Untuk menyelesaikan tugas latihan, Anda tidak diperbolehkan mengubah struktur kode yang sudah ada. Kecuali:
 *    - Untuk melakukan improvisasi kode
 *    - Mengikuti perintah yang ada
 *
 * Cukup tambahkan kode berdasarkan perintah yang sudah ditentukan.
 *
 */

fun main() {
    val stringResult = getResult("Kotlin")
    val intResult = getResult(100)

//    println(stringResult)
//    println(intResult)
    val printString = cetakGenerik(stringResult)
    val printInt = cetakGenerik(intResult)
    println(printString)
    println(printInt)


}
// TODO 2
fun <t> cetakGenerik(args: t) :t{
    return args
}

// TODO 1
fun <T> getResult(args: T): Int {
//    val args = args
//    if(args is Int){
//        return args*5
//    }
//    else if(args is String){
//        return args.length
//    }
//    else
//    return 0

    return when(args){
        is Int -> args*5
        is String ->args.length
        else -> 0
    }
}