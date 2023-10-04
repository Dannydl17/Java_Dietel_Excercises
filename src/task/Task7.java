package task;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int total = 0;
        int counter = 0;
        while (counter <= 10) {
            System.out.print("Enter the number of score: ");
            int score = keyboardInput.nextInt();
            if (score >= 1 && score<=100) {
                total+=score;
                counter++;
            }
        }
        System.out.println("The sum is: "+ total);
    }
}
