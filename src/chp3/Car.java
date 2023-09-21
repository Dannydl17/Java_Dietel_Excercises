package chp3;

public class Car {

    private String model;
    private int year;
    private double price;

   public Car(String model, int year, double price){
       this.model = model;
       this.year = year;
       this.price = price;
   }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {

        if (year == 2000) {
            this.year = year;
        }

    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if (price > 0) {
            this.price = price;
        }

    }

    public double getDiscountCalculate(double discount, double price) {
       discount = (discount / 100);
       double newAmount = price * (1 - discount);
        return newAmount;
    }
}
