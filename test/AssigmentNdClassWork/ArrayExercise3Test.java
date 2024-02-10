package AssigmentNdClassWork;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExercise3Test {

    @Test
    public void testThatArrayExercise3CanReturnHcfTest(){
        int[] nums = {8,4,12};
        int num1 = 2;
        int[]result =  ArrayExercise3.canReturnHcf(nums, num1);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{2, 2}, result);
    }
}