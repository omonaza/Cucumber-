package Application;

public class BankerDemo {

    public static void main(String[] args) {


        //polymorphism can be used in initializing an object when you decide which object to initialize at runtime;

//        Bank whateverBank;
//
//
//        System.out.println("Pls enter which bank account you want to open");
//
//        String userChoice = new Scanner(System.in).nextLine();
//
//        switch (userChoice.toLowerCase()) {
//            case "chase":
//                whateverBank=new Chase();
//                break;
//            case "bank of america":
//                whateverBank = new BankOfAmerica();
//                break;
//            default:
//                whateverBank = null;
//        }
//
//        whateverBank.deposit(1443);
//        System.out.println(whateverBank.getBalance());


        //How above code would look like if no interfaces are used.
        //We are repeating the same actions on each case.
        //       Chase chase = null;
        //        BankOfAmerica bankOfAmerica = null;
        //        System.out.println("Pls enter which bank account you want to open");
        //
        //        String userChoice = new Scanner(System.in).nextLine();
        //
        //        switch (userChoice.toLowerCase()) {
        //            case "chase":
        //                chase =new Chase();
        //                chase.deposit(1443);
        //                System.out.println(chase.getBalance());
        //                break;
        //            case "bank of america":
        //                bankOfAmerica = new BankOfAmerica();
        //                bankOfAmerica.deposit(1443);
        //                System.out.println(bankOfAmerica.getBalance());
        //                break;
        //
        //       }

//        Chase alexChaseAccount = new Chase();
//        alexChaseAccount.deposit(1000);
//
//        Chase belaChaseAccount = new Chase();
//        belaChaseAccount.deposit(2000);
//
//
//        transferFunds(alexChaseAccount, belaChaseAccount, 800);
//        System.out.println(alexChaseAccount.getBalance());
//        System.out.println(belaChaseAccount.getBalance());
//
//
//        BankOfAmerica johnBankOfAmericaAccount = new BankOfAmerica();
//        johnBankOfAmericaAccount.deposit(2000);//2200
//
//        System.out.println();
//        transferFunds(johnBankOfAmericaAccount, alexChaseAccount, 800);
//        System.out.println(alexChaseAccount.getBalance());
//        System.out.println(johnBankOfAmericaAccount.getBalance());
//

    }

    /**
     *  Putting interface types in params enable these Bank sender and reciepent params(arguments) to be able to be used with any class that implements
     *  Bank interface.
     * @param sender -> put bankAccount of a sender
     * @param recipient -> put bankAccout of a recipient
     */
    public static void transferFunds(Bank sender,Bank recipient, double transferAmount) {
        sender.withDraw(transferAmount);
        recipient.deposit(transferAmount);
    }

//    public static void transferFunds(Chase sender, Chase recipient, double transferAmount) {
//        sender.withDraw(transferAmount);
//        recipient.deposit(transferAmount);
//    }
//
//    public static void transferFunds(Chase sender, BankOfAmerica recipient, double transferAmount) {
//        sender.withDraw(transferAmount);
//        recipient.deposit(transferAmount);
//    }
//
//    public static void transferFunds(BankOfAmerica sender, BankOfAmerica recipient, double transferAmount) {
//        sender.withDraw(transferAmount);
//        recipient.deposit(transferAmount);
//    }
//
//    public static void transferFunds(BankOfAmerica sender, Chase recipient, double transferAmount) {
//        sender.withDraw(transferAmount);
//        recipient.deposit(transferAmount);
//    }


}
