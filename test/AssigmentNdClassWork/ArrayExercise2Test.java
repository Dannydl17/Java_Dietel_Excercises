package AssigmentNdClassWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExercise2Test {

    @Test
    public void testThatArrayExerciseCanAddTwoEvenPositionTest(){
        int[] numberArrays = new int[]{2,3,5,6,7,2};
        int[] actual = ArrayExercise2.canAddTwoPosition(numberArrays);
        assertEquals(5, actual[0]);
        assertEquals(11, actual[1]);
        assertEquals(9, actual[2]);
        assertEquals(3, actual.length);
    }

    @Test
    public void testThatArrayExerciseCanAddTwoOddPositionTest(){
        int[] numberArrays = new int[]{3,4,5,1,5};
        int[] actual = ArrayExercise2.canAddTwoPosition(numberArrays);
        assertEquals(7, actual[0]);
        assertEquals(6, actual[1]);
        assertEquals(5, actual[2]);
        assertEquals(3, actual.length);
    }

}