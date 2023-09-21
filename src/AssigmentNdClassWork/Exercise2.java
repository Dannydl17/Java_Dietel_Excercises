package AssigmentNdClassWork;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder: ");
        double radius = keyboardInput.nextDouble();
        int length = keyboardInput.nextInt();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.printf("The area is %f%n", area);
        System.out.printf("The volume is %.2f", volume);

    }
}
