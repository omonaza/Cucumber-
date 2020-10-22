package stepDefenitions;

import Application.BankBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class WithDrawSteps {

    @Given("^all accounts are reset$")
    public void all_accounts_are_reset() {
        //cache -> clear the cache of application before every test.
        BankBase.allBankRecords.clear();
    }

}

