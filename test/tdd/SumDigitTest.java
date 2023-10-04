package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumDigitTest {

    @Test
    public void testThatNumberEnteredCanBeSeperatedAndAddNumberTest(){
        int numberEntered = 234;
        int number = SumDigit.canSeperatedNumbers(numberEntered);
        assertEquals(9, number);
    }

    @Test
    public void testThatNumberEnteredCanBeSeperatedNotAddNegativeNumberTest(){
        int numberEntered = -234;
        int number = SumDigit.canSeperatedNumbers(numberEntered);
        assertEquals(0, number);
    }

}
