package chp6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HypotenuseTest {

    @Test
    public void testThatHypotenuseCanCollectInputTest(){
        int number = 2;
        int num = Hypotenuse.collectInput(number);
        assertEquals(2, num);
    }

    @Test
    public void testThatHypotenuseCanSquareFirstNumberInputTest(){
        double firstNumber = 3.0;
        double secondNumber = 4.0;
        double p = 2;
        double x = Hypotenuse.powersFirstNumber(secondNumber,p);
        double num = Hypotenuse.powersFirstNumber(firstNumber,p);
        double y = x+num;
        assertEquals(9, num);
        assertEquals(16,x);
        assertEquals(25,y);
    }

    @Test
    public void testThatHypotenuseCanSquareNumberTest(){
        int squareNumber = 25;
        int newNumber = Hypotenuse.squareNumber(squareNumber);
        assertEquals(5, newNumber);
    }
}
