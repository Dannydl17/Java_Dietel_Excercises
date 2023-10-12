package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardTest {

    @Test
    public void testThatCreditCardCanCollectNumber(){
        String number = "4388576018402626";
        String num = CreditCard.collectInput(number);
        assertEquals(num,number);
    }
    @Test
    public void testThatCreditCardCanDoubleSecondDigitTest(){
        String num = "4388576018402626";
        int actual = CreditCard.doubleSecondDigit(num);
        assertEquals(37, actual);
    }

    @Test
    public void testThatCreditCardCanAddOddPlaceDigitTest(){
        String num = "4388576018402626";
        int actual = CreditCard.oddPlaceDigit(num);
        assertEquals(38, actual);
    }

    @Test
    public void testThatCreditCardCanAddNumberTogetherTest(){
        int num = 37;
        int num1 = 38;
        String actual = CreditCard.addNumberTogether(num, num1);
        assertEquals("It is invalid", actual);
    }
}
