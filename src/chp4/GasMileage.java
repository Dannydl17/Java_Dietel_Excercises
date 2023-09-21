package chp4;

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        displayGasMileage();
    }

    public static void displayGasMileage() {
        Scanner keyboardInput = new Scanner(System.in);

        int counter = 0;
        int gallonUsed;
        int totalMiles = 0;
        int totalGallons = 0;
        double milesPerGallon;
        double totalMilesPG;

        System.out.print("Enter the miles driven or -1 to exit: ");
        int miles = keyboardInput.nextInt();

        while (miles != -1) {
            System.out.print("Enter the gallon used: ");
            gallonUsed = keyboardInput.nextInt();
            totalMiles += miles;
            totalGallons += gallonUsed;

            if (gallonUsed != 0) {
                milesPerGallon = (double) miles / gallonUsed;
                System.out.println("MilesPerGallon is: " + milesPerGallon);
            }
            if (totalGallons != 0) {
                totalMilesPG = (double) totalMiles / totalGallons;
                System.out.println("Total MilesPerGallon is: " + totalMilesPG);
            }
            System.out.print("Enter the miles driven or -1 to exit: ");
            miles = keyboardInput.nextInt();

            System.out.print("Enter the gallon used: ");
            gallonUsed = keyboardInput.nextInt();

            totalMiles += miles;
            totalGallons += gallonUsed;

            if (gallonUsed != 0) {
                milesPerGallon = (double) miles / gallonUsed;
                System.out.println("MilesPerGallon is: " + milesPerGallon);
            }
            if (totalGallons != 0) {
                totalMilesPG = (double) totalMiles / totalGallons;
                System.out.println("Total MilesPerGallon is: " + totalMilesPG);

                System.out.print("Enter the miles driven or -1 to exit: ");
                miles = keyboardInput.nextInt();

                System.out.print("Enter the gallon used: ");
                gallonUsed = keyboardInput.nextInt();

                totalMiles += miles;
                totalGallons += gallonUsed;

                if (gallonUsed != 0) {
                    milesPerGallon = (double) miles / gallonUsed;
                    System.out.println("MilesPerGallon is: " + milesPerGallon);
                }
                if (totalGallons != 0) {
                    totalMilesPG = (double) totalMiles / totalGallons;
                    System.out.println("Total MilesPerGallon is: " + totalMilesPG);
                }
            }

        }
    }
}

