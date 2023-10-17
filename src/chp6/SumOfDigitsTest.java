package chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfDigitsTest {

    @Test
    public void testThatNumberEnteredCanBeSeperatedAndAddNumberTest(){
        int numberEntered = 7631;
        int number = SumOfDigits.seperatedNumbers(numberEntered);
        assertEquals(17, number);
    }

    @Test
    public void testThatNegativeNumberEnteredCannotBeSeperatedAndAddNumberTest(){
        int numberEntered = -7631;
        int number = SumOfDigits.seperatedNumbers(numberEntered);
        assertEquals(0, number);
    }
}
