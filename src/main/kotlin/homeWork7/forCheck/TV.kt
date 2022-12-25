package homeWork7.forCheck

class TV(mark: String, model: String, size: Double) {

    constructor(descriptor: Pair<String, String>, size: Double) : this(
        mark = descriptor.first,
        model = descriptor.second,
        size = size
    )

    private val currentModel = model                                                             //Текущая модель
    private var channels = Channels.getRandomChannels().toMutableList()                          //Список каналов
    private var currentVolume: Int = 15                                                   //Громкость по умолчанию
    private var currentChannel = channels[0]                                              //Текущий канал по умолчанию
    private var numberCurrentChannel = 0
    private var power = false
    private val amountChannelsInt = when {
        size < SMALL_SIZE -> 5
        size < MEDIUM_SIZE -> 7
        else -> channels.count()
    }
    private val tvProgram = channels.slice(0 until amountChannelsInt)

    fun listChannels (){
        println("Список каналов для модели - $currentModel")
        tvProgram.forEachIndexed { index, s -> println("$index - $s") }
    }
    fun upVolume(volume: Int) {                                           //Добавить\убавить громкость
        currentVolume = minOf(VOLUME_MAX, currentVolume + volume)
        println("Громкость - $currentVolume")
    }

    fun downVolume(volume: Int) {
        currentVolume = maxOf(VOLUME_MIN, currentVolume - volume)
        println("Громкость - $currentVolume")
    }

    fun switchChannel(canal: Int) {                                        //Переключение каналов
        if (!power) {
            power = true
            println("Включение ТВ $")
        }
        if (canal in IntRange(0, amountChannelsInt - 1)) {
            numberCurrentChannel = canal
            currentChannel = tvProgram[canal]
            println("Текущий канал - $currentChannel под номером - $numberCurrentChannel")
        } else println("Всего каналов - $amountChannelsInt")
    }

    fun upSwitchChannel() {
        if (!power) {
            power = true
            println("Включение ТВ")
        }
        numberCurrentChannel += 1
        if (numberCurrentChannel > amountChannelsInt - 1) numberCurrentChannel = 0
        currentChannel = tvProgram[numberCurrentChannel]
        println("Текущий канал - $currentChannel под номером - $numberCurrentChannel")

    }

    fun downSwitchChannel() {
        if (!power) {
            power = true
            println("Включение ТВ")
        }
        numberCurrentChannel -= 1
        if (numberCurrentChannel < 0) numberCurrentChannel = amountChannelsInt - 1
        currentChannel = tvProgram[numberCurrentChannel]
        println("Текущий канал - $currentChannel под номером - $numberCurrentChannel")

    }

    fun turnOnOff() {                                                      //ВКЛ\ВЫКЛ телевизора
        power = if (!power) {
            println("Включение ТВ $currentModel")
            true
        } else {
            println("Выключение ТВ $currentModel")
            false
        }
    }

    companion object {                                                 // Максимальная/минимальная громкость
        const val VOLUME_MAX: Int = 100
        const val VOLUME_MIN: Int = 0
        const val SMALL_SIZE: Double = 32.0
        const val MEDIUM_SIZE: Double = 43.5
    }
}