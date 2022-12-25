package homeWork7.forCheck

object Channels {

    private val list = mutableListOf(
        "NEWS", "2x2", "porn", "SolovevTV",
        "PutinTV", "NavalniiFreeDome", "Spring",
        "Sport", "RUTV", "Covid-19", "Armagedon", "SpasTV",
        "TNT", "STS", "Ksuha_lohTV"
    )

    fun getRandomChannels(): List<String> {
        return list.shuffled()

    }
}