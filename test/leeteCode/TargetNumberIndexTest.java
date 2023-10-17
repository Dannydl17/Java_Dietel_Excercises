package leeteCode;

import leetecode.TargetNumberIndex;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TargetNumberIndexTest {

    @Test
    public void testThatAnArrayCanBeAddedTest(){
        int[] numberAdded = {2,7,11,15};
        int targetNumber = 9;
        int[] actual = {0, 1};
        assertArrayEquals(actual , TargetNumberIndex.calculateAddition(numberAdded, targetNumber));
    }
}
