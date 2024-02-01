package tdd;

import org.junit.jupiter.api.Test;
import task2.Hcf;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class HcfTest {

    @Test
    public void testThatHcfTestCanReturnAnArrayOfDivisibleNumbers(){
        int[] nums = {2,10};
        int[] result =  Hcf.canReturnNUmberDivisible(20);
        assertArrayEquals(result, Hcf.canReturnNUmberDivisible(20));
    }
}
