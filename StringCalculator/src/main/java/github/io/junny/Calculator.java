package github.io.junny;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    private final List<Integer> operandList;
    private final List<String> operatorList;

    public Calculator(List<Integer> operandList, List<String> operatorList) {
        this.operandList = operandList;
        this.operatorList = operatorList;
    }

    public void addOperand(Integer operand){
        operandList.add(operand);
    }

}
