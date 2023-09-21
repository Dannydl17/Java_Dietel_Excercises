package AssigmentNdClassWork;

public class Account {
    private int balance;

    public void deposit(int amount){
        if(amount > 0){
            this.balance = balance + amount;
        }

    }

    public int checkBalance(){
        return balance;
    }
    public void withdraw(int amount, int deposit){

        if (amount > deposit) {
            System.out.println("Your amount cannot be withdraw");
        } else if (amount < 0) {
            System.out.println("Your amount cannot be withdraw");
        }
        else {
            this.balance = balance - amount;
        }

    }
}
