package com.yahoo.flickr.qa.pages;

import com.yahoo.flickr.qa.utils.AbstractPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;

/**
 * Created by srikanthv on 2/4/15.
 */
public class ProfilePage extends AbstractPage{

    public ProfilePage(AppiumDriver driver) {
        super(driver);
    }

    @iOSFindBy(uiAutomator = ".buttons()[\"Settings\"]")
    private WebElement btnSettings;

    public SettingsPage clickSettingsBtn(){
        btnSettings.click();
        return new SettingsPage(driver);
    }

    public boolean verifyPage(){
        return btnSettings.isDisplayed();
    }
}
