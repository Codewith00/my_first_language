package homeWork4

fun main() {
    val message = "F2p)v\"y233{0->c}ttelciFc"
    val firstHalf = message.substring(0, message.count()/2)
    val secondHalf = message.substring(message.count()/2, message.count())

    println("${first(firstHalf)} ${second(secondHalf)}".uppercase())

}
fun shift(mess: String, a: Int) : String{
    return mess.map { it + a }.joinToString("")

}
fun first(message: String): String {
    val currentMess = shift(message, 1)
        .replace("5", "s")
        .replace("4", "u")
    return shift(currentMess, -3).replace("0", "o")

}
fun second(message: String): String {
 val currentMess = message.reversed()
    return shift(currentMess, -4).replace("_", " ")
}



