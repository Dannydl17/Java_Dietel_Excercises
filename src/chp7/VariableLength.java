package chp7;

public class VariableLength {

    public static int calculateNumber(int... numbers) {
        int total = 0;
        for (int num:numbers){
            total+=num;
        }
        return total;
    }

    public static double calculateAverageNumber(int... numbers) {
        int total = 0;
        for (int num:numbers){
            total+=num;
        }
        double average = (double) total / numbers.length;
        return average;
    }
}
