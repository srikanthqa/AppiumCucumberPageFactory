package com.yahoo.flickr.qa.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

/**
 * Created by srikanthv on 2/3/15.
 */
public abstract class AbstractPage {

    protected AppiumDriver driver;

    public AbstractPage(AppiumDriver driver){
        this.driver=driver;
        initPage();
    }

    public void initPage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }

    public void rotateScreen() {
        driver.rotate(ScreenOrientation.LANDSCAPE);
    }

    public void takeScreenShot(String fileName) {
        File file = new File(fileName + ".png");
        File tmpFile = ((TakesScreenshot) driver)
                .getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(tmpFile, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public AbstractPage driverWait(WebElement webElement, int secs){
        new WebDriverWait(driver,secs).until(ExpectedConditions.visibilityOf(webElement));
        return this;
    }

}
