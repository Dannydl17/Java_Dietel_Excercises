package bankingApp;

import bankingApp.exception.InvalidAmountException;
import bankingApp.exception.InvalidPinException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {

    private Account account;
    @BeforeEach
    public void setUp(){
        account = new Account("accountNumber", "Account name", "3456");
    }
    @Test
    public void depositOneK_BalanceIsOneKTest(){
        account.deposit(1_000);
        assertEquals(1_000, account.checkBalance("3456"));
        account.deposit(5_000);
        assertEquals(6_000, account.checkBalance("3456"));
    }
    @Test
    public void depositOneK_depositTwoKIsThreeKTest(){
        account.deposit(1_000);
        account.deposit(2_000);
        assertEquals(3_000, account.checkBalance("3456"));
    }
    @Test
    public void wrongPinInCheckBalance_throwsExceptionTest(){
       assertThrows(InvalidPinException.class, ()-> account.checkBalance("wrongPin"));
    }
    @Test
    public void correctPin_returnsBalanceTest(){
        account.deposit(1_000);
        account.deposit(2_000);
        assertEquals(3_000, account.checkBalance("3456"));
    }
    @Test
    public void withdrawWith(){
        account.deposit(1_000);
        account.deposit(2_000);
        assertEquals(3_000, account.checkBalance("3456"));
        account.withdraw(2_000, "3456");
        assertEquals(1_000, account.checkBalance("3456"));

    }
    @Test
    public void depositNegativeAmount_throwExceptionTest(){
        assertThrows(InvalidAmountException.class, ()-> account.deposit(-30));
    }
    @Test
    public void depositOneK_withdraw5h_balanceIs5hTest(){
        account.deposit(1_000);
        account.withdraw(5_00, "3456");
        assertEquals(5_00, account.checkBalance("3456"));
    }
    @Test
    public void depositFiveK_withdrawSevenH_balanceIs5hTest(){
        account.deposit(5_000);
        account.withdraw(3_000, "3456");
        assertEquals(2_000, account.checkBalance("3456"));
    }

}
