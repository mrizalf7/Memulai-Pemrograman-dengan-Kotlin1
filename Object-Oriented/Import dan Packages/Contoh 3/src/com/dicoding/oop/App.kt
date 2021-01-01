package com.dicoding.oop

import com.dicoding.oop.utils.*

fun main() {
    sayHello()
    println(factorial(4.0))
    println(pow(3.0, 2.0))
    println(PI)
    println(areaOfCircle(13.0))
    println(paktorial(4))
}

fun paktorial (n:Int): Int {
   var ko=n
    var hasil = 1
    while(1<ko){
        hasil=hasil*ko
        ko--
    }
    return hasil
}