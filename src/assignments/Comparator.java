package assignments;

import java.util.Scanner;

public class Comparator {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int firstNumber = 0;
        int secondNumber = 0;

        for (int counter = 0; counter <=2; counter++) {
            System.out.print("Enter first number: ");
            firstNumber = keyboardInput.nextInt();

            System.out.print("Enter second number: ");
            secondNumber = keyboardInput.nextInt();

            if (firstNumber == secondNumber) {
                System.out.println(0);
            }
            if (firstNumber > secondNumber) {
                System.out.println(1);
            }
            if (secondNumber > firstNumber) {
                System.out.println(-1);
            }
        }
        System.out.println();
    }
}
