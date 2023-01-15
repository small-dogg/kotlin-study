@file:JvmName("StringFunctions")

package kotlinstudy.ch03.strings

import java.util.StringJoiner

val UNIX_LINE_SEPARATOR = "\n"

@JvmOverloads
fun <T> joinToStringOld(
        collection: Collection<T>,
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun <T> Collection<T>.joinToString(
        separator: String = ",",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) = joinToString(separator, prefix, postfix)

fun String.lastChar(): Char = this[length - 1] // get(length-1)

val String.lastChar: Char
    get() = get(length-1)

var StringBuilder.lastChar: Char
    get() = get(length -1)
    set(value: Char) {
        this.setCharAt(length -1, value)
    }

fun main() {
    println("Kotlin".lastChar)
    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)
}