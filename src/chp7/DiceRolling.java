package chp7;

import java.security.SecureRandom;
import java.util.Arrays;

public class DiceRolling {
    private static SecureRandom randomNumber = new SecureRandom();
    private static int firstDice;
    private static int secondDice;

    public static int firstDice(){
        firstDice = 1 + randomNumber.nextInt(6);
        return firstDice;
    }
    public static int secondDice(){
        secondDice = 1 + randomNumber.nextInt(6);
        return secondDice;
    }
    public static int sumOfDice(){
       int totalDice = firstDice + secondDice;
        return totalDice;
    }

    public static void possibleOutput(int[] list){
        for (int index = 0; index < list.length; index++) {
            for (int innerIndex = 0; innerIndex < list.length; innerIndex++) {
                int sum = list[index] + list[innerIndex];
                System.out.print(sum + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] num = new int[30];
//        possibleOutput(num);
        for (int diceRoll = 0; diceRoll < 30; diceRoll++) {
            int first = firstDice();
            int second = secondDice();
            int total = sumOfDice();

            if (first + second == total) {
                num[diceRoll] = total;
            }
        }
        for (int face = 0; face < num.length; face++) {
            if (face % 5 == 0)System.out.println();
            System.out.print(num[face] + "\t\t");
        }
    }
}





















//    public void diceRoll() {
//        int[] nums = new int[12];
//        for (int count = 2; count < 20; count++) {
//            int firstNum = firstDiceRolled();
//            int secondNum = secondDiceRolled();
//            int totalNum = totalDiceRolled();
//
//            if (firstNum + secondNum == totalNum) {
//                ++nums[totalNum];
//            }
//        }
//
//        for (int numbers = 1; numbers < nums.length; numbers++) {
//            if (numbers == 1) {
//                System.out.printf("%s%s%s%n", "\t\tnumbers", "\t\t|", "\t\tNumber of Occurrence");
//                System.out.println("-".repeat(50));
//                System.out.printf("%s%s%s%d%n", "\t\t\t", numbers, "\t\t|\t\t\t", nums[numbers]);
//            } else System.out.printf("%s%s%s%d%n", "\t\t\t", numbers, "\t\t|\t\t\t", nums[numbers]);
//        }
//    }