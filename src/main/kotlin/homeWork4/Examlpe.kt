package homeWork4

fun main() {

    val word: String = "hhuuaa55hhss,,7755\"kko" // 22 �������
    val exampleWordCount = word.count()
    val exampleWordLength = word.length
    val i = word.replace("h", "1")

    println(i)

    println("length: ${word.length} or $exampleWordLength, count: ${word.count()} or $exampleWordCount")

    //  .substring(Int, Int) - ����������� �������� �� ���������� ���������, ��������� �����������.

    val exampleSubStringFirst = word.substring(exampleWordCount / 2) // ����� �������� ��� ������ � (11)
    val exampleSubStringSecond = word.substring(exampleWordCount / 2, exampleWordCount) //����� �������� ��� (11, 22)
    val test = word.substring(2 until  5)
    println(exampleSubStringFirst)
    println(exampleSubStringSecond)
    println(test)
}