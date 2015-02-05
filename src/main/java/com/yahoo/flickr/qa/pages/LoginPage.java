package com.yahoo.flickr.qa.pages;

import com.yahoo.flickr.qa.utils.AbstractPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;

/**
 * Created by srikanthv on 2/4/15.
 */
public class LoginPage extends AbstractPage{

    public LoginPage(AppiumDriver driver) {
        super(driver);
        initPage();
    }

    @iOSFindBy(uiAutomator = ".scrollViews()[0].webViews()[0].textFields().firstWithPredicate(\"value like 'Username or number'\")")
    private WebElement editUserName;

    @iOSFindBy(uiAutomator = ".scrollViews()[0].webViews()[0].secureTextFields().firstWithPredicate(\"value like 'Password'\")")
    private WebElement editPassword;

    @iOSFindBy(uiAutomator = ".scrollViews()[0].webViews()[0].buttons()[\"Sign In\"]")
    private WebElement btnSignIn;

    public void setUserNameEdit(String username){
        editUserName.click();
        editUserName.sendKeys(username);
    }

    public void setPasswordEdit(String password){
        editPassword.click();
        editPassword.sendKeys(password);
    }

    public OnBoardingAutoSyncPage clickSignInBtn(){
        btnSignIn.click();
        return new OnBoardingAutoSyncPage(driver);
    }



}
