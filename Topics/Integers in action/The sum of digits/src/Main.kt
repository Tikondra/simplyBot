const val COUNT = 10

fun main() {
    val value = readln().toInt()
    println(value / (COUNT * COUNT) + value % COUNT + value / COUNT % COUNT)
}