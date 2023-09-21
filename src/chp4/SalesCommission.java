package chp4;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        double total = 0;
        int count = 0;

        System.out.print("Enter the valueOfItem or -1 to quit: ");
        double valueOfItem = keyboardInput.nextDouble();

        while(valueOfItem != -1){
            total = total + valueOfItem;
            count = count + 1;

            System.out.print("Enter the valueOfItem or -1 to quit: ");
            valueOfItem = keyboardInput.nextDouble();
        }
        System.out.printf("Total is:  %.2f%n" ,total);
        double discount = (double) 9 /100;
        double newAmount = total * discount + 200;
        System.out.printf("NewAmount is: %f",newAmount);
    }

}
