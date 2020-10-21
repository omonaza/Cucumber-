package Application;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import static org.junit.Assert.assertNotNull;
//
//public class chaseTest {
//    Chase alexChaseAccount;
//
//    @Test
//    public void depositTest() throws Exception {
//        alexChaseAccount = new Chase(123456789101l, 123456710);
//        alexChaseAccount.deposit(1000);
//        Assert.assertEquals(1000, alexChaseAccount.getBalance(), 0.0);
//
//    }
//
//    @Test
//    public void depositOutOfRange() throws Exception {
//        alexChaseAccount = new Chase(223456789102l, 123456711);
//        alexChaseAccount.deposit(1000000000);
//        Assert.assertEquals(0.0, alexChaseAccount.getBalance(), 0.0);
//    }

//    @Test
//    public void depositLessThanLimit() throws Exception {
//        alexChaseAccount = new Chase(323456789103l, 123456712);
//        alexChaseAccount.deposit(-10);
//        Assert.assertEquals(0.0, alexChaseAccount.getBalance(), 0.0);
//        assertNotNull(alexChaseAccount);
//    }
//
//    @Test
//    public void withDrawTest() throws Exception {
//        alexChaseAccount = new Chase(423456789104l, 123456713);
//        alexChaseAccount.deposit(1000);
//        alexChaseAccount.withDraw(500);
//        Assert.assertEquals(500, alexChaseAccount.getBalance(), 0.0);
//    }
//
//    @Test
//    public void withDrawLessThanAmountTest() throws Exception {
//        alexChaseAccount = new Chase(523456789105l, 123456714);
//        alexChaseAccount.deposit(-1);
//        alexChaseAccount.withDraw(500);
//        Assert.assertEquals(0.0, alexChaseAccount.getBalance(), 0.0);
//    }
//
//    @Test
//    public void withDrawBiggerThanAmountTest() throws Exception {
//        alexChaseAccount = new Chase(623456789106l, 123456715);
//        alexChaseAccount.deposit(1000);
//        alexChaseAccount.withDraw(50000);
//        Assert.assertEquals(1000, alexChaseAccount.getBalance(), 0.0);
//    }
//}



