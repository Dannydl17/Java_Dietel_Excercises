package AssigmentNdClassWork;

import java.util.Scanner;

public class Sum1 {
    public static void main(String[] args) {
      sum();
    }

    public static void sum(){
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int number1 = keyboardInput.nextInt();

        System.out.print("Enter second number: ");
        int number2 = keyboardInput.nextInt();

        int sum = number1 + number2;
        System.out.println("The sum = " + sum);
    }
}
