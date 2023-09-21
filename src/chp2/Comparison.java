package chp2;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int numbers = keyboardInput.nextInt();

        int square = numbers * numbers;
        int number = 100;

        if (square > number) {
            System.out.printf("%d > %d%n", square, number);
        }
        if (square != number) {
            System.out.printf("%d != %d%n", square, number);
        }
        if (square < number) {
            System.out.printf("%d < %d%n", square, number);
        }
    }
}
