package com.test.pages;

import com.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Change_Online_Status extends BasePage{
    public Change_Online_Status(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[1]/div/a[2]")
    public WebElement changeStatus;

    public void login(){
        this.changeStatus.click();
    }


    @FindBy(xpath = "//*[@id=\"body-user\"]/div[7]/div[2]/div/div/div[2]/div[1]/label")
    public WebElement Online_status;



    @FindBy(xpath = "//*[@id=\"body-user\"]/div[7]/div[2]/div/div/div[2]/div[3]/label")
    public WebElement DoNotDisturb_Status;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[7]/div[2]/div/div/div[2]/div[2]/label")
    public WebElement Away_Status;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[7]/div[2]/div/div/div[2]/div[2]/label")
    public WebElement Invisible_Status;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[7]/div[2]/div/div/div[5]/div[1]/span[2]")
    public WebElement InAMeeting_Status_Message;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[7]/div[2]/div/div/div[5]/div[2]/span[2]")
    public WebElement Commuting_Status_Message;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[7]/div[2]/div/div/div[5]/div[3]/span[2]")
    public WebElement WorkingRemotely_Status_Message;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[7]/div[2]/div/div/div[5]/div[4]/span[2]")
    public WebElement OutSick_Status_Message;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[7]/div[2]/div/div/div[5]/div[5]/span[2]")
    public WebElement Vacationing_Status_Message;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[7]/div[2]/div/div/div[6]/div/div[2]/input")
    public WebElement ClearingAfter_Status_Message;


    @FindBy( linkText ="Clear status message")
    public WebElement Clear_Status_Message;

    @FindBy( linkText ="Set status message")
    public WebElement Set_Status_Message;


    @FindBy(xpath = "//h3[.='Online status']")
    public WebElement onlineStatusPageTitle;












}
