package com.example.cicd;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 * Hinweise:
 * - Ergänze weitere Testfälle (z. B. negative Zahlen, große Werte)
 * - Diskutiere das Verhalten von divide(… , 0) und entscheide in Ü2, ob Exception sinnvoller ist
 */
class CalculatorTest {

    @Test
    void addShouldSumTwoIntegers() {
        Calculator c = new Calculator();
        assertEquals(5, c.add(2, 3));
        assertEquals(-3, c.add(-1, -2));        // beide negativ
        assertEquals(0, c.add(5, -5)); 
    }

    @Test
    void divideByZeroShouldReturnZeroCurrentBehavior() {
         Calculator c = new Calculator();
    // Erwartet, dass eine IllegalArgumentException geworfen wird,
    // wenn versucht wird, durch 0 zu dividieren.
    assertThrows(IllegalArgumentException.class, () -> c.divide(10, 0));
    }

    @Test
    void sumMethodsShouldProduceSameResult() {
        Calculator c = new Calculator();
        List<Integer> nums = Arrays.asList(1, 2, 3, null, 4);
        assertEquals(c.sumUp(nums), c.addAll(nums));
    }

    @Test
    void subMinusBiggerNumber(){
        Calculator c = new Calculator();
        assertEquals(-1, c.subtract(2, 3));
    }

    @Test
    void addWithNegativeNumbers(){
        Calculator c = new Calculator();
        assertEquals(-3, c.add(2, -5));
    }
 }
