package task;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int total = 0;
        for (int count = 1; count <=10; count++) {
            System.out.print("Enter the number of score: ");
            int score = keyboardInput.nextInt();
            if (score % 2 ==0) {
                total+=score;
            }
        }
        System.out.println("The even numbers are: " + total);
    }
}
