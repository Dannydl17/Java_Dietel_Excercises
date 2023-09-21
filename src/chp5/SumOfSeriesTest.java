package chp5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumOfSeriesTest {
    @Test
    public void testThatSumOfSeriesCanBeCalculated(){
        SumOfSeries sumOfSeries = new SumOfSeries();
        long newNumber = sumOfSeries.calculateSumOfSeries(10);
        assertEquals(55, newNumber);
    }
}
