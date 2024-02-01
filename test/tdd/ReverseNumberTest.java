package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseNumberTest {

    @Test
    public void testThatNumberCanBeReversedTest(){
        int number = 3456;
        int reverseNumber = ReverseNumber.reverseNumber(number);
        assertEquals(6543, reverseNumber);
    }

    @Test
    public void testThatNumberCanBeReversed1Test(){
        int number = -123;
        int reverseNumber = ReverseNumber.reverseNumber1(number);
        assertEquals(-321, reverseNumber);
    }
}
