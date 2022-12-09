package homeWork3

fun main() {
    var firstName: String = "Гарри"
    var lastName: String = "Поттер"
    var height: Double = 130.0
    var weight: Float = 100F
    var isChild: Boolean = (height < 150 || weight < 40)
    var info: String = "Имя - $firstName ,Фамилия - $lastName, Рост - $height, Вес - $weight, Ребенок? - $isChild"

    println(info)

    height = 180.0
    firstName = "Силвестер"
    lastName = "Сталоне"
    isChild = (height < 150 || weight < 40)
    info  = "Имя - $firstName ,Фамилия - $lastName, Рост - $height, Вес - $weight, Ребенок? - $isChild"
    println(info)

    weight = 35F
    firstName = "Коня"
    lastName = "Коньсяков"
    isChild = (height < 150 || weight < 40)
    info  = "Имя - $firstName ,Фамилия - $lastName, Рост - $height, Вес - $weight, Ребенок? - $isChild"
    println(info)
}