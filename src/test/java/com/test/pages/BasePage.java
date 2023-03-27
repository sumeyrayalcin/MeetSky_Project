package com.test.pages;


import com.test.utilities.ConfigurationReader;
import com.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
In this class we will store WebElements common to all pages
 */
public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "user")
    public WebElement inputUsername;

    @FindBy(name = "password")
    public WebElement inputPassword;

    @FindBy(xpath = "//*[@id=\"submit-form\"]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"expand\"]")
    public WebElement onlineStatusButton;

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[1]/div/a[2]")
    public WebElement setStatusButton;


    /**
     * No parameters.
     * When we call this method, it will directly login using
     *
     * Username: Employee123
     * Password: Employee31
     */
    public void login(){
        this.inputUsername.sendKeys("Employee31");
        this.inputPassword.sendKeys("Employee123");
        this.loginButton.click();


    }




}
