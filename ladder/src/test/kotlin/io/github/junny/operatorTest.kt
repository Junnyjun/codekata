package io.github.junny

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class operatorTest {

    @ParameterizedTest
    @CsvSource(value = [
        "2:3:5",
        "5:2:7"
    ], delimiter = ':')
    fun plusTest(left : Long, right : Long, result : Long){
        assertEquals(result, Operator.PLUS.result.apply(left,right))
    }

    @ParameterizedTest
    @CsvSource(value = [
        "8:3:5",
        "9:2:7"
    ], delimiter = ':')
    fun minusTest(left : Long, right : Long, result : Long){
        assertEquals(result, Operator.MINUS.result.apply(left,right))
    }
    @ParameterizedTest
    @CsvSource(value = [
        "8:3:24",
        "9:2:18"
    ], delimiter = ':')
    fun multiplyTest(left : Long, right : Long, result : Long){
        assertEquals(result, Operator.MULTIPLY.result.apply(left,right))
    }
    @ParameterizedTest
    @CsvSource(value = [
        "8:2:4",
        "9:3:3"
    ], delimiter = ':')
    fun divideTest(left : Long, right : Long, result : Long){
        assertEquals(result, Operator.DIVIDE.result.apply(left,right))
    }
}