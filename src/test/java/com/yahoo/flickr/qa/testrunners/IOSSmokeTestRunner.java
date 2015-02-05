package com.yahoo.flickr.qa.testrunners;

import com.yahoo.flickr.qa.utils.AbstractTestRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
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
