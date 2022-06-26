package io.github.junny

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource


class CalcaulatorTest {

    @ParameterizedTest
    @CsvSource(value = [
        "2:3:+:5",
        "2:7:*:14",
        "9:3:/:3",
        "5:2:-:3"
    ], delimiter = ':')
    fun create_calculator(left : Long, right : Long, operator: Operator,result : Long){
        assertEquals(
            Calculator(
            left,
            right,
            operator
        ).compute(), result)
    }
}