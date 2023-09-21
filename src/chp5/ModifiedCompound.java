package chp5;

public class ModifiedCompound {
    private double amount;
    public double calculateModifiedInterest(double principal, double rate) {
        amount = 0;
        int year;
        System.out.printf("year  %15s%n", "amount");
        for (year = 1; year <= 10; year++) {
            amount = principal * Math.pow(1.0 + rate, year);
            System.out.printf(year + " %20.2f%n", amount);
        }
        return Double.parseDouble(String.format("%.2f",amount));
    }
}
