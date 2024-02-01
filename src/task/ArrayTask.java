package task;

import java.util.Scanner;

public class ArrayTask {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int[] scores = new int[10];
        int total = 0;
        int number = 0;
        for (int count = 0; count < scores.length; count++) {
            System.out.print("Enter the number of score: " + (count + 1));
            int sum = keyboardInput.nextInt();
            scores[count] = sum;
            number = scores[count];
        }
        System.out.println("The number is: " + number);

        for (int index = 0; index < scores.length; index++) {
            total+=scores[index];
        }
        double average =   (double) total /scores.length;
        System.out.println("The score are: " + total);
        System.out.println("The average is: " + average);

        int minimum = scores[0];
        for (int index = 0; index < scores.length; index++) {
            if (scores[index] < minimum) {
                minimum = scores[index];
            }
        }
        System.out.println("The minimum is: " + minimum);

        int maximum = scores[0];
        for (int index = 0; index < scores.length; index++) {
            if (scores[index] > maximum) {
                maximum = scores[index];
            }
        }
        System.out.println("The maximum is: " + maximum);
    }


}
