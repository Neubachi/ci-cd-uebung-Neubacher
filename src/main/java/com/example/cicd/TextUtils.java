package com.example.cicd;

public class TextUtils {

    public static boolean isPalindrome(String input) {
    if (input == null) return false;

    String lower = input.toLowerCase();
    String reversed = new StringBuilder(lower).reverse().toString();

    return lower.equals(reversed);
}


public static int safeParseInt(String s) {
    try {
        return Integer.parseInt(s);
    } catch (NumberFormatException e) {
        // Log-Nachricht oder sinnvolle Reaktion:
        System.err.println("Invalid integer input: " + s);
        return 0; // Rückgabewert bei ungültiger Zahl
    }
}

}
