package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearOrderProcessPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class SmartBearOrderProcess_StepDefinitions {

    SmartBearOrderProcessPage smartBearOrder = new SmartBearOrderProcessPage();


    @Given("user is logged into SmartBear Tester account")
    public void user_is_logged_into_smart_bear_tester_account() {

        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        smartBearOrder.usernameBox.sendKeys("Tester");
        smartBearOrder.passwordBox.sendKeys("test");
        smartBearOrder.loginBtn.click();
    }
    @Given("user is on Order page")
    public void user_is_on_order_page() {

        smartBearOrder.orderPage.click();

    }
    @When("user selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {

        Select select = new Select(smartBearOrder.selectDropdown);
        select.selectByVisibleText("FamilyAlbum");

    }
    @And("user enters {string} to quantity")
    public void userEntersToQuantity(String numQuantity) {
        smartBearOrder.quantityBox.sendKeys(numQuantity);
    }
    @When("user enters {string} to costumer name")
    public void user_enters_to_costumer_name(String name) {
        smartBearOrder.customerNameBox.sendKeys(name);
    }
    @When("user enters {string} to street")
    public void user_enters_to_street(String street) {
        smartBearOrder.streetBox.sendKeys(street);
    }
    @When("user enters {string} to city")
    public void user_enters_to_city(String city) {
        smartBearOrder.cityBox.sendKeys(city);
    }
    @When("user enters {string} to state")
    public void user_enters_to_state(String state) {
        smartBearOrder.stateBox.sendKeys(state);
    }
    @And("user enters {string}")
    public void userEnters(String zip) {
        smartBearOrder.zipBox.sendKeys(zip);
    }
    @When("user selects {string} as card type")
    public void user_selects_as_card_type(String cardType) {

        switch(cardType){

            case "Visa":
                smartBearOrder.visaBtn.click();
                break;
            case "MasterCard":
                smartBearOrder.masterCardBtn.click();
                break;
            case "American Express":
                smartBearOrder.americanExpressBtn.click();
                break;
        }
    }
    @And("user enters {string} to card number")
    public void userEntersToCardNumber(String cardNum) {
        smartBearOrder.cardNumberBox.sendKeys(cardNum);
    }
    @When("user enters {string} to expiration date")
    public void user_enters_to_expiration_date(String exprDate) {
        smartBearOrder.expireDateBox.sendKeys(exprDate);
    }
    @When("user clicks process button")
    public void user_clicks_process_button() {
        smartBearOrder.processBtn.click();
    }
    @Then("user verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String nameInList) {
        smartBearOrder.viewAllOrders.click();

        Assert.assertTrue("The user is not in the list!", smartBearOrder.list.getText().equals(nameInList));

    }

}
