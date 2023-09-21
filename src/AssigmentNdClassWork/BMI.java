package AssigmentNdClassWork;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter your weightInKilogram: ");
        int weightInKilogram = keyboardInput.nextInt();

        System.out.print("Enter your heightInMeters: ");
        int heightInMeters = keyboardInput.nextInt();

        int bmi = weightInKilogram / heightInMeters * heightInMeters;

        System.out.printf("The BMI is %d",bmi);
    }
}