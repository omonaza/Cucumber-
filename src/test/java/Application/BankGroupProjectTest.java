package Application;

import org.junit.Assert;
import org.junit.Test;

public class BankGroupProjectTest {
    @Test(expected = Exception.class)
    public void invalidRoutingChase() throws Exception{
        Chase chase1= new Chase(123456789101112l,1234567891012l);

    }
    @Test
    public void invalidAccountNumberChase() {
        boolean exceptionCatch = false;
        try {
            Chase chase2 = new Chase(12345678912321L, 123456789L);
        } catch (Exception e) {
            exceptionCatch = true;
            System.out.println(e.getMessage());
        } finally {
            Assert.assertTrue(exceptionCatch);
        }
    }
    @Test
    public void invalidAccountNumberException() {
        String message = "";
        try {
            Chase chase2 = new Chase(12345678912376L, 123456789L);
        } catch (Exception e) {
            message = e.getMessage();
            System.out.println(e.getMessage());
        }
        Assert.assertEquals("Account number must be 12", message);
    }
}
// Homework
// finish with the set validation
// when 1 account is created, set should not be empty
// when 2 accounts are created with the same account number, set should contain only one account
// when 2 different accounts are created, set should have both accounts
// create as many test cases as you wish

