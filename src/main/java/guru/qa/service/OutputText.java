package guru.qa.service;

public enum OutputText {
    NUM_TEXT("¬ведите два числа: "),
    OPER_TEXT("¬ведите оператор (+, *, /, -, ^)"),
    RESULT_TEXT("–езультат: ");

    private final String text;

    OutputText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
