package chp5;

import java.util.Scanner;

public class BarChart {

    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
        int fifthNumber = 0;
        int number = 0;
        for (int count = 1; count <= 5; count++) {
            System.out.print("Enter number between 1 and 30: ");
            number = keyboardInput.nextInt();
            if (number < 1 || number > 30) {
                System.out.println("Invalid number.Please try again");
                count--;

            }
            if (count == 1) {
                firstNumber = number;
            }
            if (count == 2) {
                secondNumber = number;
            }
            if (count == 3) {
                thirdNumber = number;
            }
            if (count == 4) {
                fourthNumber = number;
            }
            if (count == 5) {
                fifthNumber = number;
            }
        }
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        System.out.println(fourthNumber);
        System.out.println(fifthNumber);


        for(number = 1; number<=firstNumber; number++) {
            System.out.print("*");
        }
        System.out.println();

        for(number = 1; number<=secondNumber; number++) {
            System.out.print("*");
        }
        System.out.println();

        for(number = 1; number<=thirdNumber; number++) {
            System.out.print("*");
        }
        System.out.println();

        for(number = 1; number<=fourthNumber; number++) {
            System.out.print("*");
        }
        System.out.println();

        for(number = 1; number<=fifthNumber; number++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

