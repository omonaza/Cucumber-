package stepDefenitions;

import Application.BankBase;
import Application.BankOfAmerica;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;

import java.util.List;
import java.util.Map;

public class BankOfAmericaSteps {

    @Given("^the following user account is created$")
    public void the_following_user_account_is_created(List<Map<String, Long>> accountAndRoutingNums) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)


        //gives all rows starting from the given row
//        System.out.println(dataTable.cells(0));
//
//        List<String> dataTableToList = dataTable.asList(String.class);
//        System.out.println(dataTableToList);
//
//        List<List<String>> dataTableToLists = dataTable.asLists(String.class);
//        System.out.println(dataTableToLists);
//        System.out.println(dataTableToLists.get(2).get(1));
//
//
//        List<Map<String, Long>> dataTableToMap = dataTable.asMaps(String.class, Long.class);
//        System.out.println(dataTableToMap);
//
//        System.out.println(dataTableToMap.get(2).get("accountNumber"));


        System.out.println(accountAndRoutingNums);
        BankBase bankOfAmerica = new BankOfAmerica(accountAndRoutingNums.get(0).get("accountNumber"), accountAndRoutingNums.get(0).get("routingNumber"));
        BankBase bankOfAmerica2 = new BankOfAmerica(accountAndRoutingNums.get(1).get("accountNumber"), accountAndRoutingNums.get(1).get("routingNumber"));
        System.out.println("Account number: " + bankOfAmerica.getAccountNumber());


    }

}
