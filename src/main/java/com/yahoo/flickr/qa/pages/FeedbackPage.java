package com.yahoo.flickr.qa.pages;

import com.yahoo.flickr.qa.utils.AbstractPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

/**
 * Created by srikanthv on 2/3/15.
 */
public class FeedbackPage extends AbstractPage{

    public FeedbackPage(AppiumDriver driver) {
        super(driver);
        initPage();
    }
}
