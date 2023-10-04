package task;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int evenNumber = 0;
        int total = 0;
        for (int count = 1; count <=10; count++) {
            System.out.print("Enter the number of score: ");
            int sum = keyboardInput.nextInt();

            total+= sum;
        }
        double average = (double) total /10;
        if (average % 2 == 0) {
            evenNumber+=average;
        }
        System.out.println("The average is: "+ average);
        System.out.println("The evenNumber in the averageScore: " + evenNumber);
    }
}
