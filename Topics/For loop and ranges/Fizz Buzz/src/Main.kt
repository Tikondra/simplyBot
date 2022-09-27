const val ZERO = 0
const val TREE = 3
const val FIVE = 5

fun main() {
    val start = readln().toInt()
    val end = readln().toInt()

    for (num in start..end) {
        if (num % TREE == ZERO && num % FIVE == ZERO) {
            println("FizzBuzz")
        } else if (num % TREE == ZERO) {
            println("Fizz")
        } else if (num % FIVE == ZERO) {
            println("Buzz")
        } else println(num)
    }
}