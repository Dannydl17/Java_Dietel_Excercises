package chp4;

public class Cryptography {
    private int number;

    public String encryptNumber(int number) {
        int firstNumber = number / 1000;
        int secondNumber = number % 1000 / 100;
        int thirdNumber = number % 100 / 10;
        int fourthNumber = number % 10;

        int number1 = firstNumber + 7;
        int number2 = secondNumber + 7;
        int number3 = thirdNumber + 7;
        int number4 = fourthNumber + 7;

        int firstNum = number1 % 10;
        int secondNum = number2 % 10;
        int thirdNum = number3 % 10;
        int fourthNum = number4 % 10;

        int numbers = firstNum;
        firstNum = thirdNum;
        thirdNum = numbers;

        int newNumber = secondNum;
        secondNum = fourthNum;
        fourthNum = newNumber;

        String stringValueOfFirstNum = String.valueOf(firstNum);
        String stringValueOfSecondNum = String.valueOf(secondNum);
        String stringValueOfThirdNum = String.valueOf(thirdNum);
        String stringValueOfFourthNum = String.valueOf(fourthNum);
        return stringValueOfFirstNum + stringValueOfSecondNum + stringValueOfThirdNum + stringValueOfFourthNum;
    }

    public String decryptNumber(int numbers) {

        int firstNumber = numbers / 1000;
        int secondNumber = numbers % 1000 / 100;
        int thirdNumber = numbers % 100 / 10;
        int fourthNumber = numbers % 10;

        int newNumbers = thirdNumber;
        int thirdNum3 = firstNumber;
        int firstNum1 = newNumbers;

        int secondNumbers = fourthNumber;
        int fourthNum4 = secondNumber;
        int secondNum2 = secondNumbers;

        int number1 = firstNum1 - 7;
        int number2 = secondNum2 - 7;
        int number3 = thirdNum3 - 7;
        int number4 = fourthNum4 - 7;

        int newNumber1 = number1 + 10;
        int newNumber2 = number2 + 10;
        int newNumber3 = number3 + 10;
        int newNumber4 = number4 + 10;

        int first = newNumber1 % 10;
        int second = newNumber2 % 10;
        int third = newNumber3 % 10;
        int fourth = newNumber4 % 10;

        String stringValueOfFirst = String.valueOf(first);
        String stringValueOfSecond = String.valueOf(second);
        String stringValueOfThird = String.valueOf(third);
        String stringValueOfFourth = String.valueOf(fourth);

        return  stringValueOfFirst + stringValueOfSecond + stringValueOfThird + stringValueOfFourth;

    }
}


