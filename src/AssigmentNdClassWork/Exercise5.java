package AssigmentNdClassWork;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter three digit number: ");
        int number = keyboardInput.nextInt();

        int firstNumber = number % 100 / 10;
        int thirdNumber = number % 10;

        if (firstNumber == thirdNumber) {
            System.out.println("This is a palindrome number ");
        } else if (firstNumber != thirdNumber) {
            System.out.println("The number is not a palindrome");
        }

    }
}
