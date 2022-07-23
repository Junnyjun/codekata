package github.io.junny;

import java.util.Scanner;

import static github.io.junny.Input.execute;

public class Main {
    public static void main(String[] args) {
        String[] expression = new CalculatorUtil(execute()).split();
        System.out.println("result = " + new Calculator(expression).addOperand());
    }
}
