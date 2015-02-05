package com.yahoo.flickr.qa.pages;

import com.yahoo.flickr.qa.utils.AbstractPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.openqa.selenium.WebElement;

/**
 * Created by srikanthv on 2/4/15.
 */
public class LandingPage extends AbstractPage{

    public LandingPage(AppiumDriver driver) {
        super(driver);
    }

    @iOSFindBy(uiAutomator = ".buttons()[\"Organize\"]")
    private WebElement btnOrganize;

    @iOSFindBy(uiAutomator = ".buttons()[\"Explore\"]")
    private WebElement btnExplore;

    @iOSFindBy(uiAutomator = ".buttons()[\"Camera\"]")
    private WebElement btnCamera;

    @iOSFindBy(uiAutomator = ".buttons()[\"Notifications\"]")
    private WebElement btnNotifications;

    @iOSFindBy(uiAutomator = ".buttons()[\"Profile\"]")
    private WebElement btnProfile;


    public OrganizePage clickOrganizeBtn(){
        btnOrganize.click();
        return new OrganizePage(driver);
    }

    public ExplorePage clickExploreBtn(){
        btnExplore.click();
        return new ExplorePage(driver);
    }

    public CameraPage clickCameraBtn(){
        btnCamera.click();
        return new CameraPage(driver);
    }

    public NotificationsPage clickNotificationsBtn(){
        btnNotifications.click();
        return new NotificationsPage(driver);
    }

    public ProfilePage clickProfileBtn(){
        btnProfile.click();
        return new ProfilePage(driver);
    }

    public boolean verifyPage(){
        return btnOrganize.isDisplayed() && btnProfile.isDisplayed() && btnNotifications.isDisplayed()
                && btnCamera.isDisplayed() && btnExplore.isDisplayed();
    }


}
