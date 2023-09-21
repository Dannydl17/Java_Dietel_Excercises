package chp2;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int firstNumber = keyboardInput.nextInt();

        if(firstNumber % 3 == 0){
            System.out.println("Number is divisible by 3");
        }
        if (firstNumber % 3 != 0){
            System.out.println("Number is not divisible by 3");
        }


    }
}
