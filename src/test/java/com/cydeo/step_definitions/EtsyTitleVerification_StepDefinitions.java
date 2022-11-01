package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyTitleVerificationPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyTitleVerification_StepDefinitions {

    EtsyTitleVerificationPage etsyTitleVerificationPage = new EtsyTitleVerificationPage();

    @Given("user is on Etsy home page")
    public void user_is_on_etsy_home_page() {

        Driver.getDriver().get("https://www.etsy.com");

    }
    @Then("user should see title is as expected")
    public void user_should_see_title_is_as_expected() {

        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals("Title verification is failed!", expectedTitle, actualTitle);
    }

    @When("user types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        //User types Wooden Spoon in the search box
        etsyTitleVerificationPage.searchBox.sendKeys("Wooden Spoon");
    }
    @When("user clicks search button")
    public void user_clicks_search_button() {
        //User clicks search button
        etsyTitleVerificationPage.searchButton.click();
    }
    @Then("user sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {

        String expected = "Wooden spoon";

        Assert.assertTrue(Driver.getDriver().getTitle().contains(expected));
    }

    @When("user types {string} in the search box")
    public void user_types_in_the_search_box(String searchKeyword) {
        etsyTitleVerificationPage.searchBox.sendKeys(searchKeyword);
    }

    @Then("user sees {string} is in the title")
    public void user_sees_is_in_the_title(String expectedTitle) {

        Assert.assertTrue(Driver.getDriver().getTitle().startsWith(expectedTitle));
    }
}
