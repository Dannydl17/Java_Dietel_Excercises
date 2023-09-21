package AssigmentNdClassWork;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter amount you want to deposit: ");
        int depositAmount = keyboardInput.nextInt();
        account.deposit(depositAmount);

        System.out.print("Enter amount you want to withdraw: ");
        int withdrawAmount = keyboardInput.nextInt();
        account.withdraw(withdrawAmount,depositAmount);

        System.out.println("This is your remaining amount: " + account.checkBalance());
    }
}
