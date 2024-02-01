package bankingApp;

import bankingApp.exception.InsufficientFundsException;
import bankingApp.exception.InvalidAmountException;
import bankingApp.exception.InvalidPinException;

public class Account {
    private int balance;
    private String pin;
    private String accountName;
    private String  accountNumber;

    public Account(String accountNumber, String accountName, String pin) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.pin = pin;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
        else {
            throw  new InvalidAmountException("Amount is less than zero");
        }

    }

    public int checkBalance(String pin) {
        validatePin(pin);
        return balance;
    }

    private void validatePin(String pins){
        if(!this.pin.equals(pins)){
            throw new InvalidPinException("wrongPin");
        }

    }

    public void withdraw(int amount, String pin) {
        if (amount > 0) {
            if (balance > amount) {
                balance-=amount;
            }else {
                throw new InsufficientFundsException("InsufficientFunds");
            }
            validatePin(pin);
        }else {
            throw new InvalidAmountException("Amount is greater than zero");
        }
    }


    public String getAccountNumber() {
        return accountNumber;
    }
}
