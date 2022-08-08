package github.io.junny;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

import static java.util.Arrays.asList;

class CalculatorTest {
    @ParameterizedTest
    @CsvSource(value = {
            "2:+:3:5",
            "7:-:4:3",
            "6:*:5:30",
            "15:/:3:5"
    },delimiter = ':')
    void 값_계산_검증(String left, String operator, String right, String result){
        String[] split = new String[]{left,operator,right};

        Calculator calculator = new Calculator(split);
        Assertions.assertThat(calculator.addOperand()).isEqualTo(result);
    }


    @Test
    void asdf(){
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
    }

}