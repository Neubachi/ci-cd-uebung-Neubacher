package com.example.cicd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

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
    void safeParseIntNullReturnsZero() {
        assertEquals(0, TextUtils.safeParseInt(null));
    }

    @Test
    void isPalindromeCaseInsensitive() {
        assertTrue(TextUtils.isPalindrome("Anna"));
    }

    @Test
    void isPalindromeReturnsFalseForNonPalindrome() {
        assertFalse(TextUtils.isPalindrome("Test"));
    }

    @Test
    void isPalindromeReturnsFalseOnNull() {
        assertFalse(TextUtils.isPalindrome(null));
    }

    @Test
    void isPalindromeWorksWithSingleCharacter() {
        assertTrue(TextUtils.isPalindrome("a"));
    }

    @Test
    void isPalindromeEmptyStringShouldBePalindrome() {
        assertTrue(TextUtils.isPalindrome(""));
    }
}
