package homeWork4

fun main() {

    val word: String = "hhuuaa55hhss,,7755\"kko" // 22 символа
    val exampleWordCount = word.count()
    val exampleWordLength = word.length
    val i = word.replace("h", "1")

    println(i)

    println("length: ${word.length} or $exampleWordLength, count: ${word.count()} or $exampleWordCount")

    //  .substring(Int, Int) - присваивает значение из указанного диапазона, остальное выбрасывает.

    val exampleSubStringFirst = word.substring(exampleWordCount / 2) // можно записать как начало с (11)
    val exampleSubStringSecond = word.substring(exampleWordCount / 2, exampleWordCount) //можно записать как (11, 22)
    val test = word.substring(2 until  5)
    println(exampleSubStringFirst)
    println(exampleSubStringSecond)
    println(test)
}