package AssigmentNdClassWork;

import java.util.Scanner;

public class Diameter {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        double radiusNumber = keyboardInput.nextDouble();

        double diameter = 2 * radiusNumber;
        double circumference = 2 * Math.PI * radiusNumber;
        double area = Math.PI * radiusNumber * radiusNumber;

        System.out.println("Diameter is: " + diameter);
        System.out.println("The circumference is: " + circumference);
        System.out.println("The area is: " + area);
    }
}
