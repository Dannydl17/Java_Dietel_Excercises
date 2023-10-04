package task;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int total = 0;
        for (int count = 1; count <=10; count++) {
            System.out.print("Enter the number of score: ");
            int sum = keyboardInput.nextInt();

            total+= sum;
        }
        double average = (double) total /10;
        System.out.println("The sum is: " + total);
        System.out.println("The average is: "+ average);
    }
}
