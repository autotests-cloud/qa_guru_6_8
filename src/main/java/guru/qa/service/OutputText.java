package guru.qa.service;

public enum OutputText {
    NUM_TEXT("������� ��� �����: "),
    OPER_TEXT("������� �������� (+, *, /, -, ^)"),
    RESULT_TEXT("���������: ");

    private final String text;

    OutputText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
