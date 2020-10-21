package Application;

import java.util.HashSet;
import java.util.Set;

public abstract class BankBase implements Bank {
    private long accountNumber;
    private long routingNumber;

    public static Set<BankBase> accountStorage = new HashSet<>();

    //to set account without getter and setters we need to create constructor
//Long  --> String
    public BankBase(long accountNumber, long routingNumber) throws Exception {
        if (Long.toString(accountNumber).length() == 12) {
            this.accountNumber = accountNumber;
        } else {
            throw new Exception("Account Number should be 12 digits long");
        }
        if (Long.toString(routingNumber).length() == 9) {
            this.routingNumber = routingNumber;
        } else {
            throw new Exception("Account Number should be 9 digits long");
        }
    }

    public static void addToAccountStorage(BankBase account) throws Exception {
        if (accountStorage.size() != 0) {
            for (BankBase bb : accountStorage) {
                if (bb.accountNumber == account.accountNumber) {
                    throw new Exception("Account number " + account.accountNumber + " already exists");
                } else if (bb.routingNumber == account.routingNumber) {
                    throw new Exception("Routing number " + account.routingNumber + "already exists");
                } else {
                    accountStorage.add(account);
                }
            }
        } else {
            accountStorage.add(account);
        }

    }
}