package kotlinstudy.ch03.collection

val map = mapOf( 1 to "one", 7 to "seven", 53 to "fifty-three")
//to는 코틀린 키워드가 아닌 중위 호출이라는 특별한 방시긍로 to 라는 일반 메서드를 호출한 것이다.
val map2 = mapOf( Pair(1,"one"), 7 to "seven", 53 to "fifty-three")



fun main() {
    val (number,name) = 1 to "one"// 구조 분해 선언
    val (number2,name2) = Pair(1,"one")

    println(number)
    println(name)
    println(number2)
    println(name2)
}

