package AssigmentNdClassWork;

import java.util.Scanner;

public class LargestNdSmallest {
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

        int smallestNumber = secondNumber;

        if (firstNumber < smallestNumber) {
            smallestNumber = firstNumber;
        }

        if (thirdNumber < smallestNumber) {
            smallestNumber = thirdNumber;
        }
        if (fourthNumber < smallestNumber) {
            smallestNumber = fourthNumber;
        }

        if (fifthNumber < smallestNumber) {
            smallestNumber = fifthNumber;
        }
        System.out.println("The LargestNumber is: " + largestNumber);
        System.out.println("The smallestNumber is: " + smallestNumber);
    }
}
