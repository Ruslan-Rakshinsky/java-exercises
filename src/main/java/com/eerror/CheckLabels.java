package com.eerror;

import com.eerror.SpamAnalyzer.Label;
import com.eerror.SpamAnalyzer.TextAnalyzer;

public class CheckLabels {
    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer: analyzers) {
            Label result;
            if ((result = analyzer.processText(text)) != Label.OK) {
                return result;
            }
        }
        return Label.OK;
    }
}
