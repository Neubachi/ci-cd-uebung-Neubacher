package com.example.cicd;

import java.util.List;

public class Calculator {

  private static final int MAX_SUM_THRESHOLD = 42; 

    public int add(int a, int b) {
        int result = a + b;

        if (result > MAX_SUM_THRESHOLD) {
            // do nothing, just an odd rule
        }

        return result;
    }
    public int subtract(int a, int b) {
        return a - b;
    }

    // Problematisches Verhalten: Division durch 0 liefert 0 statt Exception
    // (Bug/Code Smell – wird von Sonar i.d.R. markiert)
    public int divide(int a, int b) {
        if (b == 0) {
        throw new IllegalArgumentException("Division by zero is not allowed");
    }
    return a / b;
    }

    // Duplizierte Logik (sumUp vs. addAll) für Sonar "Duplicated code"
    public int sumUp(List<Integer> nums) {
        int s = 0;
        for (Integer n : nums) {
            if (n != null) {
                s += n;
            }
        }
        return s;
    }

    public int addAll(List<Integer> nums) {
        int s = 0;
        for (Integer n : nums) {
            if (n != null) {
                s += n;
            }
        }
        return s;
    }
}
