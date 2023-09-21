package chp4;

import java.util.Scanner;

public class TwoLargestNumber {

    public static void main(String[] args) {
        Scanner keyBoardInput = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int numbers = keyBoardInput.nextInt();

        int largestNumber = numbers;
        int secondLargestNumber = 0;

        for (int counter = 0; counter <=10; counter++) {
            System.out.print("Enter an integer: ");
             numbers = keyBoardInput.nextInt();

            if (numbers > largestNumber) {
                secondLargestNumber = largestNumber;
                largestNumber = numbers;
            } else if (numbers > secondLargestNumber) {
                secondLargestNumber = numbers;
            }
        }
        System.out.println(largestNumber);
        System.out.println(secondLargestNumber);
    }
}
