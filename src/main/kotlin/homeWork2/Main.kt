package homeWork2

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    println("привет,как дела?")
    println("Ты лох, и все тут)))")
    runBlocking {
        launch {
            generator().collect {
                if (it % 10 != 0) {
                    println(it)
                    delay(100L)
                } else {
                    println("* Лох детектед *")
                    delay(1000L)
                }
            }
        }
    }
}

fun generator(): Flow<Int> {
    return flow {
        for (j in 1..60) emit(j)
    }
}