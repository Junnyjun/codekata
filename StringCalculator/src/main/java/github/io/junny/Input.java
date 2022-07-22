package github.io.junny;

import java.util.Scanner;

public class Input {
    private String output;

    public Input() {
        Scanner scanner = new Scanner(System.in);
        this.output = scanner.nextLine();
    }

    public static String execute(){
        return new Input().output;
    }
}
