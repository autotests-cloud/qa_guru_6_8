package guru.qa.service;

public class Calculator {

    private final Reader reader;

    public Calculator(Reader reader) {
        this.reader = reader;
    }

    public String start() {
        System.out.println("Please provide first argument");
        System.out.print("Введите два числа: ");
        int first = reader.readFirstArg();
        int second = reader.readSecondArg();
        System.out.print("Введите оператор (+, *): ");
        Operation po = reader.readMathOperation();
        int sum = po.getOperation().invoke(first, second);
        System.out.print("\nРезультат:\n");
        return first + " " + po.getSymbol() + " " + second + " = " + sum;
    }
}
