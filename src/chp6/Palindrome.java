package chp6;

public class Palindrome {
    public static boolean isPalindrome(int numbers) {
        int originalNumber;
        originalNumber = numbers;

        numbers = originalNumber;
        int reversedNumber = 0;

        while (numbers > 0){
            int remainder = numbers % 10;
            reversedNumber = (reversedNumber * 10)+ remainder;
            numbers = numbers / 10;
        }
        if (originalNumber == reversedNumber) {
            return true;
        }
        else {
            return false;
        }
    }
}
