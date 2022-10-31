package com.eerror.SpamAnalyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private final String[] keywords = {":(", "=(", ":|"};
    private final Label label = Label.NEGATIVE_TEXT;

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return label;
    }
}
