package chp6;

public class PackingCharges {
    public static int inputTheNumberOfHour(int numberOfHour) {
        return numberOfHour;
    }

    public static double calculateCharges(int numberOfHour) {
        int hour = 3;
        double numberOfCharges = 0.50;
        double minimum = 2.00;
        double result = 0;
        if (numberOfHour < hour){
            return minimum;
        }
        else if (numberOfHour > hour) {
            int difference = numberOfHour - hour;
            result = difference * numberOfCharges * minimum;
        }
       return result;
    }
}
