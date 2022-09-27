fun main() {
    val char: Char = readln().first()
    println(char.isUpperCase() || char.isDigit() && char > '0')
}