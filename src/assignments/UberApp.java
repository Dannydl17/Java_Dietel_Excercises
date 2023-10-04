package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class UberApp {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int[] number = new int[10];

        for (int count = 1; count <=10; count++) {
            System.out.print("Enter number of score: ");
            int score = keyboardInput.nextInt();

            number[count-1] = score;
        }
        System.out.println(Arrays.toString(number));

        int largestNumber = number[0];
        for (int index = 0; index <number.length; index++) {
            if (number[index] > largestNumber) {
                largestNumber = number[index];
            }
        }
        System.out.println("The largestNumber is: " + largestNumber);
    }
}
