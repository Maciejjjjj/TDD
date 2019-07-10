import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {

    BankAccount bankAccount;

    @Before
    public void before() {
        bankAccount = new BankAccountImp();
    }

    @Test

    public void getAmountTest() {


        assertEquals(0, bankAccount.getAmount());

    }

    @Test
    public void depositIncreaseAmountTest() {

        //when
        bankAccount.deposit(1000);
        //then
        assertEquals(1000, bankAccount.getAmount());


    }

    @Test
    public void witdrawhIncreaseTest() {
        //when
        bankAccount.withdrawl(1000);
        //then
        assertEquals(-1000, bankAccount.getAmount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void throwExceptionWhenDebtMoreThan1000(){

        //when
        bankAccount.withdrawl(1001);

        //then
        //throw exception


    }

}
