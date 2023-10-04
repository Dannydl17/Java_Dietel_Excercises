package task;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int total = 0;
        int counter = 0;
        while (counter <= 10) {
            System.out.print("Enter the number of score: ");
            int sum = keyboardInput.nextInt();
            if (sum >100) {
                System.out.print("Enter the number of score: ");
                sum = keyboardInput.nextInt();
            }
            counter++;
            total+=sum;
        }
        System.out.println("The sum is: "+ total);
    }
}
