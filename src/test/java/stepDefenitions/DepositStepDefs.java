package stepDefenitions;

import Application.BankBase;

import Application.Chase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DepositStepDefs {

    BankBase chase;

    //What is regex --> regex is a rule that the format of a String must match.
    @Given("^User account with accountNumer (\\d+) and routing number (\\d+) is opened$")
    public void createAccount(long accountNum, long routingNum) throws Exception {
        System.out.println("Hello I am an account creation step");

        //checked exceptions must either be declared as throws or caught
        chase = new Chase(accountNum,routingNum);

        System.out.println("account number: " + accountNum);
        System.out.println("routing number: " + routingNum);
    }

    //make this step dynamic with double.
    @When("^User deposits \\$(\\d+)$")
    public void dep(int amount) {
        System.out.println("Hello I am deposit step");
        chase.deposit(amount);
        System.out.println("Amount deposited: " + amount);
    }

    //make this step dynamic with double.
    @Then("^User should have \\$(\\d+) in account$")
    public void check(int amount) {
        System.out.println("Hello I am validation step");
        double actual = chase.getBalance();
        //hard coding the expected data
        double expected = amount;

        Assert.assertEquals("balance amount is invalid",expected,actual,0.0);
        System.out.println("current balance: " + amount);
    }


    @When("^User deposits \\$-(\\d+)$")
    public void user_deposits_$(int amount)  {
        chase.deposit(-amount);
    }
}
