package AssigmentNdClassWork;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfBooleanTest {

    @Test
    public void testThatArrayOfNumberCanReturnBooleanTest(){
        int[] numbers = {4,5,8,8,8,2,9};
        boolean[] actual = ArrayOfBoolean.canReplacedWithBoolean(numbers);
        assertEquals(false, actual[0]);
        assertEquals(true, actual[1]);
        assertEquals(false, actual[2]);
        assertEquals(false, actual[3]);
        assertEquals(false, actual[4]);
        assertEquals(false, actual[5]);
        assertEquals(true, actual[6]);
        System.out.println(Arrays.toString(actual));
        assertEquals(7, actual.length);
    }

}