package com.yahoo.flickr.qa.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

/**
 * Created by srikanthv on 2/4/15.
 */
public class AbstractDriver {

    private static Properties prop;
    private static AppiumDriver driver;
    private static final String IOS_PROPERTIES = "ios.properties";
    private static final String ANDROID_PROPERTIES = "android.properties";

    public AbstractDriver(DevicePlatform platform) throws IOException{
        prop = new Properties();
        InputStream propertyFile = new FileInputStream("src/main/java/com/yahoo/flickr/qa/config/"+platform.propertyFile);
        prop.load(propertyFile);
    }

    public DesiredCapabilities buildCapabilities(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        for(Entry<Object, Object> property : prop.entrySet()){
            capabilities.setCapability(property.getKey().toString(), property.getValue().toString());
        }
        return capabilities;
    }

    public enum DevicePlatform{
        ANDROID(ANDROID_PROPERTIES),
        IOS(IOS_PROPERTIES);
        private String propertyFile;

        private DevicePlatform(String propertyFile) {
            this.propertyFile = propertyFile;
        }
    }

    public static URL getServerURL() throws Exception{
        prop=new Properties();
        InputStream propertyFile = new FileInputStream("src/main/java/com/yahoo/flickr/qa/config/environment.properties");
        prop.load(propertyFile);
        return new URL("http://"+prop.getProperty("BASE_URL")+":"+prop.getProperty("PORT_NO")+"/wd/hub");
    }

    public static AppiumDriver getDriver(){
        try{
            driver=new IOSDriver(getServerURL(),new AbstractDriver(DevicePlatform.IOS).buildCapabilities());
        }catch (Exception e){
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        return driver;
    }

}
