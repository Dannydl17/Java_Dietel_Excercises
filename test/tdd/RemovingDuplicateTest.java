package tdd;

import org.junit.jupiter.api.Test;
import task.RemovingDuplicates;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RemovingDuplicateTest {

    @Test
    public void testThatDuplicateCanBeReturnTest(){
        int[] number = {1,2,3,3,2,4,5,6,};
        int[] result = RemovingDuplicates.canRemoveDuplicate(number);
        int[] actual = {2,3};
        assertArrayEquals(result, actual);
    }

}
