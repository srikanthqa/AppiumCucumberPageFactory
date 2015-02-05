package com.yahoo.flickr.qa.testrunners;

import com.yahoo.flickr.qa.utils.AbstractDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.appium.java_client.AppiumDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

/**
 * Created by srikanthv on 2/4/15.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/html-report", "json:target/cucumber.json"},
        features = {"src/test/java/com/yahoo/flickr/qa/resources"},
        glue = {"com.yahoo.flickr.qa.stepdefs"}
)
public class IOSSmokeTestRunner{

}
