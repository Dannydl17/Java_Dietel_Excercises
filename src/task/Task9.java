package task;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int total = 0;
        int count = 0;
        while (count<=10) {
            System.out.print("Enter the number of score: ");
            int sum = keyboardInput.nextInt();
            total+= sum;
            count++;
        }
        if (total > 100) {
            System.out.println("Please enter the correct average score");
        }
        double average = (double) total /10;

        System.out.println("The average is: "+ average);
    }
}
