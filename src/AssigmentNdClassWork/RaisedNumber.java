package AssigmentNdClassWork;

import java.util.Scanner;

public class RaisedNumber {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int firstNumber = keyboardInput.nextInt();

        System.out.print("Enter the second Number: ");
        int secondNumber = keyboardInput.nextInt();

        int total = 0;

        for (int count = 0; count <=secondNumber;) {
                total *=firstNumber;
                    count++;
        }
        System.out.println(total);
    }
}
