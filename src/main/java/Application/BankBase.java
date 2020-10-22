package Application;

import java.util.HashSet;
import java.util.Set;

public abstract class BankBase implements Bank {
    private long accountNumber;
    private long routingNumber;

    public static Set<BankBase> allBankRecords = new HashSet<>();


    public BankBase(long accountNumber, long routingNumber) throws Exception {
        if (Long.toString(accountNumber).length() != 12){
            throw  new Exception("Account number must be 12");
        }
        else if(Long.toString(routingNumber).length() != 9){
            throw  new Exception("Routing number must be 9");
        }
        else {
            this.accountNumber = accountNumber;
            this.routingNumber = routingNumber;
        }
    }


    /**
     * Adds newly created bank to static list after checking for duplicate account and routing numbers
     * @param bank
     * @throws Exception
     */
    public static void addToAllBankRecords(BankBase bank) throws Exception {
        if (!allBankRecords.isEmpty()) {
            for (BankBase b : allBankRecords) {
                if (b.routingNumber == bank.routingNumber) {
                    throw new Exception("Routing number " + bank.routingNumber + " already exists");
                } else if (b.accountNumber == bank.accountNumber) {
                    throw new Exception("Account number " + bank.accountNumber + " already exists");
                } else {
                    allBankRecords.add(bank);
                }
            }
        } else {
            allBankRecords.add(bank);
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public long getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(long routingNumber) {
        this.routingNumber = routingNumber;
    }

}