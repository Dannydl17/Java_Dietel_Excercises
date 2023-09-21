package chp4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
       displayLargestNumber();
    }
    public static void displayLargestNumber(){
        Scanner keyBoardInput = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int numbers = keyBoardInput.nextInt();

        int largestNumber = numbers;

        for (int counter = 1; counter <10; counter++) {
            System.out.print("Enter an integer: ");
            numbers = keyBoardInput.nextInt();

            if (numbers > largestNumber) {
                largestNumber = numbers;
            }
        }
        System.out.print("LargestNumber is: " + largestNumber);
    }
}
