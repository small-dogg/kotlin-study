package kotlinstudy.ch03.collection

val list = listOf(2, 3, 5, 7, 11)//원하는 길이만큼 인자를 전달할 수 있음
/** fun listOf<T> (vararg values: T): List<T> { ... } */

fun main(args: Array<String>){
    val list = listOf("args: ", *args) //스프레드 연산자를 사용하여 배열을 풀어 넣어줌.
    println(list)
}