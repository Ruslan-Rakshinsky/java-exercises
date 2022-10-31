package com.eerror.SpamAnalyzer;

public class TooLongTextAnalyzer implements TextAnalyzer{
    private final int maxLength;
    TooLongTextAnalyzer(int length) {
        this.maxLength = length;
    }

    @Override
    public Label processText(String text) {
        return text.length() > maxLength ? Label.TOO_LONG : Label.OK;
    }
}
