package org.example;

public class Main {

    public static void main(String[] args) {
        // Test cases
        StringProcessor stringProcessor = new StringProcessor();

        // Test isStrongPassword
        System.out.println("Test isStrongPassword:");
        System.out.println(stringProcessor.isStrongPassword("StrongP@ssword")); // true
        System.out.println(stringProcessor.isStrongPassword("jibekP0000@")); // false
        System.out.println(stringProcessor.isStrongPassword("OnlyLowerCase")); // false
        System.out.println(stringProcessor.isStrongPassword("1234567890")); // false
        System.out.println(stringProcessor.isStrongPassword("!@#$%^&*()")); // false
        // Test calculateDigits
        System.out.println("\nTest calculateDigits:");
        System.out.println(stringProcessor.calculateDigits("abc123")); // 3
        System.out.println(stringProcessor.calculateDigits("NoDigitsHere")); // 0
        System.out.println(stringProcessor.calculateDigits("456 789 123")); // 9
        System.out.println(stringProcessor.calculateDigits("Special#Chars!12")); // 2
        System.out.println(stringProcessor.calculateDigits("")); // 0

        // Test calculateWords
        System.out.println("\nTest calculateWords:");
        System.out.println(stringProcessor.calculateWords("This is a sentence.")); // 4
        System.out.println(stringProcessor.calculateWords("")); // 0
        System.out.println(stringProcessor.calculateWords("   Extra   Spaces   ")); // 2
        System.out.println(stringProcessor.calculateWords("OneWordOnly")); // 1
        System.out.println(stringProcessor.calculateWords("Hello, World!")); // 2

        // Test calculateExpression
        System.out.println("\nTest calculateExpression:");
        System.out.println(stringProcessor.calculateExpression("2 + 3 * (4 - 1)")); // 11.0
        System.out.println(stringProcessor.calculateExpression("(10 + 2) / 3")); // 4.0
        System.out.println(stringProcessor.calculateExpression("5 - 3 + 1")); //
    }
}