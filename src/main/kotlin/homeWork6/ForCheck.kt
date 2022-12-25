package homeWork6

fun main() {

    print("Enter the number of contacts to be entered - ")
    val tEST1 = globalList(inputNumbers(readLine().toString()))
    println("Numbers with +7 ${tEST1.filter { it.startsWith("+7") }}") //Вывод номеров начинающихся с +7
    println("Number of unique numbers - ${tEST1.toSet().size}") // количество уникальных номеров - ...
    println("Sum of number lengths ${tEST1.sumOf { it.count() }}") //Сумма символов во всех номерах
    val tTEST2 = mutableMapOf<String, String>()
    tEST1.forEach { item ->
        print("Enter contact name with number :$item - ")
        tTEST2[item] = readln()
    }
    val a = tTEST2.toSortedMap()
    println("Sorted numbers:")//Сортировка по номерам
    a.forEach { println(it) }

    val b = tTEST2.toList().sortedBy { (_, v) -> v }.toMap()
    println("Sorted names:")
    b.forEach{ println(it) }  //Сортировка по именам
}
fun globalList(amountNumber: Int): MutableList<String> {
    val listContactsLIST = mutableListOf<String>()
    for (i in 1..amountNumber) {
        print("Enter number: ")
        listContactsLIST.add(readLine().toString())
    }
    return listContactsLIST}
fun inputNumbers (n: String) : Int{
    val b = n.toLong()
    return if ( b >= 0 ) { n.toInt() }
    else
    {
        println("Error, You can only enter more than one number")
        inputNumbers(readLine().toString())
    }
}