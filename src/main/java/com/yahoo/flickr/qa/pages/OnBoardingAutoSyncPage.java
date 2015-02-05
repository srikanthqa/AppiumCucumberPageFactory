package com.yahoo.flickr.qa.pages;

import com.yahoo.flickr.qa.utils.AbstractPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;

/**
 * Created by srikanthv on 2/4/15.
 */
public class OnBoardingAutoSyncPage extends AbstractPage{

    public OnBoardingAutoSyncPage(AppiumDriver driver) {
        super(driver);
        initPage();
    }

    @iOSFindBy(uiAutomator = ".buttons()[\"Skip, I'll decide later\"]")
    private WebElement linkSkipIWillDecideLater;

    public void clickSkipIWillDecideLater(){
        linkSkipIWillDecideLater.click();
    }

}
