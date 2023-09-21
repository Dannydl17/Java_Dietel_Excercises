package chp5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateTest {
    @Test
    public void testThatICanCalculateDifferentTermTest(){
        Calculate calculate = new Calculate();
        double newCalculate = Double.parseDouble(String.valueOf(calculate.calculateNumberOfTerm(4)));
        assertEquals(2.8952380952380956, newCalculate);
    }
}
