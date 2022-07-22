package github.io.junny;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static github.io.junny.OperandEnum.find;
import static java.util.Collections.singleton;
import static java.util.List.of;

public class Calculator {
    private ArrayList<String> expression;

    public String addOperand(){
        if(expression.size() >= 3){
            Integer operation = find(expression.get(1)).operation(expression.get(0), expression.get(2));
            expression.remove(2);
            expression.remove(1);
            expression.set(0,operation.toString());
            return addOperand();
        }
        return expression.get(0);
    }

    public Calculator(String[] split) {
        this.expression = new ArrayList(of(split));
    }
}
