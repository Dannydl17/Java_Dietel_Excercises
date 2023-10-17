package tdd;

import AssigmentNdClassWork.DuplicateElement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateElementTest {

    @Test
    void testThatElementCanBeCompareTest(){
        int[] element = {4,9,4,4,7,1,9};
        int[] actual = DuplicateElement.canCompareElement(element);
        assertEquals(4, actual[0]);
        assertEquals(9, actual[1]);
        assertEquals(7, actual.length);
    }

    @Test
    void testThatElementCanCalculateLengthIfNotZeroTest(){
        int[] element = {4,9,0,0,7,1,0};
        int actual = DuplicateElement.canCalculateElement(element);
        assertEquals(4, actual);
    }

    @Test
    void testThatElementCanCalculateLengthAndReturnAnArrayTest(){
        int[] element = {4,9,0,0,7,1,0};;
        int[] actual = DuplicateElement.canReturnAnArray(element);
        assertEquals(4, actual[0]);
        assertEquals(9, actual[1]);
        assertEquals(4, actual.length);
    }

}