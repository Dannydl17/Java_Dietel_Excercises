package AssigmentNdClassWork;

import org.junit.jupiter.api.Test;
import task2.Hcf;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExercise3Test {

    @Test
    public void testThatArrayExercise3CanReturnHcfTest(){
        int[] nums = new int[]{8,4,12};
        int[]result =  ArrayExercise3.canReturnHcf(nums);
        assertEquals(2, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result.length);
    }

}