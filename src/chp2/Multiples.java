package chp2;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int firstNumber = keyboardInput.nextInt();

        System.out.print("Enter second integer: ");
        int secondNumber = keyboardInput.nextInt();

        int tripledNumber = firstNumber * 3;
        int doubled = secondNumber * 2;

        if(tripledNumber % doubled == 0){
            System.out.println("The tripledNumber is greater" + tripledNumber);
        }
    }
}
