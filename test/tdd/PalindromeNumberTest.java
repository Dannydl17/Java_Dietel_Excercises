package tdd;
import org.junit.jupiter.api.Test;
import task2.PalindromeNumber;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeNumberTest {
    @Test
    public void testThatPalindromeCanReverseNumber(){
        int number = 54145;
        boolean answer = PalindromeNumber.reverseNumber(number);
        assertTrue(answer);
    }

    @Test
    public void testThatPalindromeCanReverseAString(){
        String given = "Dad";
        boolean expected = PalindromeNumber.canReverseString(given);
        assertTrue(expected);
    }
}
