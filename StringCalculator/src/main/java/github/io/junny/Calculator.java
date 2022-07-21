package github.io.junny;

import java.util.List;

public class Calculator {
    private Long result;

    public String addOperand(List<String> expression){
        if(expression.size() > 3){
            Integer operation = OperandEnum.operation(expression.get(1), expression.get(0), expression.get(2));
            expression.remove(0);
            expression.remove(1);
            expression.remove(2);
            expression.add(0,operation.toString());
            addOperand(expression);
        }
        return expression.get(0);
    }

}
