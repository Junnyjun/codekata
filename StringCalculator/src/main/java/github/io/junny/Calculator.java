package github.io.junny;

import java.util.ArrayList;

import static github.io.junny.OperandEnum.find;
import static java.util.List.of;

public class Calculator {
    private ArrayList<String> expression;

    public String addOperand(){
        if(expression.size() >= 3){
            Integer operation = find(expression.get(1)).operation(expression.get(0), expression.get(2));
            expression.set(0,operation.toString());
            expression.remove(1);
            expression.remove(2);
            return addOperand();
        }
        return expression.get(0);
    }

    public Calculator(String[] split) {
        this.expression = new ArrayList(of(split));
    }
}
