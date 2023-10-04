package chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DivisibleTest {

    @Test
    public void testThatNumberInputtedCanBeDivisibleByFiveTest(){
        int num = 8;
        boolean result = Divisible.isDivisible(num);
        assertFalse(result);
    }

    @Test
    public void testThatNumberInputtedCanBeDivisibleByFiveTwiceTest(){
        int num = 11;
        boolean result = Divisible.isDivisible(num);
        assertFalse(result);
    }
}
