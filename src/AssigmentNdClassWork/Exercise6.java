package AssigmentNdClassWork;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int numberEntered = keyboardInput.nextInt();

        int numbers = numberEntered;

        int firstNumber = numbers / 10000;
        int secondNumber = (numbers % 10000) / 1000 ;
        int thirdNumber = (numbers % 1000) / 100;
        int fourthNumber = (numbers % 100) / 10;
        int fifthNumber = (numbers % 10);

        System.out.print(firstNumber +"\t");
        System.out.print(secondNumber +"\t");
        System.out.print(thirdNumber + "\t");
        System.out.print(fourthNumber + "\t");
        System.out.print(fifthNumber + "\t");
    }
}
