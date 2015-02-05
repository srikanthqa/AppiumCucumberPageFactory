package com.yahoo.flickr.qa.pages;

import com.yahoo.flickr.qa.utils.AbstractPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;

/**
 * Created by srikanthv on 2/4/15.
 */
public class WelcomePage extends AbstractPage{

    public WelcomePage(AppiumDriver driver) {
        super(driver);
        initPage();
    }

    @iOSFindBy(name = "Get Started")
    private WebElement btnGetStarted;

    public LoginPage clickGetStartedBtn(){
        btnGetStarted.click();
        return new LoginPage(driver);
    }
}
