package AssigmentNdClassWork;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int firstNumber = keyboardInput.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = keyboardInput.nextInt();

        int squareA = firstNumber * firstNumber;
        int squareB = secondNumber * secondNumber;
        int sum = squareA + squareB;
        int difference = squareA - squareB;

        System.out.printf("SquareA is : %d%n ", squareA);
        System.out.printf("SquareB is : %d%n ", squareB);
        System.out.println("Sum is " + sum);
        System.out.println("Difference is " + difference);
    }
}
