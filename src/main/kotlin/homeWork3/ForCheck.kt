package homeWork3

fun main() {
    var firstName: String = "�����"
    var lastName: String = "������"
    var height: Double = 130.0
    var weight: Float = 100F
    var isChild: Boolean = (height < 150 || weight < 40)
    var info: String = "��� - $firstName ,������� - $lastName, ���� - $height, ��� - $weight, �������? - $isChild"

    println(info)

    height = 180.0
    firstName = "���������"
    lastName = "�������"
    isChild = (height < 150 || weight < 40)
    info  = "��� - $firstName ,������� - $lastName, ���� - $height, ��� - $weight, �������? - $isChild"
    println(info)

    weight = 35F
    firstName = "����"
    lastName = "���������"
    isChild = (height < 150 || weight < 40)
    info  = "��� - $firstName ,������� - $lastName, ���� - $height, ��� - $weight, �������? - $isChild"
    println(info)
}