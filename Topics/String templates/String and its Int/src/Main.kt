const val DELIMETER = 2

fun main() {
    val value = readln()
    println("The obtained value is $value and its Int representation is ${value.toInt() / DELIMETER}")
}