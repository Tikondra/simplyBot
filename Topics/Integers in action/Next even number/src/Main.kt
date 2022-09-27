const val COUNT = 2

fun main() {
    val value = readln().toInt()
    println(value - value % COUNT + COUNT)
}