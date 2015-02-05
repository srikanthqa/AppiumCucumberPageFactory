package com.yahoo.flickr.qa.stepdefs;

import com.yahoo.flickr.qa.pages.*;
import com.yahoo.flickr.qa.utils.AbstractDriver;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

/**
 * Created by srikanthv on 2/4/15.
 */
public class IOSNativeStepDefs {

    private static AppiumDriver driver;
    private WelcomePage welcomePage;
    private LoginPage loginPage;
    private AutoSyncBannerPage autoSyncBannerPage;
    private LandingPage landingPage;
    private ProfilePage profilePage;
    private SettingsPage settingsPage;

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
        }else if(page.equals("Landing")){
            landingPage=new LandingPage(driver);
        }
    }

    @And("^I click on \"(.*?)\" button$")
    public void i_click_on_button(String button){
        if(button.equals("Get Started")){
            loginPage=welcomePage.clickGetStartedBtn();
        }else if(button.equals("Sign In")){
            autoSyncBannerPage =loginPage.clickSignInBtn();
        }else if(button.equals("Skip I'll decide later")){
            landingPage=autoSyncBannerPage.clickSkipIWillDecideLater();
        }else if(button.equals("Profile")){
            profilePage=landingPage.clickProfileBtn();
        }else if(button.equals("Settings")){
            settingsPage=profilePage.clickSettingsBtn();
        }else if(button.equals("SignOut")){
            welcomePage=settingsPage.clickSignOutBtn();
        }

    }

    @Then("^I should be navigated to \"(.*?)\" screen$")
    public void i_should_be_navigated_to_screen(String page){
        if(page.equals("Login")){
            Assert.assertTrue(loginPage.verifyPage());
        }else if(page.equals("AutoSyncBanner")){
            Assert.assertTrue(autoSyncBannerPage.verifyPage());
        }else if(page.equals("Landing")){
            Assert.assertTrue(landingPage.verifyPage());
        }else if(page.equals("Profile")){
            Assert.assertTrue(profilePage.verifyPage());
        }else if(page.equals("Settings")){
            Assert.assertTrue(settingsPage.verifyPage());
        }else if(page.equals("Welcome")){
            Assert.assertTrue(welcomePage.verifyPage());
        }
    }

    @When("^I enter valid \"(.*?)\" and \"(.*?)\"$")
    public void i_enter_valid_and(String arg1, String arg2) throws Exception{
        loginPage.setUserNameEdit("mobiletesterqa2");
        loginPage.setPasswordEdit("Testing1");
    }


}
