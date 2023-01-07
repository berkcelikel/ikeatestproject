package StepDefinitions;


import Pages.BodyContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;


public class ikeatest {

    BodyContent ikea = new BodyContent();

        @Given("Navigate to ikea.com.tr")
        public void NavigateToIkeaComTr()
          {
            GWD.getDriver().get("https://www.ikea.com.tr");
            GWD.getDriver().manage().window().maximize();
        }

    @And("the table is typed into the search box.")
    public void theTableIsTypedIntoTheSearchBox(DataTable masa) {

        List<List<String>> listElement = masa.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            ikea.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("the second option is added to the cart.")
    public void theSecondOptionIsAddedToTheCart(DataTable add) {

        List<String> listElement = add.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            ikea.findAndClick(listElement.get(i));
        }
    }

    @And("Go to cart.")
    public void goToCart(DataTable cart) {
        List<String> listElement = cart.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            ikea.findAndClick(listElement.get(i));
        }

    }

    @And("Add to Adress")
    public void addToAdress(DataTable adres2) {

        List<String> listElement = adres2.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            ikea.findAndClick(listElement.get(i));
        }
    }

    @And("Address Info")
    public void addressInfo(DataTable adress) {

        List<List<String>> listElement = adress.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            ikea.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("AdressAddValue")
    public void adressaddvalue(DataTable value) {

        List<List<String>> listElement = value.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++)
        {
            ikea.findandselectvalue(listElement.get(i).get(0),listElement.get(i).get(1));
        }


    }

    @And("The table item in the basket is removed.")
    public void theTableItemInTheBasketIsRemoved(DataTable remove) {

        List<String> listElement = remove.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            ikea.findAndClick(listElement.get(i));
        }
    }

    @Then("Your Shopping Cart is currently empty.")
    public void yourShoppingCartIsCurrentlyEmpty(DataTable check) {


        List<String> listElement = check.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            ikea.findAndContainsText("check","Alışveriş Sepetiniz");
        }

    }
}

