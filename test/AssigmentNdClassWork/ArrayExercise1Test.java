package AssigmentNdClassWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayExercise1Test {

    @Test
    public void testThatArrayExerciseCanReturnTheHighestOccurrenceTest(){
        int [] number = new int[]{2,1,1,3,2,3,2,2,3};
        int actual = ArrayExercise1.highestOccurrence(number);
        assertEquals(2, actual);
    }

    @Test
    public void testThatArrayExerciseCanReturnTheHighestOccurrenceTest2(){
        int [] number = new int[]{1, 1, 1, 2, 2, 2, 4, 2};
        int actual = ArrayExercise1.highestOccurrence(number);
        assertEquals(2, actual);
    }
}