package kotlinstudy.ch02

import java.util.*

var binaryReps = TreeMap<Char, String>();

fun fizzBuzz(i: Int) = when{
    i % 15 == 0 -> "FizzBuzz"
    i % 5 == 0 -> "Fizz"
    i % 3 == 0 -> "Buzz"
    else -> "$i "
}



fun main(){
    for (i in 1..100) {
        print(fizzBuzz(i))
    }
    println()
    println("---------------------")
    for (i in 100 downTo 1 step 2) {
        print (fizzBuzz(i))
    }
    println("---------------------")

    for (c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.code)
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    val list = arrayListOf("10", "11","1001")
    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }
}