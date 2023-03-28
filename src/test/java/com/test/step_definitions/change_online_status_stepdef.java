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
}