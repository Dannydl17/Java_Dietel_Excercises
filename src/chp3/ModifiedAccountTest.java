package chp3;
import java.util.Scanner;

public class ModifiedAccountTest {
    public static void main(String[] args) {
        ModifiedAccount modifiedAccount1 = new ModifiedAccount("Jane",50.00);
        ModifiedAccount modifiedAccount2 = new ModifiedAccount("John Blue",-7.53);
        System.out.printf("%s balance: $%.2f%n",
                modifiedAccount1.getName(), modifiedAccount1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                modifiedAccount2.getName(), modifiedAccount2.getBalance());

        Scanner input = new Scanner(System.in);
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account1 balance%n%n",
                depositAmount);
        modifiedAccount1.deposit(depositAmount);
        System.out.printf("%s balance: $%.2f%n",
                modifiedAccount1.getName(), modifiedAccount1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                modifiedAccount2.getName(), modifiedAccount2.getBalance());
        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %.2f to account2 balance%n%n",
                depositAmount);
        modifiedAccount2.deposit(depositAmount);

        System.out.printf("%s balance: $%.2f%n",
                modifiedAccount1.getName(), modifiedAccount1.getBalance());
        System.out.printf("%s balance: $%.2f%n%n",
                modifiedAccount2.getName(), modifiedAccount2.getBalance());


        System.out.print("Enter withdrawal amount for account1: ");
        double withdraw = input.nextDouble();
        double amount = withdraw;
        modifiedAccount1.withdraw(amount);
        System.out.printf("amount withdraw $%.2f from account1 %n%n",
                withdraw);
        System.out.printf("%s balance: $%.2f%n",
                modifiedAccount1.getName(), modifiedAccount1.getBalance());

        System.out.print("Enter withdraw amount for account2: ");
        withdraw = input.nextDouble();
        amount = withdraw;
        modifiedAccount2.withdraw(amount);
        System.out.printf("amount withdraw %.2f from account2 %n%n",
                withdraw);

        System.out.printf("%s balance: $%.2f%n%n",
                modifiedAccount2.getName(), modifiedAccount2.getBalance());
    }
}
