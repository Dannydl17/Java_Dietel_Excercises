package chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MultiplesTest {

    @Test
    public void testThatMultiplesCanCalculate(){
        int firstNumber = 5;
        int secondNumber = 20;
        boolean newNumber = Multiples.isMultiplesOf(firstNumber,secondNumber);
        assertTrue(newNumber);
    }
}
