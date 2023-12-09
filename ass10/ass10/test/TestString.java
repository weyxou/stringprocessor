package test;

import org.example.StringProcessor;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestString {
    @Test
    public void isStrongPassword() {
        StringProcessor sp = new StringProcessor();

        assertTrue(sp.isStrongPassword("abcd@Kc2"));
        assertFalse(sp.isStrongPassword("Weakpassword123"));
        assertFalse(sp.isStrongPassword("OnlyLowerCase"));
        assertFalse(sp.isStrongPassword("1234567890"));
        assertFalse(sp.isStrongPassword("!@#$%^&*()"));


    }

    @Test
    public void calculateDigits() {
        StringProcessor sp = new StringProcessor();

        assertEquals(3,sp.calculateDigits("abc123"));
        assertEquals(0,sp.calculateDigits("NoDigitsHere"));
        assertEquals(9,sp.calculateDigits("456 789 123"));
        assertEquals(2,sp.calculateDigits("Special#Chars!12"));
        assertEquals(0,sp.calculateDigits(""));
    }

    @Test
    public void calculateWords() {
        StringProcessor sp = new StringProcessor();

        assertEquals(4,sp.calculateWords("This is a sentence."));
        assertEquals(0,sp.calculateWords(" "));
        assertEquals(2,sp.calculateWords("Extra    Spaces    "));
        assertEquals(1,sp.calculateWords("OneWordOnly"));
        assertEquals(2,sp.calculateWords("Hello, World!"));
    }

    @Test
    public void calculateExpression() {
        StringProcessor sp = new StringProcessor();

        assertEquals(11.0,sp.calculateExpression("2 + 3 * (4 - 1)"), 0.1);
        assertEquals(4.0,sp.calculateExpression("(10 + 2) / 3"),0.1);
        assertEquals(3.0,sp.calculateExpression("5 - 3 + 1"),0.1);
    }

}