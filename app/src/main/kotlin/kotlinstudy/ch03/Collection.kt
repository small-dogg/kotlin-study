package kotlinstudy.ch03

val set = hashSetOf(1, 7, 53)
val list = arrayListOf(1, 7, 53)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-five")

val strings = listOf("first", "second", "fourteenth")
val numbers = setOf(1, 14, 2)

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

fun main() {
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    println(strings.last())
    println(strings.indexOf("second"))
    println(strings[1])
    println(strings.get(1))
    println(numbers.max())

    println(joinToString(listOf(1, 2, 3), ";", "(", ")"))
    println(joinToString(collection = listOf(1, 2, 3), prefix = "(", separator = ";", postfix =  ")"))

    println(joinToString(listOf(1, 2, 3)))
    println(joinToString(listOf(1, 2, 3), prefix="[", postfix = "]"))
}