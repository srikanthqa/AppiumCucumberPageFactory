package com.yahoo.flickr.qa.pages;

import com.yahoo.flickr.qa.utils.AbstractPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;

/**
 * Created by srikanthv on 2/4/15.
 */
public class AutoSyncBannerPage extends AbstractPage{

    public AutoSyncBannerPage(AppiumDriver driver) {
        super(driver);
    }

    @iOSFindBy(uiAutomator = ".buttons()[\"Skip, I'll decide later\"]")
    private WebElement linkSkipIWillDecideLater;

    public LandingPage clickSkipIWillDecideLater(){
        driverWait(linkSkipIWillDecideLater,10);
        linkSkipIWillDecideLater.click();
        return new LandingPage(driver);
    }

    public boolean verifyPage(){
        driverWait(linkSkipIWillDecideLater,10);
        return linkSkipIWillDecideLater.isDisplayed();
    }

}
