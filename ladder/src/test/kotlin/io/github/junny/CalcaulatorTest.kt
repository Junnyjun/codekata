package io.github.junny

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource


class CalcaulatorTest {

    @ParameterizedTest
    @CsvSource(value = [
        "2+3-1:4",
        "2*7-3:11",
        "9/3+2:5",
        "5-2*3:9"
    ], delimiter = ':')
    fun create_calculator(expression: String, result : String){
        assertEquals(Calculators(expression).compute(), result.toLong())
    }


}