package chp3;

public class ModifiedAccount {
    private String name;
    private double balance;

    public ModifiedAccount(String name, double balance){
        this.name = name;

        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    public void deposit(double depositAmount){
        if(depositAmount > 0.0){
            balance = balance + depositAmount;
        }
    }

    public void withdraw(double amount){
        this.balance = balance - amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
