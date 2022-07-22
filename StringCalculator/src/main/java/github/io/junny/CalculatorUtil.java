package github.io.junny;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorUtil {
    private static final Pattern OPERAND_REGEX = Pattern.compile("^\\d+( ?[+\\-*/] ?\\d+)*$");

    private String expression;
    public CalculatorUtil(String expression){
        isBlank(expression);
        isOperand(expression);
        this.expression = expression;
    }

    public String getInput() {
        return expression;
    }

    private void isOperand(String operand){
        Matcher matcher = OPERAND_REGEX.matcher(operand);
        if(!matcher.find()){
            throw new IllegalArgumentException("유효한 값이 아닙니다");
        }
    }

    private void isBlank(String operand){
        if(operand == null || operand.trim().length()==0){
            throw new IllegalArgumentException("유효한 값이 아닙니다");
        }
    }

    public String[] split() {
        return expression.split(" ");
    }
}
