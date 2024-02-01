package chp7;

import java.security.SecureRandom;
import java.util.Arrays;

public class SummingArray {
  SecureRandom random = new SecureRandom();
  private int firstDice;
  public int firstDiceRolled(){
      firstDice = 1 + random.nextInt(6);
      return firstDice;
  }
    public void rollDie(){
        int [] number = new int[7];

        for (int face = 1; face < 30; face++) {
            int firstRoll = firstDiceRolled();
            ++number[firstRoll];
        }

        for (int numbers = 1; numbers < number.length; numbers++) {
            if (numbers == 1){
                System.out.printf("%s%s%s%n","\t\tnumbers", "\t\t|", "\t\tNumber of Occurrence");

                System.out.println("-".repeat(50));
                System.out.printf("%s%s%s%d%n", "\t\t\t", numbers, "\t\t|\t\t\t", number[numbers]);
            }
            else System.out.printf("%s%s%s%d%n", "\t\t\t", numbers, "\t\t|\t\t\t", number[numbers]);
        }
    }
    public static void main(String[] args) {
        SummingArray summingArray = new SummingArray();
        summingArray.rollDie();
        int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
        int total = 0;

        for (int counter = 0; counter < array.length; counter++) {
            total += array[counter];
        }
         System.out.printf("Total of array elements: %d%n", total);
    }
 }




