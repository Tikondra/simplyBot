const val ZERO = 0
const val C = 3
const val B = 4
const val A = 5

fun main() {
    val count = readln().toInt()
    var a = ZERO
    var b = ZERO
    var c = ZERO
    var d = ZERO

    repeat(count) {
        val value = readln().toInt()
        if (value == A) {
            a++
        } else if (value == B) {
            b++
        } else if (value == C) {
            c++
        } else d++
    }

    println("$d $c $b $a")
}