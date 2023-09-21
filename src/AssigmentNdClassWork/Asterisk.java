package AssigmentNdClassWork;

import java.util.Scanner;

public class Asterisk {
    public static void main(String[] args) {
        System.out.println();
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter number to print asterisks");
        int userInput = keyboardInput.nextInt();

        System.out.println();
        while (userInput >= 1) {
            System.out.print("*  ");
            userInput--;
        }
    }
}
