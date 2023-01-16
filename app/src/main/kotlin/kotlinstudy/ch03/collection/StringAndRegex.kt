package kotlinstudy.ch03.collection

fun main() {
    println("12.345-6.A".split("\\.|-".toRegex()))
    println("12.345-6.A".split(".", "-"))

    parsePath("/Users/yole/kotlin-bool/chapter.adoc")
    parsePathWithRegex("/Users/yole/kotlin-bool/chapter.adoc")

    val kotlinLogo = """|  //
                       +| //
                       +|/ \"""
    println(kotlinLogo.trimMargin("+"))
}

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")

    val filename = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")

    println("directory = ${directory}")
    println("fullName = ${fullName}")
    println("filename = ${filename}")
    println("extension = ${extension}")
}

fun parsePathWithRegex(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("directory = ${directory}, filename = ${filename}, extension = ${extension}")
    }
}