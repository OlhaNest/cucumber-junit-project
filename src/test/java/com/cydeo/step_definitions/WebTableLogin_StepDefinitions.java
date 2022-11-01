package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLogin_StepDefinitions {

    WebTableLoginPage webTableLogin = new WebTableLoginPage();

    @Given("is on the login page of web table app")
    public void is_on_the_login_page_of_web_table_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("user enters username {string}")
    public void user_enters_username(String username) {
        webTableLogin.inputUsername.sendKeys(username);
    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        webTableLogin.inputPassword.sendKeys(password);
    }
    @When("user click to login button")
    public void user_click_to_login_button() {
        webTableLogin.loginButton.click();
    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));
    }

    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String username, String password) {
        webTableLogin.login(username,password);
    }

    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String, String> credentials) {
        webTableLogin.inputUsername.sendKeys(credentials.get("username"));
        webTableLogin.inputPassword.sendKeys(credentials.get("password"));
        webTableLogin.loginButton.click();

    }
}
