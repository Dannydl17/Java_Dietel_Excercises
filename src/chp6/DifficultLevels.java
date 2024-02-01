package chp6;

import java.security.SecureRandom;
import java.util.Scanner;

public class DifficultLevels {
    private static SecureRandom randomNumber = new SecureRandom();
    private static int numberGuessOne;
    private static int numberGuessTwo;


    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter a difficulty level:   ");
        int difficultLevel = keyboardInput.nextInt();

        if(difficultLevel == 1) {
            int firstNumber = numberOne();
            int secondNumber = numberTwo();
            int result = levelOne();
            boolean nums = true;
            while (nums){
               System.out.printf("How much is  %d  times %d?%n", firstNumber, secondNumber);
               int num = keyboardInput.nextInt();

                if (num == result) {
                    System.out.println("Very good!!!");
                } else if (num != result) {
                    System.out.println("No. Please try again.");
                    System.out.printf("How much is  %d  times %d?%n", firstNumber, secondNumber);
                    num = keyboardInput.nextInt();
                }

                if (num == 0){
                    nums = false;
                }
                firstNumber = numberOne();
                secondNumber = numberTwo();
                result = levelOne();
            }
        }

        if(difficultLevel == 2) {
            int firstNumber = numberT();
            int secondNumber = numberTW();
            int result = levelTwo();
            boolean nums = true;
            while (nums){
                System.out.printf("How much is  %d  times %d?%n", firstNumber, secondNumber);
                int num = keyboardInput.nextInt();

                if (num == result) {
                    System.out.println("Very good!!!");
                } else if (num != result) {
                    System.out.println("No. Please try again.");
                    System.out.printf("How much is  %d  times %d?%n", firstNumber, secondNumber);
                    num = keyboardInput.nextInt();
                }
                if (num == 0) {
                    nums = false;
                }

                firstNumber = numberT();
                secondNumber = numberTW();
                result = levelTwo();
            }
        }
    }

    public static int numberOne(){
        numberGuessOne = 1 + randomNumber.nextInt(9);
        return numberGuessOne;
    }
    public static int numberTwo(){
        numberGuessTwo = 1 + randomNumber.nextInt(9);
        return numberGuessTwo;
    }
    public static int levelOne(){
        int numberGuess = numberGuessOne * numberGuessTwo;
        return numberGuess;
    }

    public static int numberT(){
        numberGuessOne = 1 + randomNumber.nextInt(99);
        return numberGuessOne;
    }
    public static int numberTW(){
        numberGuessTwo = 1 + randomNumber.nextInt(99);
        return numberGuessTwo;
    }

    public static int levelTwo(){
        int numberGuess1 = numberGuessOne * numberGuessTwo;
        return numberGuess1;
    }
}
