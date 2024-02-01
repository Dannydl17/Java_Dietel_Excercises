package chp6;

import chp5.Question;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerProgram {
    private static SecureRandom randomNumber = new SecureRandom();
    private static int numberGenerate1;
    private static int numberGenerate2;
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int firstNumber = question1();
        int secondNumber = question2();
        System.out.printf("How much is  %d  times %d?%n", firstNumber, secondNumber);
        int numberGuess = keyboardInput.nextInt();

        int result = calculateM();
        if (numberGuess == result) {
            System.out.println("Very good");
        }

        firstNumber = question1();
        secondNumber = question2();
        result = calculateM();
        System.out.printf("How much is  %d  times %d?%n", firstNumber, secondNumber);
        int number = keyboardInput.nextInt();

        boolean num = true;
        while (num){
            if (number != result) {
                System.out.println("No. Please try again.");
                System.out.printf("How much is  %d  times %d?%n", firstNumber, secondNumber);
                number = keyboardInput.nextInt();
            }
            else {
                System.out.println("Very good!!!");
                num = false;
            }

        }
    }


    public static int question1(){
         numberGenerate1 = 1 + randomNumber.nextInt(9);
        return numberGenerate1;
    }
    public static int question2(){
        numberGenerate2 = 1 + randomNumber.nextInt(9);
        return numberGenerate2;
    }
    public static int  calculateM(){
        int number = numberGenerate1 * numberGenerate2;
        return number;
    }
}
