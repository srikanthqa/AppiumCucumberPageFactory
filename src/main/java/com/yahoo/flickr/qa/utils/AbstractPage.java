package com.yahoo.flickr.qa.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by srikanthv on 2/3/15.
 */
public abstract class AbstractPage {

    protected AppiumDriver driver;

    public AbstractPage(AppiumDriver driver){
        this.driver=driver;
    }

    public void initPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

}
