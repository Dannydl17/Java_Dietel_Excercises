package chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PackingChargesTest {

    @Test
    public void testThatPackingChargesAppCollectInputTheNumberOfHour(){
        int numberOfHour = 2;
        int number = PackingCharges.inputTheNumberOfHour(numberOfHour);
        assertEquals(2, number);
    }

    @Test
    public void testThatPackingChargesAppCalculateChargesTest(){
        int numberOfHour = 2;
        double number =  PackingCharges.calculateCharges(numberOfHour);
        assertEquals(2.00, number);
    }
}
