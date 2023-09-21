package tdd;

import assignments.Function;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FunctionTest {

    @Test
    public void testThatNumberIsEvenTest(){
        int result = 8;
        boolean answer = Function.isEven(result);
        assertTrue(answer);
    }

    @Test
    public void testThatNumberIsOddTest(){
        int result = 3;
        boolean answer = Function.isEven(result);
        assertFalse(answer);
    }

    @Test
    public void testThatPrimeNumberCanBeCalculated(){
        int number = 2;
        boolean result = Function.isPrimeNumber(number);
        assertTrue(result);
    }

    @Test
    public void testThatItIsNotAPrimeNumberTest(){
        int number = 4;
        boolean result = Function.isPrimeNumber(number);
        assertFalse(result);
    }

    @Test
    public void testThatPalindromeCanBeCalculatedTest(){
        int number = 54145;
        boolean answer = Function.isPalindrome(number);
        assertTrue(answer);
    }

    @Test
    public void testThatFactorCanBeCalculatedTest(){
        int factor = 10;
        int result = Function.factorOf(factor);
        assertEquals(4, result);
    }

    @Test
    public void testThatFactorialCanBeCalculatedTest(){
        int number = 5;
        int result = Function.factorialOf(number);
        assertEquals(120, result);
    }

    @Test
    public void testThatNumberCanBeSquaredTest(){
        int number = 25;
        boolean result = Function.isSquare(number);
        assertTrue(result);
    }

    @Test
    public void testThatNumbersCanBeSubtractedTest(){
        int firstNumber = 3;
        int secondNumber = 7;
        int result = Function.subtract(firstNumber, secondNumber);
        assertEquals(4, result);
    }
}
