package bankingApp;

import bankingApp.exception.InvalidAccountDetails;
import bankingApp.exception.InvalidPinException;


import java.util.ArrayList;

public class Bank {
    private int totalNumberOfCount;

    private ArrayList<Account> accounts;

    public Bank(String bankName) {
        accounts = new ArrayList<>();
    }

    public Account createAccountFrom(String firstName, String lastName, String pin) {
        totalNumberOfCount++;
        String accountNumber = generateAccountNumber();
        String accountName = generateAccountNameFrom(firstName, lastName);
        Account account = new Account(accountNumber,accountName, pin);
        accounts.add(account);
        return account;
    }

    private String generateAccountNameFrom(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    private String generateAccountNumber() {
        return (accounts.size() + 1) + "";
    }

    public int getTotalNumberOfAccount() {
        return totalNumberOfCount;
    }

    public int getTotalAccountNumber() {
        return accounts.size();
    }
    public Account findAccount(String accountNumber) {
        for (Account account: accounts){
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        throw new InvalidAccountDetails("Account not found");
    }


    public void removeAccount(String accountNumber) {
        Account account = findAccount(accountNumber);
        accounts.remove(account);
        totalNumberOfCount--;
    }

    public void deposit(int amount, String accountNumber) {
        findAccount(accountNumber).deposit(amount);
    }

    public int checkBalance(String accountNumber, String pin) {
        return findAccount(accountNumber).checkBalance(pin);
    }

    public void withdraw(int amount,String accountNumber, String pin) {
        findAccount(accountNumber).withdraw(amount, pin);
    }

    public void transferAmount(int amount, String fromAccount, String toAccount, String pin) {
        findAccount(fromAccount).withdraw(amount,pin);
        findAccount(toAccount).deposit(amount);
    }
}
