//package practices;
//
//import java.security.SecureRandom;
//import java.util.Scanner;
//
//public class Craps {
//    private static final SecureRandom randomNumbers = new SecureRandom();
//    private static int  NEWBALANCE = 0;
//
//    private enum Status{NEWBALANCE, WON, LOST}
//
//    private static final int SNAKE_EYES = 2;
//    private static final int TREY = 3;
//    private static final int SEVEN = 7;
//    private static final int YO_LEVEN = 11;
//    private static final int BOX_CARS = 12;
//    public static void main(String[] args) {
//         int bankBalance = 1000;
//        Scanner keyboardInput = new Scanner(System.in);
//
//        int playerWages = 0;
//
//
//        while (playerWages != 0) {
//            System.out.print("Enter your wager:  ");
//            playerWages = keyboardInput.nextInt();
//
//            if (playerWages >= bankBalance) {
//
//            }
//        }
//        Status gameStatus;
//
//        int sumOfDice = rollDice();
//
//        switch (sumOfDice){
//            case SEVEN:
//            case YO_LEVEN:
//                gameStatus = Status.NEWBALANCE;
//                break;
//            case SNAKE_EYES:
//            case TREY:
//            case BOX_CARS:
//                gameStatus = Status.LOST;
//                break;
//
//            default:
//                gameStatus = Status.NEWBALANCE;
//                bankBalance = sumOfDice;
//                System.out.printf("Point is %d%n", bankBalance);
//                break;
//        }
//
//        while(gameStatus == Status.NEWBALANCE){
//            sumOfDice = rollDice();
//
//            if (sumOfDice == bankBalance) {
//                gameStatus = NEWBALANCE+=1;
//            }
//            else {
//                if (sumOfDice == SEVEN) {
//                    gameStatus = Status.LOST;
//                }
//            }
//
//                 if (gameStatus == Status.WON) {
//                    System.out.println("Player wins");
//                 }
//                 else {
//                     System.out.println("Player loses");
//                 }
//
//        }
//
//    }
//
//    public static int rollDice() {
//        int die1 = 1 + randomNumbers.nextInt(6);
//        int die2 = 1 + randomNumbers.nextInt(6
//}
