package com.cydeo.step_definitions;

import com.cydeo.pages.AmazonVerif;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AmazonVerif_StepDefs {


    AmazonVerif amazonVerif = new AmazonVerif();

    @Given("user is on Amazon pages")
    public void user_is_on_amazon_pages() {

        Driver.getDriver().get("https://www.amazon.com/");
    }
    @When("user should type {string} in the search boxs")
    public void user_should_type_in_the_search_boxs(String string) {

        amazonVerif.searchBoxAmazon.sendKeys(string);

    }
    @When("user clicks a search buttons")
    public void user_clicks_a_search_buttons() {

        amazonVerif.getSearchBoxAmazon.click();

    }
    @Then("user should see {string} is in the titles")
    public void user_should_see_is_in_the_titles(String string) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));

    }
}
