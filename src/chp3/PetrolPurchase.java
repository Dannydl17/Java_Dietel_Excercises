package chp3;

public class PetrolPurchase {

    private String location;
    private String type;
    private int quantity;
    private double pricePerLitre;
    private double PercentageDiscount;

    public PetrolPurchase(String location, String type, int quantity, double pricePerLitre, double percentageDiscount){
        this.location = location;
        this.type = type;
        this.quantity = quantity;
        this.pricePerLitre = pricePerLitre;
        this.PercentageDiscount = percentageDiscount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPricePerLitre(double pricePerLitre) {
        if (pricePerLitre > 0) {
            this.pricePerLitre = pricePerLitre;
        }

    }

    public double getPercentageDiscount() {
        return PercentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.PercentageDiscount = percentageDiscount;
    }

    public double calPurchaseAmount(int quantity, double pricePerLitre, double percentageDiscount) {
        quantity = 500;
        pricePerLitre = 10.0;
        percentageDiscount = 0.05;
        double netPurchaseAmount = quantity * pricePerLitre - percentageDiscount;
        return netPurchaseAmount;
    }
}
