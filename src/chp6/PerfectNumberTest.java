package chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PerfectNumberTest {

    @Test
    public void testThatANumberEnterIsAPerfectNumberTest(){
        int number = 6;
        int perfectNumber = PerfectNumber.isPerfectNumber(number);
        assertEquals(6, perfectNumber);
    }
}
