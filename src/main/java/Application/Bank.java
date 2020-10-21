package Application;


public interface Bank {
    double getBalance();
    void deposit(double amount);
    void withDraw(double amount);

//    All BankTypes should include account number and routing numbers.
//    When creating Chase or BankOfAmerica objects no duplicate account number or routing numbers should be allowed.

    //Create Chase class which will implement Bank interface.
//it should have balance variable.
//it should not let withdraw more than 1000.
//it should not let deposit more than 10000;
//it should not let withdraw or deposit negative values.
    
}
