package guru.qa.service;

import static guru.qa.service.OutputText.*;

public class Calculator {

    private final Reader reader;
    private final Writer writer;

    public Calculator(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public String start() {
        writer.handleString(NUM_TEXT.getText());
        int first = reader.readFirstArg();
        int second = reader.readSecondArg();
        writer.handleString(OPER_TEXT.getText());
        Operation po = reader.readMathOperation();
        int sum = po.getOperation().invoke(first, second);
        writer.handleString(RESULT_TEXT.getText());
        return first + " " + po.getSymbol() + " " + second + " = " + sum;
    }
}
