package guru.qa.service.impl;

import guru.qa.service.Writer;

public class ConsoleWriter implements Writer {
    @Override
    public String handleString(String inputString) {
        System.out.printf(inputString);
        return inputString;
    }
}
