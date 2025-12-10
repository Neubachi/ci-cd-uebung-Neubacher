package com.example.cicd;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void addShouldSumTwoIntegers() {
        Calculator c = new Calculator();
        assertEquals(5, c.add(2, 3));
        assertEquals(-3, c.add(-1, -2));
        assertEquals(0, c.add(5, -5));
    }

    @Test
    void addOverThresholdStillReturnsResult() {
        Calculator c = new Calculator();
        assertEquals(50, c.add(30, 20));  // >42 -> Branch wird ausgeführt
    }

    @Test
    void subtractVariousCases() {
        Calculator c = new Calculator();
        assertEquals(1, c.subtract(5, 4));
        assertEquals(-10, c.subtract(-5, 5));
        assertEquals(0, c.subtract(3, 3));
    }

    @Test
    void divideNormal() {
        Calculator c = new Calculator();
        assertEquals(5, c.divide(10, 2));
    }

    @Test
    void divideByZeroShouldThrow() {
        Calculator c = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> c.divide(10, 0));
    }

    @Test
    void sumMethodsShouldProduceSameResult() {
        Calculator c = new Calculator();
        List<Integer> nums = Arrays.asList(1, 2, 3, null, 4);
        assertEquals(c.sumUp(nums), c.addAll(nums));
    }

    @Test
    void sumUpHandlesNullValues() {
        Calculator c = new Calculator();
        List<Integer> nums = Arrays.asList(null, null, 5);
        assertEquals(5, c.sumUp(nums));
    }

    @Test
    void addAllHandlesNullValues() {
        Calculator c = new Calculator();
        List<Integer> nums = Arrays.asList(1, null, 1);
        assertEquals(2, c.addAll(nums));
    }
}
