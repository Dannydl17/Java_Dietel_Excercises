package AssigmentNdClassWork;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExerciseTest {

    @Test
    public void testThatArrayCanAddPlusOneTest(){
        int[] numbers = new int[]{1,2,3};
        int[] actual = ArrayExercise.addPlusOneToTheLastIndex(numbers);
        assertEquals(1, actual[0]);
        assertEquals(2, actual[1]);
        assertEquals(4, actual[2]);
        assertEquals(3, actual.length);
    }
    @Test
    public void testThatArrayValueOf9PlusOneWillGive10(){
        int[] numbers = new int[]{9};
        int[] actual = ArrayExercise.addPlusOneToTheLastIndex(numbers);
        System.out.println(Arrays.toString(actual));
        assertArrayEquals(new int[]{1, 0}, actual);
    }

}