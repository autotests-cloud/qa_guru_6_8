package guru.qa.service;

import guru.qa.service.mock.MockMultReader;
import guru.qa.service.mock.MockWriter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;

    @Test
    void calculatorTest() {
        calculator = new Calculator(new MockMultReader(), new MockWriter()); // 3, 5, *
        String result = calculator.start();
        Assertions.assertEquals("3 * 5 = 15", result);
    }
}