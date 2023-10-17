package chp6;

import java.security.SecureRandom;

public class GuessNumber {
    public static void main(String[] args) {
        collectNumber(6);
    }

    public static int collectNumber(int number) {
        SecureRandom randomNumber = new SecureRandom();
        int guessNumber = 0;
        int numbers = 5;
        for (int count = 1; count <=1000; count++) {
            if(number <=1000){
                guessNumber = randomNumber.nextInt(numbers);
            }
        }
        if (guessNumber != number) {
            System.out.print("Try again......");
        }
        if (guessNumber == number){
            System.out.println("Congratulation. You guess the number!");
        }
        return guessNumber;
    }
}
