package homeWork3

fun main() {
//    var firstName = "Kseniia"
//    var lastName = "Pe"
//    var height: Double = 50000.0
//    var weightFloat = 35
//    var child = "Личинка"
//    var isChild: Boolean = (height < 150 && weightFloat < 40)
//    if (isChild) {
//        println("is she a Child? - $isChild")
//        child = "Личинка"
//    } else {
//        println("is she a Child? - $isChild")
//        child = "Взрослый лох"
//    }
//
//    var info = ("$firstName $lastName $height $weightFloat $child")
//    println(info)
//    height = 10.0
//    isChild = (height < 150 || weightFloat < 40)
//    if (isChild) {
//        println("is she a Child? - $isChild")
//        child = "Личинка"
//    } else {
//        println("is she a Child? - $isChild")
//        child = "Взрослый лох"
//    }
//
//
//    info = ("$firstName $lastName $height $weightFloat $child")
//    println(info)
//
//
//
val quiz = QuizStorage.getQuiz(QuizStorage.Locale.Ru)
    val answers = listOf(0, 2, 1)
    println(QuizStorage.answer(quiz, answers))

}