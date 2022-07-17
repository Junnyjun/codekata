package github.io.junny;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

public class CalculatorUtilTest {

    @ParameterizedTest
    @CsvSource(value = {
            "1 + 2 + 3 + 4 + 5",
            "1 - 23 * 75 / 3"
    })
    void 값_을입력_받는다(String input){
        Assertions.assertThatCode(() ->{
            CalculatorUtil stringInput = new CalculatorUtil(input);
            Assertions.assertThat(stringInput.getInput()).isEqualTo(input);
        }).doesNotThrowAnyException();
    }

    @ParameterizedTest
    @CsvSource(value = {
            "$@#$%",
            "1+123&&5"
    })
    void 잘못된_값_을입력_받는다(String input){
        Assertions.assertThatThrownBy(() ->{
            CalculatorUtil stringInput = new CalculatorUtil(input);
            Assertions.assertThat(stringInput.getInput()).isEqualTo(input);
        }).isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void 빈_값_을입력_받는다(String input){
        Assertions.assertThatThrownBy(() ->{
            CalculatorUtil stringInput = new CalculatorUtil(input);
            Assertions.assertThat(stringInput.getInput()).isEqualTo(input);
        }).isInstanceOf(IllegalArgumentException.class);
    }


    @ParameterizedTest
    @CsvSource(value = "1 + 2 + 3 + 4 + 5:9",
    delimiter = ':')
    void 입력_값을_나눈다(String input, int size) {
        Assertions.assertThatCode(() -> {
            CalculatorUtil stringInput = new CalculatorUtil(input);
            String[] result = stringInput.split();
            Assertions.assertThat(result.length).isEqualTo(size);
        }).doesNotThrowAnyException();
    }
}
