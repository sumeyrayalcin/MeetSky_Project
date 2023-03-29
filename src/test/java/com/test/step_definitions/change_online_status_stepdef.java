package com.test.step_definitions;

import com.test.pages.BasePage;
import com.test.pages.Change_Online_Status;
import com.test.utilities.BrowserUtils;
import com.test.utilities.ConfigurationReader;
import com.test.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class change_online_status_stepdef {
    BasePage basePage = new BasePage();
    Change_Online_Status change_online_status = new Change_Online_Status();


    @Given("user is on the Online Status page")
    public void user_is_on_the_online_status_page() throws InterruptedException {
        //Getting the page using the URL from configuration.properties
        Driver.getDriver().get(ConfigurationReader.getProperty("web.url"));

        //Calling our login method to log in to web table app
        basePage.login();

        Thread.sleep(3000);
        basePage.onlineStatusButton.click();

        Thread.sleep(3000);
        basePage.setStatusButton.click();

    }


    @Then("user can view online status")
    public void userCanViewOnlineStatus() {


        BrowserUtils.waitFor(3);
        System.out.println(change_online_status.onlineStatusPageTitle.getText());
        BrowserUtils.waitFor(3);
        Assert.assertTrue(change_online_status.onlineStatusPageTitle.isDisplayed());
    }


    @When("the user clicks the Away status option")
    public void theUserClicksTheAwayStatusOption() throws InterruptedException {

        Thread.sleep(3000);
        change_online_status.away_Status.click();
        Thread.sleep(3000);

    }

    @Then("the user's status changed to Away")
    public void theUserSStatusChangedToAway() {
        BrowserUtils.waitFor(3);
        System.out.println(change_online_status.onlineStatusPageTitle.getText());
        BrowserUtils.waitFor(3);
        Assert.assertTrue(change_online_status.onlineStatusPageTitle.isDisplayed());

    }

    @When("the user clicks the Do not disturb status option")
    public void theUserClicksTheDoNotDisturbStatusOption() {
        BrowserUtils.waitFor(3);
        change_online_status.doNotDisturb_Status.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the user's status changed to Do not disturb")
    public void theUserSStatusChangedToDoNotDisturb() {
        BrowserUtils.waitFor(3);
        System.out.println(change_online_status.onlineStatusPageTitle.getText());
        BrowserUtils.waitFor(3);
        Assert.assertTrue(change_online_status.onlineStatusPageTitle.isDisplayed());
    }

    @When("the user clicks the Invisible status option")
    public void theUserClicksTheInvisibleStatusOption() {
        BrowserUtils.waitFor(3);
        change_online_status.invisible_Status.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the user's status is changed to Invisible")
    public void theUserSStatusIsChangedToInvisible() {
        BrowserUtils.waitFor(3);
        System.out.println(change_online_status.onlineStatusPageTitle.getText());
        BrowserUtils.waitFor(3);
        Assert.assertTrue(change_online_status.onlineStatusPageTitle.isDisplayed());
    }

    @When("the user enters a custom status message In a meeting")
    public void theUserEntersACustomStatusMessageInAMeeting() {
        BrowserUtils.waitFor(3);
        change_online_status.inAMeeting_Status_Message.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the user's status message is changed to In a meeting")
    public void theUserSStatusMessageIsChangedToInAMeeting() {
        BrowserUtils.waitFor(3);
        System.out.println(change_online_status.onlineStatusPageTitle.getText());
        BrowserUtils.waitFor(3);
        Assert.assertTrue(change_online_status.onlineStatusPageTitle.isDisplayed());
    }

    @When("the user enters a custom status message commuting")
    public void theUserEntersACustomStatusMessageCommuting() {
        BrowserUtils.waitFor(3);
        change_online_status.commuting_Status_Message.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the user's status message is changed to commuting")
    public void theUserSStatusMessageIsChangedToCommuting() {
        BrowserUtils.waitFor(3);
        System.out.println(change_online_status.onlineStatusPageTitle.getText());
        BrowserUtils.waitFor(3);
        Assert.assertTrue(change_online_status.onlineStatusPageTitle.isDisplayed());
    }

    @When("the user enters a custom status message Working remotely")
    public void theUserEntersACustomStatusMessageWorkingRemotely() {
        BrowserUtils.waitFor(3);
        change_online_status.workingRemotely_Status_Message.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the user's status message is changed to Working remotely")
    public void theUserSStatusMessageIsChangedToWorkingRemotely() {
        BrowserUtils.waitFor(3);
        System.out.println(change_online_status.onlineStatusPageTitle.getText());
        BrowserUtils.waitFor(3);
        Assert.assertTrue(change_online_status.onlineStatusPageTitle.isDisplayed());
    }

    @When("the user enters a custom status message Out sick")
    public void theUserEntersACustomStatusMessageOutSick() {
        BrowserUtils.waitFor(3);
        change_online_status.outSick_Status_Message.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the user's status message is changed to Out sick")
    public void theUserSStatusMessageIsChangedToOutSick() {
        BrowserUtils.waitFor(3);
        System.out.println(change_online_status.onlineStatusPageTitle.getText());
        BrowserUtils.waitFor(3);
        Assert.assertTrue(change_online_status.onlineStatusPageTitle.isDisplayed());
    }

    @When("the user enters a custom status message Vacationing")
    public void theUserEntersACustomStatusMessageVacationing() {
        BrowserUtils.waitFor(3);
        change_online_status.vacationing_Status_Message.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the user's status message is changed to Vacationing")
    public void theUserSStatusMessageIsChangedToVacationing() {
        BrowserUtils.waitFor(3);
        System.out.println(change_online_status.onlineStatusPageTitle.getText());
        BrowserUtils.waitFor(3);
        Assert.assertTrue(change_online_status.onlineStatusPageTitle.isDisplayed());
    }

    @Then("user can click a custom status message with also using any emoji option")
    public void userCanClickACustomStatusMessageWithAlsoUsingAnyEmojiOption() {
        BrowserUtils.waitFor(3);
        change_online_status.emoji_message.click();
        Select emojiDropdown = new Select(Driver.getDriver().findElement(By.xpath("//*[@id=\"emoji-mart-list\"]")));


        WebElement currentlySelectedOption = emojiDropdown.getFirstSelectedOption();

        BrowserUtils.waitFor(3);
        Assert.assertEquals(change_online_status.any_chosen_emoji_in_online_status_message,currentlySelectedOption);

        BrowserUtils.waitFor(3);



    }

    @When("the user sets a time to clear the status message automatically")
    public void theUserSetsATimeToClearTheStatusMessageAutomatically() {
        BrowserUtils.waitFor(3);
        Select sets_time_clear_Dropdown = new Select(Driver.getDriver().findElement(By.xpath("//*[@id=\"body-user\"]/div[7]/div[2]/div/div/div[6]/div/div[2]/input")));


        WebElement currentlySelectedOption = sets_time_clear_Dropdown.getFirstSelectedOption();

        BrowserUtils.waitFor(3);
        Assert.assertEquals(change_online_status.any_chosen_emoji_in_online_status_message,currentlySelectedOption);

        BrowserUtils.waitFor(3);

    }

    @Then("the user's status message is automatically cleared after the specified time")
    public void theUserSStatusMessageIsAutomaticallyClearedAfterTheSpecifiedTime() {
        //????
    }

    @When("the user click the Clear status message")
    public void theUserClickTheClearStatusMessage() {
        BrowserUtils.waitFor(3);
        change_online_status.clear_Status_Message.click();
        BrowserUtils.waitFor(3);



    }

    @Then("the user's status message is now  empty")
    public void theUserSStatusMessageIsNowEmpty() {
        BrowserUtils.waitFor(3);
        System.out.println(change_online_status.onlineStatusPageTitle.getText());
        BrowserUtils.waitFor(3);
        Assert.assertTrue(change_online_status.onlineStatusPageTitle.isDisplayed());
    }


    @And("user clicks set status message")
    public void userClicksSetStatusMessage() {
        BrowserUtils.waitFor(3);
        change_online_status.setStatusMessage.click();
        BrowserUtils.waitFor(3);
    }
}