package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinitions"},
        tags = "@activity1",
        plugin = {"pretty"},
        monochrome = true
        // plugin = { "html:target/cucumber-reports/reports" }
)
public class Activity6_1Run {
    //empty
}

