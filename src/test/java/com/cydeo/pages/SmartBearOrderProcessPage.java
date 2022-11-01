package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearOrderProcessPage {

    public SmartBearOrderProcessPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "ctl00_MainContent_username")
    public WebElement usernameBox;

    @FindBy (id = "ctl00_MainContent_password")
    public WebElement passwordBox;

    @FindBy (id = "ctl00_MainContent_login_button")
    public WebElement loginBtn;

    @FindBy (xpath = "//a[.='Order']")
    public WebElement orderPage;

    @FindBy (id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement selectDropdown;

    @FindBy (css = "#ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantityBox;

    @FindBy (css = "#ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerNameBox;

    @FindBy (css = "#ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement streetBox;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement cityBox;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement stateBox;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipBox;
    
    @FindBy (css = "#ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement visaBtn;

    @FindBy (css = "#ctl00_MainContent_fmwOrder_cardList_1")
    public WebElement masterCardBtn;

    @FindBy (css = "#ctl00_MainContent_fmwOrder_cardList_2")
    public WebElement americanExpressBtn;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumberBox;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expireDateBox;

    @FindBy (id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement processBtn;

    @FindBy (xpath = "//a[.='View all orders']")
    public WebElement viewAllOrders;

    @FindBy (xpath = "//table[@id='ctl00_MainContent_orderGrid']//tbody//tr[2]//td[2]")
    public WebElement list;









}
