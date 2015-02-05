package com.yahoo.flickr.qa.pages;

import com.yahoo.flickr.qa.utils.AbstractPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by srikanthv on 2/3/15.
 */
public class AutoSyncPage extends AbstractPage{

    public AutoSyncPage(AppiumDriver driver) {
        super(driver);
        initPage();
    }

    @iOSFindBy(name = "Auto Sync")
    private WebElement txtTitle;

    @iOSFindBy(xpath = "//UIAButton[1]")
    private WebElement btnBack;


}
