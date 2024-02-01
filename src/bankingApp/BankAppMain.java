package bankingApp;

import java.util.Scanner;
import static java.lang.System.in;

public class BankAppMain {

    static Bank bank = new Bank("GtbBank");
    static Scanner keyboardInput = new Scanner(in);
    public static void main(String[] args) {
      gotoMain();
    }
    private static void gotoMain(){
        String prompt =
                """
                =====================================
                Welcome to Bank of Nigerian (GtbBank)
                =====================================
                Press
                1 -> Create Account
                2 -> Find Account
                3 -> Remove Account
                4 -> Deposit Account
                5 -> Check Balance Account
                6 -> Withdraw Account
                7 -> Transfer Account
                =====================================
                """;
        System.out.println(prompt);
        System.out.println("Choose an option you want:   ");
        int userInput = keyboardInput.nextInt();
        switch (userInput){
            case 1 -> createAccountFrom();
            case 2 -> findAccount();
            case 3->  removeAccount();
            case 4 -> depositAccount();
            case 5 -> checkBalanceAccount();
            case 6 -> withdrawAccount();
            case 7 -> transferAccount();
        }
    }


    private static void createAccountFrom() {

    }
    private static void findAccount() {
    }

    private static void removeAccount() {

    }
    private static void depositAccount() {
    }

    private static void checkBalanceAccount() {
    }

    private static void withdrawAccount() {
    }

    private static void transferAccount() {
    }

}
