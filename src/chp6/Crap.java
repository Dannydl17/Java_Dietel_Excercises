package chp6;

import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Crap {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static int bankBalance = 1000;
    private static Scanner keyboardInput = new Scanner(System.in);
    private static final Random random = new Random();

    private enum Status{WON, LOST}
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    public static void main(String[] args) {
      int newBalance = 0;
      Status gameStatus;

      int sumOfDice = rollDice();
      Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter a wager: ");
        int wagerAmount = keyboardInput.nextInt();

        if (wagerAmount <= bankBalance) {

        }
        if (wagerAmount != bankBalance) {
            System.out.println("Enter a wager: ");
            wagerAmount = keyboardInput.nextInt();
        }

        switch (sumOfDice){
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                newBalance = sumOfDice;
                System.out.printf("point is %d%n", newBalance);
                break;
        }
        while (bankBalance > 0){
            System.out.printf("Current bank balance: $%d%n", bankBalance);
            int wager = getValidWager();

            if (sumOfDice == newBalance) {
                gameStatus = Status.WON;
                newBalance = bankBalance + wagerAmount;
            }
            if (sumOfDice ==SEVEN) {
                gameStatus = Status.LOST;
                newBalance = bankBalance - wagerAmount;
            }
            if (bankBalance == 0) {
                System.out.print("Sorry.You busted");
                break;
            }
        }

        displayChatter();
    }
    public static int rollDice(){
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);

        int sum = die1 + die2;
        return sum;
    }

    private static int getValidWager() {
        int wager;
        do {
            System.out.print("Enter your wager: ");
            wager = keyboardInput.nextInt();
        } while (wager <= 0 || wager > bankBalance);
        return wager;
    }

    private static void displayChatter() {
        String[] chatterMessages = {
                "Oh, you're going for broke, huh?",
                "Aw c'mon, take a chance!",
                "You're up big. Now's the time to cash in your chips!"
        };

        int randomIndex = random.nextInt(chatterMessages.length);
        System.out.println(chatterMessages[randomIndex]);
    }
}
