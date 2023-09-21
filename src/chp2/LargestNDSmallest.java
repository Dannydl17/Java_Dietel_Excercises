package chp2;

import java.util.Scanner;

public class LargestNDSmallest {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int firstNumber = keyboardInput.nextInt();

        System.out.print("Enter second integer: ");
        int secondNumber = keyboardInput.nextInt();

        System.out.print("Enter third integer: ");
        int thirdNumber = keyboardInput.nextInt();

        System.out.print("Enter fourth integer: ");
        int fourthNumber = keyboardInput.nextInt();

        System.out.print("Enter fifth integer: ");
        int fifthNumber = keyboardInput.nextInt();

        int largestNumber = fourthNumber;

        int smallestNumber = fifthNumber;

        if (firstNumber > largestNumber) {
            largestNumber = firstNumber;
        }
        if (secondNumber > largestNumber) {
            largestNumber = secondNumber;
        }
        if (thirdNumber > largestNumber) {
            largestNumber = thirdNumber;
        }
        if (fifthNumber > largestNumber) {
            largestNumber = fifthNumber;
        }
        if (firstNumber < smallestNumber) {
            smallestNumber = firstNumber;
        }
        if (secondNumber < smallestNumber) {
            smallestNumber = secondNumber;
        }
        if (thirdNumber < smallestNumber) {
            smallestNumber = thirdNumber;
        }
        if (fourthNumber < smallestNumber) {
            smallestNumber = fourthNumber;
        }

        System.out.println("LargestNumber is: " + largestNumber);
        System.out.println("SmallestNumber is: " + smallestNumber);
    }
}
