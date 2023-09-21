package chp5;

public class Modified {
    public static void main(String[] args) {
        int principal = 10000;
         int rate = 5;
         int dollar;
         int cent;
        System.out.printf("%s%20s%n",  "Year",   "Amount on deposit");

        for (int year = 1; year <= 10; ++year) {
            int amount = (int) (principal * Math.pow(1 + rate, year));
            int temp1 = amount;

             dollar = amount / 100 % 100;
             cent = temp1 / 100 % 100;
            System.out.printf("%4d%,16d.%02d6%n", year, dollar, cent);
        }
    }
}
