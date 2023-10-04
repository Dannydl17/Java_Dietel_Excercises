package task;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int total = 0;
        for (int count = 1; count <=10; count++) {
            System.out.print("Enter the number of score: ");
            int sum = keyboardInput.nextInt();

             total+= sum;
        }
        System.out.println("The sum of the score is: " + total);
    }
}
