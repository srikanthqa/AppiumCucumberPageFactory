package com.yahoo.flickr.qa.pages;

import com.yahoo.flickr.qa.utils.AbstractPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

/**
 * Created by srikanthv on 2/3/15.
 */
public class SettingsPage extends AbstractPage{

    public SettingsPage(AppiumDriver driver) {
        super(driver);
    }

    @iOSFindBy(name = "Settings")
    private WebElement txtTitle;

    @iOSFindBy(name = "Sign Out")
    private WebElement btnSignOut;

    public WelcomePage clickSignOutBtn(){
        driver.scrollTo("Sign Out").click();
        driver.switchTo().alert().accept();
        return new WelcomePage(driver);
    }

    public boolean verifyPage(){
        return txtTitle.isDisplayed();
    }
}
