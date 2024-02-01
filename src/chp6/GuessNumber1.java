package chp6;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumber1 {

    private static final Scanner keyboardInput = new Scanner(System.in);
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        int numberGuess = 1 + randomNumber.nextInt(10);

         int count = 0;
        System.out.println("Guess a number between 1 and 1000:     ");
        int guessNumber = keyboardInput.nextInt();

        if (guessNumber != numberGuess) {
           count++;
        }
        if (guessNumber == 10 || guessNumber < 10) {
            System.out.println("Either you know the secret or you got lucky!");
        }
        boolean result = true;
        while (result){
            System.out.println("Guess a number between 1 and 1000:     ");
            guessNumber = keyboardInput.nextInt();
            if (guessNumber == numberGuess) {
               count++;
                if (count == 10) {
                    System.out.println("Aha! You know the secret!");
                }
                if (count > 10) {
                    System.out.println(" You should be able to do better!");
                }
                System.out.println("Did you still want to continue");
                int input = keyboardInput.nextInt();
                if (input == 1) {
                }
                else result = false;
            }
            numberGuess = 1 + randomNumber.nextInt(10);
        }
    }
}
