package com.didem.hafta1

import java.util.*

fun main() {

    val input = Scanner(System.`in`)
    println("dizinin eleman sayisi : ")
    val size : Int = input.nextInt()

    var dizi = Array<Int>(size){0}

    for (a in 0 until dizi.size) {

        println("$a. eleman : ")
        dizi[a] = input.nextInt()


    }
    println("olusturdugunuz dizi :")
    for(c in dizi) {
        print("$c , ")
    }



}

fun Array<Int>.MyReverseFunction(kacinci : Int) : Array<Int> {

    var newFunArray = Array<Int>(size){0}

    for (i in 0..kacinci - 1 ) {

        newFunArray[i] = this[i]

    }
    for (k in this.size - 1 downTo kacinci + 1 ) {

        newFunArray[k] = this[k]

    }

    return newFunArray

}