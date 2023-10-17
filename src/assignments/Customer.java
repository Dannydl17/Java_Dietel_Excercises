package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        int[][] number = new int[4][3];
        for (int row = 0; row < number.length; row++) {
            for (int column = 0; column < number[row].length; column++) {
                System.out.printf("Enter the item %d for customer %d:", column+1, row+1);
                int itemNumber = keyboardInput.nextInt();
                 number[row][column] = itemNumber;
            }
        }
        for (int row = 0; row < number.length; row++) {
            System.out.println(row);
            System.out.printf("Customer %d\t", row+1);
            for (int column = 0; column < number[row].length; column++) {
                System.out.print(number[row][column] + "   ");
            }
            System.out.println();
        }
    }
}
