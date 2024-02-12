package AssigmentNdClassWork;

import java.util.Scanner;

public class AddNumber {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.println("Enter a firstNumber:   ");
        int number = keyboardInput.nextInt();
        System.out.println("Enter a secondNumber:   ");
        int number2 = keyboardInput.nextInt();

        int add = number + number2;
        System.out.println(add);
    }
}
