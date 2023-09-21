package chp5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivisibleTest {
    @Test
    public void testThatNumbersCanBeDivisibleTest() {
        Divisible divisible = new Divisible();
        int number = Integer.parseInt(String.valueOf(divisible.calculateDivisibleNumber(3)));
        assertEquals(30, number);
    }
}