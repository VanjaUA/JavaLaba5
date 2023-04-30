package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextReplacer {
    public String replaceName(String originalText, String producerName, String replacementText) {
        Pattern pattern = Pattern.compile(producerName, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(originalText);

        StringBuffer newText = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(newText, replacementText);
        }
        matcher.appendTail(newText);

        return newText.toString();
    }

}
