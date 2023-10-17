package tdd;

import AssigmentNdClassWork.Personal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonalTest {

    @Test
    void testThatArrayCanAddEvenPosition(){
        int[] given ={5,4,1,0,6,7,9};
        int actual = Personal.canAddArrayEvenPosition(given);
        assertEquals(21,actual);
    }

    @Test
    void testThatArrayCanAddOddPosition(){
        int[] given ={5,4,1,0,6,7,9};
        int actual = Personal.canAddArrayOddPosition(given);
        assertEquals(11,actual);
    }

    @Test
    void testThatArrayCanAddOddNumber(){
        int[] given ={5,4,1,0,6,7,9};
        int actual = Personal.canAddArrayOddNumber(given);
        assertEquals(22,actual);
    }

    @Test
    void testThatArrayCanAddEvenNumber(){
        int[] given ={5,4,1,0,6,7,9};
        int actual = Personal.canAddArrayEvenNumber(given);
        assertEquals(10,actual);
    }

}