package task;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int score = 0;
        String total = "";
        int count = 0;
        while (count <= 10) {
            System.out.print("Enter the number of score: ");
            score = keyboardInput.nextInt();
            count++;
            total+=score;
        }
        System.out.printf(total);

    }
}
