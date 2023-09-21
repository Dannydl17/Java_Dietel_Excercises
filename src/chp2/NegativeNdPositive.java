package chp2;

import java.util.Scanner;

public class NegativeNdPositive {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int firstNumber = keyboardInput.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNumber = keyboardInput.nextInt();

        System.out.print("Enter the third integer: ");
        int thirdNumber = keyboardInput.nextInt();

        System.out.print("Enter the fourth integer: ");
        int fourthNumber = keyboardInput.nextInt();

        System.out.print("Enter the fifth integer: ");
        int fifthNumber = keyboardInput.nextInt();

        int positiveNumber = 0;
        int negativeNumber = 0;

        if(firstNumber > positiveNumber){
            positiveNumber = firstNumber;
        }
        if(secondNumber > positiveNumber){
            positiveNumber = secondNumber;
        }
        if(thirdNumber > positiveNumber){
            positiveNumber = thirdNumber;
        }
        if(fourthNumber > positiveNumber){
            positiveNumber = fourthNumber;
        }
        if(fifthNumber > positiveNumber){
            positiveNumber = fifthNumber;
        }

        if(firstNumber < negativeNumber){
            negativeNumber = firstNumber;
        }
        if(secondNumber < negativeNumber){
            negativeNumber = secondNumber;
        }
        if(thirdNumber < negativeNumber){
            negativeNumber = thirdNumber;
        }
        if(fourthNumber < negativeNumber){
            negativeNumber = fourthNumber;
        }
        if(fifthNumber < negativeNumber){
            negativeNumber = fifthNumber;
        }

        int zero = 0;

        if(firstNumber == zero){
            zero = firstNumber;
        }
        if(secondNumber == zero){
            zero = secondNumber;
        }
        if(thirdNumber == zero){
            zero = thirdNumber;
        }
        if(fourthNumber == zero){
            zero = fourthNumber;
        }
        if(fifthNumber == zero){
            zero = fifthNumber;
        }

        System.out.println("The positive number is" + positiveNumber);
        System.out.println("The negative number is" + negativeNumber);
        System.out.println("The zero number is" + zero);
    }
}

