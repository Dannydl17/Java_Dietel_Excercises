package AssigmentNdClassWork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array1Test {

    @Test
    public void testThatTheArrayDoesNotReturnDuplicateTest(){
        int[] number = new int[]{2, 2, 1, 3, 3};
        int actual = Array1.returnNonDuplicate(number);
        assertEquals(1, actual);
    }
    @Test
    public void testThatTheArrayDoesNotReturnDuplicateTwoTest(){
        int[] number = new int[]{2, 2, 1, 3, 3};
        int actual = Array1.returnNonDuplicate(number);
        assertEquals(1, actual);
    }
}