package com.example.cicd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 * Hinweis:
 * - Dieser Test wird voraussichtlich FAILEN, weil isPalindrome '==' nutzt.
 * - In Uebung 2 sollte dieser Bug gefixt werden.
 */
class TextUtilsTest {

    @Test
    void safeParseIntValidNumberReturnsValue() {
        assertEquals(42, TextUtils.safeParseInt("42"));
    }

    @Test
    void safeParseIntInvalidNumberReturnsZero() {
        assertEquals(0, TextUtils.safeParseInt("x"));
    }

    @Test
    void isPalindromeCaseInsensitiveExpectedTrue() {
        assertTrue(TextUtils.isPalindrome("Anna"));
    }
}
