package chp7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VariableLengthTest {

    @Test
    public void testThatNumberCanBeAddedTogetherTest(){
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numAdded = VariableLength.calculateNumber(numbers);
        assertEquals(55, numAdded);
    }
    @Test
    public void testThatNumberCanBeAddedTogetherAndFindAverageTest(){
        int[] numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double numAdded = VariableLength.calculateAverageNumber(numbers);
        assertEquals(5.5, numAdded);
    }
}