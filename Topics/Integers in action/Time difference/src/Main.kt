const val COUNT = 60

fun main() {
    val h = readln().toInt() * COUNT * COUNT
    val m = readln().toInt() * COUNT
    val s = readln().toInt()

    val h2 = readln().toInt() * COUNT * COUNT
    val m2 = readln().toInt() * COUNT
    val s2 = readln().toInt()

    val first = h + m + s
    val second = h2 + m2 + s2
    println(second - first)
}