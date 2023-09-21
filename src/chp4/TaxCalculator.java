package chp4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);


        int newRate;
        double totalTax = 0;

        for (int number = 1; number <= 3; number++) {
            System.out.print("Enter the name of citizen: ");
            String name = keyboardInput.nextLine();

            System.out.print("Enter earnings for citizen: ");
            double earnings = keyboardInput.nextDouble();


            if (earnings <= 30000) {
                double tax = (double) 15 / 100;
                totalTax = earnings * tax;
            } else if (earnings > 30000) {
                double tax1 = (double) 20 /100;
                totalTax = earnings * tax1;
            }
            System.out.println("Total tax for citizen " + name + ": $" + totalTax);
            keyboardInput.nextLine();
        }

    }
}
