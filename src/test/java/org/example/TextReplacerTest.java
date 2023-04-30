package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TextReplacerTest {
    private String originalText;

    @BeforeEach
    public void setUp(){
        originalText = "Samsung and Apple are the biggest company in the world!";
    }

    @Test
    public void replaceNameIfProducerNameExist(){
        String producerName = "Samsung";
        String replacementText = "blablacar";

        TextReplacer processor = new TextReplacer();
        String expectedParsedInfo = "blablacar and Apple are the biggest company in the world!";
        String resultParsedInfo = processor.replaceName(originalText, producerName, replacementText);

        assertEquals(expectedParsedInfo, resultParsedInfo);
    }

    @Test
    public void replaceNameIfProducerNameNotExist(){
        String producerName = "Sheep";
        String replacementText = "blablacar";

        TextReplacer processor = new TextReplacer();
        String expectedParsedInfo = originalText;
        String resultParsedInfo = processor.replaceName(originalText, producerName, replacementText);

        assertEquals(expectedParsedInfo, resultParsedInfo);
    }
}