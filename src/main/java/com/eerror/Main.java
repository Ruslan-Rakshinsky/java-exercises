package com.eerror;

import com.eerror.CheckLabels;
import com.eerror.SpamAnalyzer.*;

public class Main {
    public static void main(String[] args) {
        String[] keywords = {"Foo", "Boring", "Bad"};
        String text = "This topic is so boring and bad, I don't like it!";
        CheckLabels checker = new CheckLabels();
        TextAnalyzer[] analyzers = new TextAnalyzer[0];
        checker.checkLabels(analyzers, text);
    }
}