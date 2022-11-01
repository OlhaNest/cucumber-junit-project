package com.cydeo.step_definitions;

import com.cydeo.pages.AmazonTitleVerifPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AmazonTitleVerif_StepDefinitions {

    AmazonTitleVerifPage amazonTitleVerifPage = new AmazonTitleVerifPage();

    @Given("user is on Amazon page")
    public void user_is_on_amazon_page() {

        Driver.getDriver().get("https://www.amazon.com/");

    }
    @When("user should type {string} in the search box")
    public void user_should_type_in_the_search_box(String searchKeyword) {

        amazonTitleVerifPage.searchBox.sendKeys(searchKeyword);

    }
    @When("user clicks a search button")
    public void user_clicks_a_search_button() {

        amazonTitleVerifPage.searchButton.click();
    }
    @Then("user should see {string} is in the title")
    public void user_should_see_is_in_the_title(String expectedTitle) {

        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));

    }


}
