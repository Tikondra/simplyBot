const val DEL = 2
const val DOP = 0.5

fun main() {
    val a = (readln().toDouble() / DEL + DOP).toInt()
    val b = (readln().toDouble() / DEL + DOP).toInt()
    val c = (readln().toDouble() / DEL + DOP).toInt()
    val sum = a + b + c
    println(sum)
}