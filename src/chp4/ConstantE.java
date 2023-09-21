package chp4;

import java.util.Scanner;

public class ConstantE {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = keyboardInput.nextInt();

        int factorial = 1;
        int  constant = 1;
        int newNumber = 1;
        int  nextNumber = 0;
        int  firstNumber = 0;
        int constantE = 0;

        for (int counter = 0; counter < number; counter++) {
            newNumber = (newNumber * number);
            factorial = factorial * (number - counter);
            nextNumber = constant + newNumber;
            firstNumber = constant + factorial;
            constantE = nextNumber / firstNumber;
        }
        System.out.println("Constant E is: " + constantE);
    }
}
