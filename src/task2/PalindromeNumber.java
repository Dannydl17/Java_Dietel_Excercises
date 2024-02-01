package task2;

public class PalindromeNumber {
    public static boolean reverseNumber(int number) {
        int originalNumber;
        originalNumber = number;

        number = originalNumber;
        int reversedNumber = 0;

        while (number > 0){
            int remainder = number % 10;
            reversedNumber = (reversedNumber * 10)+ remainder;
            number = number / 10;
        }
        if (originalNumber == reversedNumber) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean canReverseString(String given) {
        String reverse = "";
        String name = given.toUpperCase();
        for (int count = name.length() - 1; count>=0; count--) {
            reverse = reverse + name.charAt(count);
        }
        if (reverse.equals(name)) {
            return true;
        }
        return false;
    }
}
