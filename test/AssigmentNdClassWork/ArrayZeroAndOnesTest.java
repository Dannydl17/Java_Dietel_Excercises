package AssigmentNdClassWork;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayZeroAndOnesTest {

    @Test
    public void testThatArrayOfNumberCanReturnZeroAndOnesTest(){
        int[] numbers = {4,5,8,8,8,2,9};
        int[] actual = ArrayZeroAndOnes.canReplacedWithZerosAndOnes(numbers);
        assertEquals(0, actual[0]);
        assertEquals(1, actual[1]);
        assertEquals(0, actual[2]);
        assertEquals(0, actual[3]);
        assertEquals(0, actual[4]);
        assertEquals(0, actual[5]);
        assertEquals(1, actual[6]);
        System.out.println(Arrays.toString(actual));
        assertEquals(7, actual.length);
    }

}