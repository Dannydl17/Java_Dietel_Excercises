package AssigmentNdClassWork;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExercise3Test {

    @Test
    public void testThatArrayExercise3CanReturnHcfTest(){
        int[] nums = {18,36};
        int num1 = 2;
        int[]result =  ArrayExercise3.canReturnHcf(nums, num1);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{2,3,3}, result);
    }
    @Test
    public void testThatArrayExercise3CanReturnLcmTest(){
        int nums = 18;
        int[]result =  ArrayExercise3.canReturnLcm(nums);
        assertArrayEquals(new int[]{2,3,3}, result);
    }
}