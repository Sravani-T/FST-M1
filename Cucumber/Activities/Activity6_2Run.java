package testRunners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinitions"},
        tags = "@activity1",
        plugin = {"html:target/cucumber-reports/html-reports"}

)
public class Activity6_2Run {
    //empty
}

