package chp2;

import java.util.Scanner;

public class ArithmeticSandL {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int firstNumber = keyboardInput.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = keyboardInput.nextInt();

        System.out.print("Enter the third integer: ");
        int thirdNumber = keyboardInput.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;
        int average = sum / 3;
        int product = firstNumber * secondNumber * thirdNumber;

        int largestNumber = secondNumber;

        if(firstNumber > largestNumber){
            largestNumber = firstNumber;
        }
        if (thirdNumber > largestNumber) {
             largestNumber = thirdNumber;
        }
        int smallestNumber = thirdNumber;

        if (firstNumber < smallestNumber) {
            smallestNumber = firstNumber;
        }
        if (secondNumber < smallestNumber) {
            smallestNumber = firstNumber;
        }
        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Average is %d%n", average);
        System.out.printf("Product is %d%n", product);
        System.out.println("LargestNumber is" + largestNumber);
        System.out.println("SmallestNumber is" + smallestNumber);
    }
}
