package homeWork7.forCheck

class TV(mark: String, model: String, size: Double) {

    constructor(descriptor: Pair<String, String>, size: Double) : this(
        mark = descriptor.first,
        model = descriptor.second,
        size = size
    )

    private val currentModel = model                                                             //������� ������
    private var channels = Channels.getRandomChannels().toMutableList()                          //������ �������
    private var currentVolume: Int = 15                                                   //��������� �� ���������
    private var currentChannel = channels[0]                                              //������� ����� �� ���������
    private var numberCurrentChannel = 0
    private var power = false
    private val amountChannelsInt = when {
        size < SMALL_SIZE -> 5
        size < MEDIUM_SIZE -> 7
        else -> channels.count()
    }
    private val tvProgram = channels.slice(0 until amountChannelsInt)

    fun listChannels (){
        println("������ ������� ��� ������ - $currentModel")
        tvProgram.forEachIndexed { index, s -> println("$index - $s") }
    }
    fun upVolume(volume: Int) {                                           //��������\������� ���������
        currentVolume = minOf(VOLUME_MAX, currentVolume + volume)
        println("��������� - $currentVolume")
    }

    fun downVolume(volume: Int) {
        currentVolume = maxOf(VOLUME_MIN, currentVolume - volume)
        println("��������� - $currentVolume")
    }

    fun switchChannel(canal: Int) {                                        //������������ �������
        if (!power) {
            power = true
            println("��������� �� $")
        }
        if (canal in IntRange(0, amountChannelsInt - 1)) {
            numberCurrentChannel = canal
            currentChannel = tvProgram[canal]
            println("������� ����� - $currentChannel ��� ������� - $numberCurrentChannel")
        } else println("����� ������� - $amountChannelsInt")
    }

    fun upSwitchChannel() {
        if (!power) {
            power = true
            println("��������� ��")
        }
        numberCurrentChannel += 1
        if (numberCurrentChannel > amountChannelsInt - 1) numberCurrentChannel = 0
        currentChannel = tvProgram[numberCurrentChannel]
        println("������� ����� - $currentChannel ��� ������� - $numberCurrentChannel")

    }

    fun downSwitchChannel() {
        if (!power) {
            power = true
            println("��������� ��")
        }
        numberCurrentChannel -= 1
        if (numberCurrentChannel < 0) numberCurrentChannel = amountChannelsInt - 1
        currentChannel = tvProgram[numberCurrentChannel]
        println("������� ����� - $currentChannel ��� ������� - $numberCurrentChannel")

    }

    fun turnOnOff() {                                                      //���\���� ����������
        power = if (!power) {
            println("��������� �� $currentModel")
            true
        } else {
            println("���������� �� $currentModel")
            false
        }
    }

    companion object {                                                 // ������������/����������� ���������
        const val VOLUME_MAX: Int = 100
        const val VOLUME_MIN: Int = 0
        const val SMALL_SIZE: Double = 32.0
        const val MEDIUM_SIZE: Double = 43.5
    }
}