const val ONE = 1

fun main() {
    val value = readln()
    val num = readln().toInt()
    println("Symbol # $num of the string \"$value\" is \'${value[num - ONE]}\'")
}