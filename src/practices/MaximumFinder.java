package practices;

import java.util.Scanner;

public class MaximumFinder {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter three floating-point values seperated by space:  ");
        double number1 = keyboardInput.nextDouble();
        double number2 = keyboardInput.nextDouble();
        double number3 = keyboardInput.nextDouble();

        double result = maximum(number1, number2, number3);
        System.out.println("Maximum is: " + result);
    }
   public static double maximum(double x, double y, double z){
        double maximumValue = x;

       if (y > maximumValue) {
           maximumValue = y;
       }
       if (z > maximumValue) {
           maximumValue = z;
       }

       return maximumValue;
   }
}
