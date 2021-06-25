package guru.qa.service.mock;

import guru.qa.service.Operation;
import guru.qa.service.Reader;

public class MockMultReader implements Reader {
    @Override
    public int readFirstArg() {
        return 3;
    }

    @Override
    public int readSecondArg() {
        return 5;
    }

    @Override
    public Operation readMathOperation() {
        return Operation.MULT;
    }
}
