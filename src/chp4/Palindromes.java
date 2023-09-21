package chp4;

import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter five digit number: ");
        int originalNumber;
        originalNumber = keyboardInput.nextInt();

        int numbers = originalNumber;
        int reversedNumber = 0;

        while (numbers != 0){
             int remainder = numbers % 10;
              reversedNumber = (reversedNumber * 10)+ remainder;
              numbers = numbers / 10;
        }
        if (originalNumber == reversedNumber) {
            System.out.print(originalNumber + "Number is a Palindrome number");
        } else {
            System.out.println(originalNumber + "Number is not a Palindrome");
        }
    }
}
