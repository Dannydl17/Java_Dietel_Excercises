package chp7;

import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int[] numbers = new int[10];
        for (int count = 0; count < numbers.length; count++) {
            System.out.println("Enter number: " + (count + 1));
            int num = keyboardInput.nextInt();
            if (num >= 10 && num <= 100) {
               numbers[count - 1] = num;
            }
        }
    }
}