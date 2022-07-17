package github.io.junny;

import java.util.List;

public class Calculator {
    private final List<Integer> operandList;
    private final List<OperandEnum> operatorList;


    public Calculator(List<Integer> operandList, List<OperandEnum> operatorList) {
        this.operandList = operandList;
        this.operatorList = operatorList;
    }

    public void addOperand(Integer operand){
        operandList.add(operand);
    }

}
