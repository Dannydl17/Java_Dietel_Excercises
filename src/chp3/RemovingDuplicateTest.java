package chp3;

public class RemovingDuplicateTest {

    public static void main(String[] args) {
        RemovingDuplicate  account1 = new RemovingDuplicate("Jane Green", 50.00);
        RemovingDuplicate  account2 = new RemovingDuplicate("John Blue", -7.53);
        displayRemoving(account1);
        displayRemoving(account2);

    }
    public  static void displayRemoving(RemovingDuplicate  accountToDisplay){
        System.out.printf("%s balance: $%.2f%n",
                accountToDisplay.getName(), accountToDisplay.getBalance());
    }
}
