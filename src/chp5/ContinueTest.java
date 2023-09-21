package chp5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContinueTest {
    @Test
    public void testThatContinueCanSkipANumber(){
        Continue count = new Continue();
        int number = Integer.parseInt(String.valueOf(count.calculateCount(1)));
        assertEquals(11, number);
    }
}
