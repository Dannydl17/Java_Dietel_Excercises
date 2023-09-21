package chp4;

import java.util.Scanner;

public class SpecifiedSum {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboardInput.nextInt();

        int numbers = number;
        int sum = 0;

        for (int counter = 0; counter < number; counter++) {
            System.out.print("Enter a number: ");
            number = keyboardInput.nextInt();
              sum += number;
        }
        System.out.println("Sum is:" + sum);
    }
}
