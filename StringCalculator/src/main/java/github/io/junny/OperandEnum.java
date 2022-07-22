package github.io.junny;

import java.util.EnumSet;
import java.util.function.BinaryOperator;

import static java.lang.Integer.parseInt;

public enum OperandEnum {
    PLUS("+", (left, right) -> left + right),
    MINUS("-", (left, right) -> left - right),
    DIVIDE("/", (left, right) -> left / right),
    MULTIPLY("*", (left, right) -> left * right);

    private final String code;
    private final BinaryOperator<Integer> operation;


    OperandEnum(String code, BinaryOperator<Integer> operation) {
        this.code = code;
        this.operation = operation;
    }

    public static OperandEnum find(String code){
        return EnumSet.allOf(OperandEnum.class)
                .stream()
                .filter(c -> c.code.equals(code))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("유요한 연산자가 아닙니다"));
    }

    public int operation(String left, String right){
        return this.operation.apply(parseInt(left), parseInt(right));
    }

}
