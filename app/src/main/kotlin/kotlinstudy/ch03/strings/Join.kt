@file:JvmName("StringFunctions")
package kotlinstudy.ch03.strings

val UNIX_LINE_SEPARATOR ="\n"

@JvmOverloads
fun <T> joinToString(
        collection: Collection<T>,
        separator: String =", ",
        prefix: String ="",
        postfix: String =""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun String.lastChar(): Char = this[length-1] // get(length-1)
