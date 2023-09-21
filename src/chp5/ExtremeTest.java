package chp5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExtremeTest {
    @Test
    public void testThatExtremeCanCollectNumber(){
        Extremes extremes = new Extremes();
        int newNumber = extremes.collectNumber(123);
        assertEquals(123, newNumber);
    }

    @Test
    public void testThatExtremeCanCalculatedMinimumNumber() {
        Extremes extremes = new Extremes();
        extremes.collectNumber(9);
        int number = extremes.calculateMinimum(12);
         assertEquals(12, number);
    }

    @Test
    public void testThatExtremeCanCalculatedMaximumNumber() {
        Extremes extremes = new Extremes();
        extremes.collectNumber(9);
        int number = extremes.calculateMaximum(12);
        assertEquals(12, number);
    }
}
