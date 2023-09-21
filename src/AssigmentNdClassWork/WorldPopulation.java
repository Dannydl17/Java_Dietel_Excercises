package AssigmentNdClassWork;

import java.util.Scanner;

public class WorldPopulation {
    public static void main(String[] args) {
            Scanner keyboardInput = new Scanner(System.in);
            System.out.print("Enter the current worldPopulation: ");
            long currentWorldPopulation = keyboardInput.nextLong();

            System.out.print("Enter previousPopulation: ");
            long previousPopulation = keyboardInput.nextLong();

            System.out.print("Enter the populationGrowthRate: ");
            double populationGrowthRate = keyboardInput.nextDouble();


            long newPopulation = currentWorldPopulation - previousPopulation / currentWorldPopulation * 100;

            double calculatePopulation = newPopulation + populationGrowthRate / 100;

            double oneYear = calculatePopulation * (1 + populationGrowthRate/100);

            double twoYear = calculatePopulation * (1 + populationGrowthRate/100) + oneYear;

            double threeYear = calculatePopulation * (1 + populationGrowthRate/100) + twoYear;

            double fourYear = calculatePopulation * (1 + populationGrowthRate/100) + threeYear;

            double fiveYear = calculatePopulation * (1 + populationGrowthRate/100) + fourYear;

            System.out.printf("%s%.2f%n%s%.2f%n%s%.2f%n%s%.2f%n%s%.2f%n%s%.2f%n","calculatePopulation is: ",calculatePopulation,"One year is:",oneYear,"Two year is:",twoYear,"Three year is:",threeYear,"Four year is:",fourYear,"Five year is:",fiveYear);
        }
    }
