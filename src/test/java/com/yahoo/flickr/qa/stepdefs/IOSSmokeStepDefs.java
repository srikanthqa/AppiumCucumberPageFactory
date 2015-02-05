package com.yahoo.flickr.qa.stepdefs;

import com.yahoo.flickr.qa.pages.LoginPage;
import com.yahoo.flickr.qa.pages.OnBoardingAutoSyncPage;
import com.yahoo.flickr.qa.pages.WelcomePage;
import com.yahoo.flickr.qa.utils.AbstractDriver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by srikanthv on 2/4/15.
 */
public class IOSSmokeStepDefs {

    private static AppiumDriver driver;
    private WelcomePage welcomePage;
    private LoginPage loginPage;
    private OnBoardingAutoSyncPage onBoardingAutoSyncPage;


    @Given("^I have the Flickr app installed on my device$")
    public void i_have_the_Flickr_app_installed_on_my_device(){
        driver= AbstractDriver.getDriver();
        welcomePage=new WelcomePage(driver);
    }

    @And("^I click on \"(.*?)\" button$")
    public void i_click_on_button(String arg1){
        if(arg1.equals("Get Started")){
            loginPage=welcomePage.clickGetStartedBtn();
        }else if(arg1.equals("Sign In")){
            onBoardingAutoSyncPage=loginPage.clickSignInBtn();
        }

    }

    @Then("^I should be navigated to Login screen$")
    public void i_should_be_navigated_to_Login_screen(){
        System.out.println("Login page is shown");
    }

    @When("^I enter valid \"(.*?)\" and \"(.*?)\"$")
    public void i_enter_valid_and(String arg1, String arg2) throws Exception{
        loginPage.setUserNameEdit("mobiletesterqa2");
        loginPage.setPasswordEdit("Testing1");
    }

    @Then("^I should be logged in successfully$")
    public void i_should_be_logged_in_successfully() throws Exception{
        System.out.println("Login Successful");
        Thread.sleep(5000);
        onBoardingAutoSyncPage.clickSkipIWillDecideLater();
        Thread.sleep(10000);
        driver.quit();
    }


}
