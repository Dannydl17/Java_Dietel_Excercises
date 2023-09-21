package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    @Test
    public void testThatAccountCanDepositTest(){
        // given
       Account account = new Account();
       // when
       account.deposit(5000);
       // check
        int balance = account.checkBalance();
        assertEquals(5000, balance);
    }

    @Test
    public void testThatAccountCanDepositTwice(){
        Account account = new Account();
        account.deposit(5000);
        assertEquals(5000, account.checkBalance());

        account.deposit(2000);

        int balance = account.checkBalance();
        assertEquals(7000, balance);
    }

    @Test
    public void testThatAccountCannotSDepositNegativeValueTest(){
        Account account = new Account();
        account.deposit(5000);
        assertEquals(5000, account.checkBalance());

        account.deposit(-2000);

        int balance = account.checkBalance();
        assertEquals(5000, balance);
    }

    @Test
    public void testThatAccountCanWithdrawTest(){
        Account account = new Account();
        account.deposit(2500);
        assertEquals(2500, account.checkBalance());

        account.withdraw(1000);

        int balance = account.checkBalance();
        assertEquals(1500, balance);
    }

    @Test
    public void testThatAccountCannotWithdrawNegativeValueTest(){
        Account account = new Account();
        account.deposit(2500);
        assertEquals(2500, account.checkBalance());

        account.withdraw(-1000);
        account.withdraw(-2500);

        int balance = account.checkBalance();
        assertEquals(2500, balance);
    }

    @Test
    public void testThatAccountCannotWithdrawAboveYourBalanceTest(){
        Account account = new Account();
        account.deposit(2500);
        assertEquals(2500, account.checkBalance());

        account.withdraw(3500);
        account.withdraw(4000);

        int balance = account.checkBalance();
        assertEquals(2500, balance);
    }
}