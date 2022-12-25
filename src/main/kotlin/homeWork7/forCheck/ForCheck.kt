package homeWork7.forCheck

fun main() {

    val sony = TV(descriptor = "Sony" to "SB43AU4500", 11.0)
    val samsung = TV(mark = "Samsung", model = "Serif", size = 75.0)
    sony.turnOnOff()                                             //Вкл\Выкл
    sony.listChannels()                                          //Показывает список каналов для текущей модели
    samsung.turnOnOff()
    sony.switchChannel(10)                                  //Переключение канала на заданный
    samsung.downSwitchChannel()                                  //Переключение канала вниз
    for (j in 1..5) {
        samsung.upSwitchChannel()                                //Переключение канала вверх
    }
    sony.turnOnOff()
    sony.upSwitchChannel()
    samsung.listChannels()
    samsung.upVolume(15)                                  //Добавление громкости на заданное значение
    samsung.downVolume(50)                                //Убавление громкости на заданное значение
    sony.upVolume(200)


}