package AssigmentNdClassWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayOfDoubleTest {

    @Test
    public void testThatArrayCanReturnTheDoubleOfTheLengthTest(){
        int[] numbers = {4,5,8};
        int[] expected = {4,5,8,8,10,16};
        int[] actual = ArrayOfDouble.doubleElements(numbers);
        assertArrayEquals(expected, actual);
    }

}