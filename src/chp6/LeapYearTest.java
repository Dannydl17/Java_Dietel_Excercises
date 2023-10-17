package chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest {

    @Test
    public void testThatYearCanBeCollectInputTest(){
        int numberOfYear = 2012;
        int number = LeapYear.collectInput(numberOfYear);
        assertEquals(2012, number);
    }

    @Test
    public void testThatYearCanBeTestLeapYearTest(){
        int numberOfYear = 2012;
        String number = LeapYear.testLeapYear(numberOfYear);
        assertEquals("is a leapYear", number);
    }

    @Test
    public void testThatYearCannotBeALeapYearTest(){
        int numberOfYear = 2014;
        String number = LeapYear.testLeapYear(numberOfYear);
        assertEquals("is not a leapYear", number);
    }
}
