package github.io.junny;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static github.io.junny.OperandEnum.*;

public class CalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {
            "2:+:3:5",
            "7:-:4:3",
            "6:*:5:30",
            "15:/:3:5"
    },delimiter = ':')
    void 값_계산_검증(Integer left, String operator, Integer right, Integer result){
        Assertions.assertThat(operation(operator,left,right)).isEqualTo(result);
    }
}
