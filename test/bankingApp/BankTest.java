package bankingApp;

import bankingApp.exception.InvalidPinException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankTest {
    private Bank gtbBank;

    @BeforeEach
    public void setUp() {
        gtbBank = new Bank("GtbBank");
    }

    @Test
    public void test_That_Bank_Can_Create_Account_And_Register_One_Customer_Test() {
        Account newAccount = gtbBank.createAccountFrom("firstName", "lastName", "pin");
        assertEquals(1, gtbBank.getTotalNumberOfAccount());
        assertEquals("1", newAccount.getAccountNumber());
    }

    @Test
    public void test_That_Bank_Can_Create_Account_And_Register_Two_Customer_Test() {
        Account firstAccount = gtbBank.createAccountFrom("firstName", "lastName", "pin");
        Account secondAccount = gtbBank.createAccountFrom("firstName", "lastName", "pin");
        assertEquals(2, gtbBank.getTotalNumberOfAccount());
        assertEquals("1", firstAccount.getAccountNumber());
        assertEquals("2", secondAccount.getAccountNumber());
    }

    @Test
    public void test_That_Bank_Can_Find_Account_Number_For_One_Person_Bank_Test() {
        Account firstAccount = gtbBank.createAccountFrom("firstName", "lastName", "pin");
        assertEquals(1, gtbBank.getTotalNumberOfAccount());
        assertEquals("1", firstAccount.getAccountNumber());
        Account newAccount = gtbBank.findAccount("1");
        assertEquals(1, gtbBank.getTotalAccountNumber());
        assertEquals("1", newAccount.getAccountNumber());
    }

    @Test
    public void test_That_Bank_Can_Find_Account_Number_For_Two_People_Bank_Test() {
        Account firstAccount = gtbBank.createAccountFrom("firstName", "lastName", "pin");
        Account secondAccount = gtbBank.createAccountFrom("firstName", "lastName", "pin");
        assertEquals(2, gtbBank.getTotalNumberOfAccount());
        assertEquals("1", firstAccount.getAccountNumber());
        assertEquals("2", secondAccount.getAccountNumber());
        Account newAccount = gtbBank.findAccount("1");
        Account newAccount1 = gtbBank.findAccount("2");
        assertEquals(2, gtbBank.getTotalAccountNumber());
        assertEquals("1", newAccount.getAccountNumber());
        assertEquals("2", newAccount1.getAccountNumber());
    }

    @Test
    public void test_That_Bank_Can_Remove_Account_Number_From_Bank_Test(){
        Account firstAccount = gtbBank.createAccountFrom("firstName", "lastName", "pin");
        assertEquals(1, gtbBank.getTotalNumberOfAccount());
        assertEquals("1", firstAccount.getAccountNumber());
        Account newAccount = gtbBank.findAccount("1");
        assertEquals(1, gtbBank.getTotalAccountNumber());
        assertEquals("1", newAccount.getAccountNumber());
        gtbBank.removeAccount("1");
        assertEquals(0, gtbBank.getTotalAccountNumber());

    }

    @Test
    public void test_That_Bank_Can_Deposit_In_Account_From_Bank_Test() {
        Account firstAccount = gtbBank.createAccountFrom("firstName", "lastName", "pin");
        assertEquals(1, gtbBank.getTotalNumberOfAccount());
        assertEquals("1", firstAccount.getAccountNumber());
        Account newAccount = gtbBank.findAccount("1");
        assertEquals(1, gtbBank.getTotalAccountNumber());
        assertEquals("1", newAccount.getAccountNumber());
        gtbBank.deposit(2_000, "1");
        assertEquals(2_000, gtbBank.checkBalance("1", "pin"));
    }

    @Test
    public void test_That_Bank_Can_Withdraw_In_Account_From_Bank_Test() {
        Account firstAccount = gtbBank.createAccountFrom("firstName", "lastName", "pin");
        assertEquals(1, gtbBank.getTotalNumberOfAccount());
        assertEquals("1", firstAccount.getAccountNumber());
        Account newAccount = gtbBank.findAccount("1");
        assertEquals(1, gtbBank.getTotalAccountNumber());
        assertEquals("1", newAccount.getAccountNumber());
        gtbBank.deposit(2_000, "1");
       assertEquals(2_000, gtbBank.checkBalance("1", "pin"));
        gtbBank.withdraw(1_000, "1", "pin");
        assertEquals(1_000, gtbBank.checkBalance("1", "pin"));
    }


    @Test
    public void test_That_Bank_Cannot_Withdraw_With_WrongPin_From_Bank_Test() {
        Account firstAccount = gtbBank.createAccountFrom("firstName", "lastName", "pin");
        assertEquals(1, gtbBank.getTotalNumberOfAccount());
        assertEquals("1", firstAccount.getAccountNumber());
        Account newAccount = gtbBank.findAccount("1");
        assertEquals(1, gtbBank.getTotalAccountNumber());
        assertEquals("1", newAccount.getAccountNumber());
        gtbBank.deposit(2_000, "1");
        assertEquals(2_000, gtbBank.checkBalance("1", "pin"));
        gtbBank.withdraw(1_000, "1", "pin");
        assertThrows(InvalidPinException.class, () -> gtbBank.checkBalance("1", "wrongPin"));
    }



    @Test
    public void test_That_Bank_Can_Transfer_Money_From_One_Account_To_Another_Bank_Test(){
        Account firstAccount = gtbBank.createAccountFrom("firstName", "lastName", "pin");
        assertEquals(1, gtbBank.getTotalNumberOfAccount());
        assertEquals("1", firstAccount.getAccountNumber());
        Account secondAccount = gtbBank.createAccountFrom("daniel","adeniyi","1234");
        assertEquals(2,gtbBank.getTotalNumberOfAccount());
        assertEquals("2",secondAccount.getAccountNumber());
        assertEquals(0,gtbBank.checkBalance("1","pin"));
        assertEquals(0,gtbBank.checkBalance("2","1234"));
        gtbBank.deposit(5_000,"1");
        gtbBank.deposit(20_000,"1");
        assertEquals(25_000, gtbBank.checkBalance("1", "pin"));
        gtbBank.transferAmount(10_000,"1","2","pin");
        assertEquals(15_000,gtbBank.checkBalance("1","pin"));
        assertEquals(10_000,gtbBank.checkBalance("2","1234"));
        gtbBank.transferAmount(5_000,"2","1","1234");
        assertEquals(20_000,gtbBank.checkBalance("1","pin"));
        assertEquals(5_000,gtbBank.checkBalance("2","1234"));

    }
}



