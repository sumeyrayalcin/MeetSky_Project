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
    public WebElement doNotDisturb_Status;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[7]/div[2]/div/div/div[2]/div[2]/label")
    public WebElement away_Status;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[7]/div[2]/div/div/div[2]/div[2]/label")
    public WebElement invisible_Status;

    @FindBy(xpath = "//*[@id=\"body-user\"]/div[7]/div[2]/div/div/div[5]/div[1]/span[2]")
    public WebElement inAMeeting_Status_Message;

    @FindBy(linkText ="Commuting" )
    public WebElement commuting_Status_Message;

    @FindBy(linkText = "Working remotely")
    public WebElement workingRemotely_Status_Message;

    @FindBy(linkText = "Out sick")
    public WebElement outSick_Status_Message;

    @FindBy(linkText ="Vacationing")
    public WebElement vacationing_Status_Message;

    @FindBy(xpath = "//input[@class='multiselect__input']")
    public WebElement clearingAfter_Status_Message;






    @FindBy(xpath = "//*[@id=\"expand\"]/div/div")
    public WebElement onlineStatusPageTitle;

  //  @FindBy(xpath = "//*[@id=\"body-user\"]/div[7]/div[2]/div/div/div[4]/form/input")
  //  public WebElement whatIsYourStatusEmoji;

    @FindBy(xpath = "//button[@class='custom-input__emoji-button']")
    public WebElement emoji_message;

    @FindBy(xpath = "//*[@id=\"emoji-mart-list\"]")
    public WebElement any_chosen_emoji_in_online_status_message;


    @FindBy(xpath = "//*[@id=\"body-user\"]/div[7]/div[2]/div/div/div[6]/div/div[2]/input")
    public WebElement sets_time_clear_status_message_automatically;



    @FindBy( linkText ="Clear status message")
    public WebElement clear_Status_Message;


    @FindBy(xpath = "//*[@id=\"body-user\"]/div[7]/div[2]/div/div/div[7]/button[2]")
    public WebElement setStatusMessage;












}
