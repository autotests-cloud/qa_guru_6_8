package guru.qa.service;

import guru.qa.service.mock.MockWriter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static guru.qa.service.OutputText.*;

class TextWriterTest {

    @Test
    void textNumberTest() {
        Assertions.assertEquals("������� ��� �����: ", new MockWriter().handleString(NUM_TEXT.getText()));
    }

    @Test
    void textOperationTest() {
        Assertions.assertEquals("������� �������� (+, *, /, -, ^)", new MockWriter().handleString(OPER_TEXT.getText()));
    }

    @Test
    void textResultTest() {
        Assertions.assertEquals("���������: ", new MockWriter().handleString(RESULT_TEXT.getText()));
    }

}