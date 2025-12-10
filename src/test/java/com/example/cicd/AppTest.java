package com.example.cicd;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void mainShouldRunWithoutErrors() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        App.main(new String[]{});

        String text = output.toString();

        assertTrue(text.contains("Sum(2,3) = 5"));
        assertTrue(text.contains("sumUp=10, addAll=10"));
        assertTrue(text.contains("isPalindrome('Anna')? true"));
        assertTrue(text.contains("safeParseInt('42'): 42"));
        assertTrue(text.contains("safeParseInt('x'): 0"));
    }
}
