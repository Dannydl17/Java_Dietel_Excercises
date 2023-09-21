package chp4;

import java.util.Scanner;

public class Constant {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = keyboardInput.nextInt();

        int factorial = 1;
        int constantE = 0;
        int newNumber = 1;
        int newNumbers = 0;
        int nextNumber = 0;
        int constant = 1;

        for (int counter = 0; counter < number; counter++) {
            newNumbers = (newNumber + counter);
            factorial = factorial * (number - counter);
            nextNumber = constant + newNumbers;
            factorial = factorial + constant;
            constantE = factorial / nextNumber;
        }
        System.out.print("ConstantE is: " + constantE);
    }
}
