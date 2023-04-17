package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonVerif {

    public AmazonVerif(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "twotabsearchtextbox")
    public WebElement searchBoxAmazon;

    @FindBy (id = "nav-search-submit-button")
    public WebElement getSearchBoxAmazon;


}
