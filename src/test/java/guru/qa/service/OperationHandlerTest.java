package guru.qa.service;

import guru.qa.service.impl.MinusOperationHandler;
import guru.qa.service.impl.MultOperationHandler;
import guru.qa.service.impl.SumOperationHandler;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OperationHandlerTest {

    private OperationHandler handler;

    @Test
    void sumTest() {
        handler = new SumOperationHandler();
        int sum = handler.invoke(3, 5);
        Assertions.assertEquals(8, sum);
    }

    @Test
    void multTest() {
        handler = new MultOperationHandler();
        Assertions.assertEquals(15, handler.invoke(3, 5));
    }

    @Test
    void minusTest() {
        handler = new MinusOperationHandler();
        Assertions.assertEquals(4, handler.invoke(10, 6));
    }
}