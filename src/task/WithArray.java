package task;

import java.util.Scanner;

public class WithArray {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter the number of score: ");
        int sum = keyboardInput.nextInt();

        int total = 0;
        int minimum = 0;
        int maximum = sum;
        for (int count = 1; count <10; count++) {
            System.out.print("Enter the number of score: ");
            sum = keyboardInput.nextInt();
            total+= sum;
        }
        if (sum < minimum){
           minimum  = sum;
        }
        if (sum > maximum){
            minimum = maximum;
            maximum = sum;
        }
        double average = (double) total/10;
        System.out.println("The total is: " + total);
        System.out.println("The average is: " + average);
        System.out.println("The minimum is: " + minimum);
        System.out.println("The maximum is: " + maximum);

    }
}
