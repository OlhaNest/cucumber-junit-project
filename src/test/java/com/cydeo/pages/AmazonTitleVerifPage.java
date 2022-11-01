package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonTitleVerifPage {

    public AmazonTitleVerifPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy (id = "nav-search-submit-button")
    public WebElement searchButton;
}
