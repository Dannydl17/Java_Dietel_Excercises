package AssigmentNdClassWork;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       displayCalculator();
    }
    public static void displayCalculator(){
        Scanner keyboardInput = new Scanner(System.in);


        int ans = 0;

        while (true) {
            System.out.print("Enter the operator: ");
            char op = keyboardInput.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter first number: ");
                int num1 = keyboardInput.nextInt();
                System.out.print("Enter second number: ");
                int num2 = keyboardInput.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation!");
            }
            System.out.println(ans);
        }
    }
}
