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
}
