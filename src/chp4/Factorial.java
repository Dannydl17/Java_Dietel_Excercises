package chp4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        displayFactorial();
    }
    public static void displayFactorial(){
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = keyboardInput.nextInt();

        int factorial = 1;

        for (int counter = 0; counter < number; counter++) {
            factorial = factorial * (number - counter);
        }
        System.out.println("Factorial is: " + factorial);
    }

}

