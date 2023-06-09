package com.test.pages;

import com.test.utilities.BrowserUtils;
import com.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class Change_Online_Status extends BasePage{
    public Change_Online_Status(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"expanddiv\"]/ul/li[1]/div/a[2]")
    public WebElement changeStatus;

    public void login(){
        this.changeStatus.click();
    }


   @FindBy(xpath = "//label[starts-with(@class,'user-status-online-select__label icon-user-status-online')]")
    public WebElement online_status;

    @FindBy(xpath = "//label[starts-with(@class,'user-status-online-select__label icon-user-status-dnd')]")
    public WebElement doNotDisturb_Status;

    @FindBy(xpath = "//label[starts-with(@class,'user-status-online-select__label icon-user-status-away')]")
    public WebElement away_Status;

    @FindBy(xpath = "//label[starts-with(@class,'user-status-online-select__label icon-user-status-invisible')]")
    public WebElement invisible_Status;

    @FindBy(linkText = "In a meeting")
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



    @FindBy(xpath = "//*[@id=\"body-user\"]/div[7]/div[2]/div/div")
    public WebElement onlineStatusPageTitle;

  //  @FindBy(xpath = "//*[@id=\"body-user\"]/div[7]/div[2]/div/div/div[4]/form/input")
  //  public WebElement whatIsYourStatusEmoji;

    @FindBy(xpath = "//button[@class='custom-input__emoji-button']")
    public WebElement emoji_message;

    @FindBy(xpath = "//*[@id=\"emoji-mart-list\"]")
    public WebElement any_chosen_emoji_in_online_status_message;


    @FindBy(xpath = "//span[@class='multiselect__single']")
    public WebElement sets_time_clear_status_message_automatically;


    @FindBy(xpath ="//button[@class='button-vue button-vue--text-only button-vue--vue-tertiary button-vue--wide']")
    public WebElement clear_Status_Message;


    @FindBy(xpath = "//*[@id=\"body-user\"]/div[7]/div[2]/div/div/div[7]/button[2]")
    public WebElement setStatusMessage;



    @FindBy(xpath = "//label[starts-with(@class,'user-status-online-select__label icon-user-status')]")
    public List<WebElement> status;


    @FindBy(xpath ="//*[@id=\"expanddiv\"]/ul/li[1]/div/a[2]")
    public WebElement checkStatus;

    @FindBy(xpath = "//div[@id='content']//button[contains(@class, 'status')]")
    public WebElement statusOnDashboard;




    @FindBy(xpath = "//span[starts-with(@class,'predefined-status__message')]")
    public List<WebElement> status_message;


    @FindBy(xpath = "//*[@id=\"status-status\"]/li/div/button")
    public WebElement appears_status_message;


    @FindBy(xpath = "//*[@id=\"body-user\"]/div[7]/div[2]/div/div/div[4]/form/input")
    public WebElement written_status_message_inbox;


    @FindBy(xpath = "//ul[@class='multiselect__content']/li[4]/span/div")
   public WebElement setting_time;

}
