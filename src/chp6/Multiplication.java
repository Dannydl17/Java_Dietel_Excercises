package chp6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        Scanner keyboardInput = new Scanner(System.in);
        int numbOne = 7 * randomNumber.nextInt(6);
        System.out.println(numbOne);

        System.out.println("How much is  6  times 7?     ");
        int answer = keyboardInput.nextInt();

//        if ( == answer) {
//            System.out.println("Very good!");
//        }
    }

}
