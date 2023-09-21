package chp5;


public class TaxFair {
    public double calculateExpenses(double housingExpenses, double foodExpenses, double clothingExpenses, double transportationExpenses, double educationExpenses, double healthCareExpenses, double vacationExpenses) {

            double totalExpenses = 0;
            totalExpenses += housingExpenses;
            totalExpenses += foodExpenses;
            totalExpenses += clothingExpenses;
            totalExpenses += transportationExpenses;
            totalExpenses += educationExpenses;
            totalExpenses += healthCareExpenses;
            totalExpenses += vacationExpenses;

        return totalExpenses;
    }

    public double calculateTaxFair(double totalExpenses){
        double firstTaxAmount = totalExpenses * 0.23;
        return firstTaxAmount;
    }

    public double calculateTaxFair1(double totalExpenses){
        double secondTaxAmount = totalExpenses * 0.30;

        return secondTaxAmount;
    }
}
