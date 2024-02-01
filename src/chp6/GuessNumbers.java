package chp6;

import java.security.SecureRandom;
import java.util.Scanner;

import static java.lang.System.in;

public class GuessNumbers {
    private static Scanner keyboardInput = new Scanner(in);

    public static void playGame() {

        SecureRandom randomNumber = new SecureRandom();
        int numberGuess = 1 + randomNumber.nextInt(10);

        System.out.println("Guess a number between 1 and 1000:     ");
        int guessNumber = keyboardInput.nextInt();

        if (guessNumber != numberGuess) {
            System.out.println("Too high.Try again.");
        }
        boolean result = true;
        while (result) {
            System.out.println("Guess a number between 1 and 1000:     ");
            guessNumber = keyboardInput.nextInt();
            if (guessNumber != numberGuess) {
                System.out.println("Too Low.Try again.");
            }
            if (guessNumber != numberGuess) {
                System.out.println("Too high.Try again.");
            }
            if (guessNumber == numberGuess) {
                System.out.println("Congratulation");
                System.out.println("You guessed the number!");
                result = false;
            }
            numberGuess = 1 + randomNumber.nextInt(10);

        }
    }
}




