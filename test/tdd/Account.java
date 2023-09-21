package tdd;

public class Account {

    private int balance;

    public int checkBalance() {
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance = balance + amount;
        }
    }

    public void withdraw(int amount) {
        if ((amount>0) &&  (balance > amount)) this.balance = balance - amount;

    }
}
