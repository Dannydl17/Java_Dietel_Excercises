package AssigmentNdClassWork;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboardInput.nextInt();

        int numbers = number;

        if (numbers % 2 == 0) {
            System.out.print("The number is an even number");
        }
        if (numbers % 2 != 0) {
            System.out.print("The number is an odd number");
        }
    }
}
