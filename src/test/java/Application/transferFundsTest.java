//package Application;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import static Application.BankerDemo.transferFunds;
//
//public class transferFundsTest {
//    @Test
//    public void transferTest() {
//        Chase alexChaseAccount = new Chase();
//        alexChaseAccount.deposit(1000);
//
//        Chase belaChaseAccount = new Chase();
//        belaChaseAccount.deposit(2000);
//
//        transferFunds(alexChaseAccount, belaChaseAccount, 800);
//        Assert.assertEquals(alexChaseAccount.getBalance(), 200, 0.0);
//        Assert.assertEquals(belaChaseAccount.getBalance(), 2800, 0.0);
//    }
//        @Test
//        public void negativeTransferTest(){
//
//        Chase alexChaseAccount1 = new Chase();
//        alexChaseAccount1.deposit(100);
//
//        Chase belaChaseAccount1 = new Chase();
//        belaChaseAccount1.deposit(20);
//
//        transferFunds(alexChaseAccount1, belaChaseAccount1, 150);
//        Assert.assertEquals(alexChaseAccount1.getBalance(),100,0.0);
//        Assert.assertEquals(belaChaseAccount1.getBalance(),170,0.0);
//
//
//    }
//


//}
