package homeWork7.forCheck

fun main() {

    val sony = TV(descriptor = "Sony" to "SB43AU4500", 11.0)
    val samsung = TV(mark = "Samsung", model = "Serif", size = 75.0)
    sony.turnOnOff()                                             //���\����
    sony.listChannels()                                          //���������� ������ ������� ��� ������� ������
    samsung.turnOnOff()
    sony.switchChannel(10)                                  //������������ ������ �� ��������
    samsung.downSwitchChannel()                                  //������������ ������ ����
    for (j in 1..5) {
        samsung.upSwitchChannel()                                //������������ ������ �����
    }
    sony.turnOnOff()
    sony.upSwitchChannel()
    samsung.listChannels()
    samsung.upVolume(15)                                  //���������� ��������� �� �������� ��������
    samsung.downVolume(50)                                //��������� ��������� �� �������� ��������
    sony.upVolume(200)


}