package com.example.cicd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class NumberUtilsTest {

    @Test
    void divisibleBy3ShouldBeSpecial() {
        assertTrue(NumberUtils.isSpecial(9));
    }

    @Test
    void divisibleBy5ShouldBeSpecial() {
        assertTrue(NumberUtils.isSpecial(10));
    }

    @Test
    void divisibleBy7ShouldBeSpecial() {
        assertTrue(NumberUtils.isSpecial(14));
    }

    @Test
    void magicNumbers13And17AreSpecial() {
        assertTrue(NumberUtils.isSpecial(13));
        assertTrue(NumberUtils.isSpecial(17));
    }

    @Test
    void notSpecialNumberReturnsFalse() {
        assertFalse(NumberUtils.isSpecial(11));
    }
}
