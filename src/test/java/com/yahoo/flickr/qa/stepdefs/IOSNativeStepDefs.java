package com.yahoo.flickr.qa.stepdefs;

import com.yahoo.flickr.qa.pages.LoginPage;
import com.yahoo.flickr.qa.pages.AutoSyncBannerPage;
import com.yahoo.flickr.qa.pages.WelcomePage;
import com.yahoo.flickr.qa.utils.AbstractDriver;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

/**
 * Created by srikanthv on 2/4/15.
 */
public class IOSNativeStepDefs {

    private static AppiumDriver driver;
    private WelcomePage welcomePage;
    private LoginPage loginPage;
    private AutoSyncBannerPage autoSyncBannerPage;

    @Before("@CreateEnvironment")
    public void createEnvironment(){
        driver=AbstractDriver.getDriver();
    }

    @After("@TearEnvironment")
    public void tearEnvironment(){
        driver.quit();
    }

    @Given("^I am on \"(.*?)\" page$")
    public void i_am_on_page(String page){
        if(page.equals("Welcome")){
            welcomePage=new WelcomePage(driver);
        }
    }

    @And("^I click on \"(.*?)\" button$")
    public void i_click_on_button(String arg1){
        if(arg1.equals("Get Started")){
            loginPage=welcomePage.clickGetStartedBtn();
        }else if(arg1.equals("Sign In")){
            autoSyncBannerPage =loginPage.clickSignInBtn();
        }

    }

    @Then("^I should be navigated to \"(.*?)\" screen$")
    public void i_should_be_navigated_to_screen(String page){
        if(page.equals("Login")){
            loginPage.verifyPage();
        }
    }

    @When("^I enter valid \"(.*?)\" and \"(.*?)\"$")
    public void i_enter_valid_and(String arg1, String arg2) throws Exception{
        loginPage.setUserNameEdit("mobiletesterqa2");
        loginPage.setPasswordEdit("Testing1");
    }

    @Then("^I should be logged in successfully$")
    public void i_should_be_logged_in_successfully() throws Exception{
        autoSyncBannerPage.clickSkipIWillDecideLater();
        driver.quit();
    }




}
