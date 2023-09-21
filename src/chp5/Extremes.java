package chp5;

public class Extremes {

    public int collectNumber(int number) {
        return number;
    }

    public int calculateMinimum(int number) {
        int minimumNumber = number;

        for (int index = 1; index < 20; index++) {
            if (number < minimumNumber) {
                minimumNumber = number;
            }

        }
        System.out.println("The minimumNumber is: " + minimumNumber);
        return minimumNumber;
    }

    public int calculateMaximum(int number){
        int maximumNumber = number;

        for (int index = 1; index < 20; index++) {
            if (number > maximumNumber){
                maximumNumber = number;
            }

        }
        System.out.println("The maximumNumber is: " + maximumNumber);
        return maximumNumber;
    }
    }