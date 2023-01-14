package kotlinstudy.ch03

import kotlinstudy.ch03.strings.joinToString
import kotlinstudy.ch03.strings.joinToStringOld
import kotlinstudy.ch03.strings.lastChar
import kotlinstudy.ch03.strings.lastChar as last

val set = hashSetOf(1, 7, 53)
val list = arrayListOf(1, 7, 53)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-five")

val strings = listOf("first", "second", "fourteenth")
val numbers = setOf(1, 14, 2)



fun main() {
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    println(strings.last())
    println(strings.indexOf("second"))
    println(strings[1])
    println(strings.get(1))
    println(numbers.max())

    println(joinToStringOld(listOf(1, 2, 3), ";", "(", ")"))
    println(joinToStringOld(collection = listOf(1, 2, 3), prefix = "(", separator = ";", postfix =  ")"))

    println(joinToStringOld(listOf(1, 2, 3)))
    println(joinToStringOld(listOf(1, 2, 3), prefix="[", postfix = "]"))

    println("Hello".lastChar())
    println("Hello".last())

    val list = listOf(1, 2, 3)
    val set = setOf(1, 2, 3)

    println(list.joinToString())
    println(set.joinToString())
}