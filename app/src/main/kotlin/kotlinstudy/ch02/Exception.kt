package kotlinstudy.ch02

import java.io.BufferedReader
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

class Exception {
    fun ExptTest(number: Int){
        val percentage =
        if(number !in 0..100)
            number
        else
            throw IllegalArgumentException(
                    "A Percentage value must be between 0 and 100: $number"
            )

        if (number !in 0..100)
            throw IllegalArgumentException(
                    "A Percentage value must be between 0 and 100: $number"
            )
    }

    fun readNumber(reader: BufferedReader): Int? {
        try {
            val line = reader.readLine()
            return Integer.parseInt(line)
        } catch (e: NumberFormatException) {
            return null
        } finally {
            reader.close()
        }
    }

    fun readNumber2(reader: BufferedReader) {
        val number = try {
            Integer.parseInt(reader.readLine())

        } catch (e: NumberFormatException) {
            null
        }
        println(number)
    }

}