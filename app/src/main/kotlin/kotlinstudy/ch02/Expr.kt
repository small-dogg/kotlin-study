package kotlinstudy.ch02

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun evalOld(e: Expr): Int {
    if (e is Num) {
        return e.value
    }

    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun eval(e: Expr): Int =
        if (e is Num) {
            e.value
        } else if (e is Sum) {
            eval(e.right) + eval(e.left)
        } else {
            throw IllegalArgumentException("Unknown expression")
        }

fun evalWhen(e: Expr): Int =
        when(e){
            is Num ->
                e.value
            is Sum ->
                evalWhen(e.left) + evalWhen(e.right)
            else ->
                throw java.lang.IllegalArgumentException("Unkonw Expression")
        }

fun evalWhenWithLogging(e: Expr): Int =
        when(e){
            is Num ->{
                println("num: ${e.value}")
                e.value
            }
            is Sum ->{
                val left = evalWhenWithLogging(e.left)
                val right = evalWhenWithLogging(e.right)
                println("sum : ${left}+${right}")
                left + right
            }
            else ->
                throw java.lang.IllegalArgumentException("Unkonw Expression")
        }

fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}