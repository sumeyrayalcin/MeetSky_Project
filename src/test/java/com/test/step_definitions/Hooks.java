package com.test.step_definitions;

/*
In this class we will be able to pass pre and post conditions to each
scenario and each step

 */

import com.test.utilities.BrowserUtils;
import com.test.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //import from io.cucumber.java not from junit

    // @Before(order = 1)
    public void setupScenario() {
        System.out.println("======Setting up browser using cucumber @Before");
    }

    //  @Before(value = "@login", order = 2)
    public void setupScenarioFirLogins() {
        System.out.println("======This will only apply to scenarios with @login tag");
    }

    // @Before(value = "@db", order = 0)
    public void setupForDatabaseScenarios() {
        System.out.println("======This will only apply to scenarios with @db tag");
    }

    @After
    public void teardownScenario(Scenario scenario) {

        //scenario.isFailed() --> if scenario fails this method will return TRUE boolean value
        if (scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        BrowserUtils.sleep(2);


        Driver.closeDriver();
        //System.out.println("====Closing browser using cucumber @After");
        //System.out.println("====Scenario ended/ Take screenshot if failed!");
    }

    //  @BeforeStep
    public void setupStep () {

        System.out.println("------------> applying setup using @BeforeSetup");
    }

    // @AfterStep
    public void afterStep () {
        System.out.println("------------> applying tearDown using @AfterStep");
    }

}