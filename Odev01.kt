package com.example.kotlindeneme1
// Didem ÖZTÜRKLER
import java.util.*

fun main() {

    val input = Scanner(System.`in`)

    // kullanıcıdan oluşturulacak dizinin boyutu isteniyor.
    println("Enter the size of the array : ")
    val size : Int = input.nextInt()

    val myArray = Array<Int>(size){0}

    // kullanıcıdan dizinin her bir elemanını girmesi isteniyor
    for (i in 0 until myArray.size) {

        println("${i + 1}. element : ")
        myArray[i] = input.nextInt()

    }

    // kullanıcının oluşturduğu dizi yazdırılıyor
    print("Created array : ")
    for(c in myArray) {

        print("$c ")

    }

    // kullanıcıdan reverse işleminin hangi elemandan itibaren yapılacağı bilgisi alınıyor
    print("\nReversed from which order element (sequence number): ")
    val elementNum : Int = input.nextInt()

    // reverse işlemi yapılan fonksiyon çağırılıyor ve fonksiyonun döndürdüğü yeni array yazdırılıyor
    for (r in myArray.myReverseFunction(elementNum)){

        print("$r ")

    }

}

/**
 * ilgili Int dizisinin kaçıncı elemanından itibaren ters çevrileceği bilgisini parametre olarak alıp
 * diziyi belirtilen elemandan itibaren tersten yazdıran fonksiyon
 * @return Array<Int>
 * @throws java.util.ArrayIndexOutofBoundsException eğer fonksiyona dizinin boyutundan büyük parametre atanırsa
 * bu hata fırlatılır
 */
fun Array<Int>.myReverseFunction(elementNum : Int) : Array<Int> {

    try {

        var reversedArray = Array<Int>(size){0}
        var count : Int = 0

        // dizi kaçıncı elemandan itibaren ters çevrilecekse o elemana kadar olan elemanlar reversedArray dizisine aktarılır
        while(count < elementNum) {

            reversedArray[count] = this[count]
            count++

        }

        /* reversedArray dizisi kaldığı yerden devam ederken ters çevrilmek istenen dizinin elemanları
         sondan itibaren sırasıyla reversedArray dizisine aktarılır
        */
        for (i in 0 until this.size - elementNum) {

            reversedArray[elementNum + i] = this[this.size - 1 - i]

        }

       return reversedArray

    /* fonksiyonun aldığı elementNum parametresinden dolayı programın 69. satırında
    ArrayIndexOutOfBoundsException fırlatma ihtimali olduğundan dolayı bunu aşağıdaki kod bloğunda yakalayabiliriz.*/
    }catch (e: ArrayIndexOutOfBoundsException) {

        println("The number of the element you enter cannot be larger than the size of the array!")

    }

    // Hata olması durumunda 0 dizisi döndürülür
    return Array(0){0}

}