package kotlinstudy.ch02

import java.util.*

var binaryReps = TreeMap<Char, String>();

fun fizzBuzz(i: Int) = when{
    i % 15 == 0 -> "FizzBuzz"
    i % 5 == 0 -> "Fizz"
    i % 3 == 0 -> "Buzz"
    else -> "$i "
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c!in '0'..'9'

fun recognize(c: Char) = when (c){
    in '0'..'9' -> "It's Digit"
    in 'a'..'z', in 'A'..'Z' -> "It's letter!"
    else -> "Idk"
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

    println(isLetter('A'))
    println(isNotDigit('5'))
    println(isNotDigit('x'))

    println(recognize('A'))
    println(recognize('B'))
    println(recognize('1'))
    println(recognize('!'))

}