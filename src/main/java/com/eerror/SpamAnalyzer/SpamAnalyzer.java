package com.eerror.SpamAnalyzer;

public class SpamAnalyzer extends KeywordAnalyzer {
    private final String[] keywords;
    private final Label label = Label.SPAM;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }
    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return label;
    }
}
