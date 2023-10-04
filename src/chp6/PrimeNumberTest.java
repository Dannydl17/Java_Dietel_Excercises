package chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PrimeNumberTest {

    @Test
    public void testThatItIsNotAPrimeNumberTest(){
        int number = 4;
        boolean result = primeNumber.isPrimeNumber(number);
        assertFalse(result);
    }

    @Test
    public void testThatItIsAPrimeNumberTest(){
        int number = 7;
        boolean result = primeNumber.isPrimeNumber(number);
        assertTrue(result);
    }
}
