package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyTitleVerificationPage {

    public EtsyTitleVerificationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@data-id='search-query']")
    public WebElement searchBox;

    @FindBy (xpath = "//button[@data-id='gnav-search-submit-button']")
    public WebElement searchButton;


}
