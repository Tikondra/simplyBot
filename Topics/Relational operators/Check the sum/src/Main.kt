const val RESULT = 20

fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    println(a + b == RESULT || a + c == RESULT || b + c == RESULT)
}