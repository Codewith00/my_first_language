package homeWork5

import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.math.BigDecimal
import kotlin.concurrent.thread

fun main() {
    var number: Int? = null
    var a = 0
    var b = 1
    var sum: Int
    print("Введите порядковый номер числа фибаначи: ")

    while (number == null) {
        number = readLine()?.toIntOrNull()
        if (number == null) println("Введено неверное значение. Повторите попытку...")
        else {
            println("Попытка ввода успешна...")

            when (number > 48) {
                true -> {
                    runBlocking {
                        thread {
                            while (isActive) {
                                Thread.sleep(500L)
                                print(".")
                            }
                        }
                        launch {
                            var aBig = a.toBigDecimal()
                            var bBig = b.toBigDecimal()
                            var sumBig: BigDecimal
                            for (j in 1..number) {
                                sumBig = aBig + bBig
                                aBig = bBig
                                bBig = sumBig
                            }
                            println("Число фибаначи: $aBig, под номером $number")

                        }
                        println("Расчет из чисел формата BigDecimal (медленный, но большой диапазон чисел)")
                        println("Ожидание завершения программы...")
                    }
                }
                false -> {
                    for (j in 1..number) {
                        sum = a + b
                        a = b
                        b = sum
                    }
                    println("Расчет из чисел формата Integer (быстрый, но маленький диапазон чисел)")
                    println("Число фибаначи: $a, под номером $number")
                }
            }
        }
    }

}




