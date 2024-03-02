package AssigmentNdClassWork;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExercise3Test {

    @Test
    public void testThatArrayExercise3CanReturnHcfTest(){
        int[] nums = {22, 33, 44};
        int[]result =  ArrayExercise3.canReturnHcf(nums);
        System.out.println(Arrays.toString(result));
        assertArrayEquals(new int[]{11}, result);
    }
    @Test
    public void testThatArrayExercise3CanReturnLcmTest(){
        int nums = 18; // 2,3,6,9,18
        int[]result =  ArrayExercise3.canReturnLcm(nums);
        assertArrayEquals(new int[]{2,3,3}, result);
    }
    @Test
    public void testThatArrayExercise3CanReturnFactorsTest(){
        int nums = 18; // 2,3,6,9,18
        int[]result =  ArrayExercise3.canReturnFactors(nums);
        assertArrayEquals(new int[]{2,3,6,9,18}, result);
    }
}