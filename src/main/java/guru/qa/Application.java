package guru.qa;

import guru.qa.service.Calculator;
import guru.qa.service.impl.ConsoleReader;

public class Application {

    public static void main(String[] args) {
        String result = new Calculator(new ConsoleReader()).start();
        System.out.println(result);
    }
}
