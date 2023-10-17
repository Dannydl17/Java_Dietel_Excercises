package chp6;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeTest {

    @Test
    public void testThatPalindromeCanBeCalculatedTest(){
        int number = 54145;
        boolean answer = Palindrome.isPalindrome(number);
        assertTrue(answer);
    }
}
