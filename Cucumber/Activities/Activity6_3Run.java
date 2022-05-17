package testRunners;

        import io.cucumber.junit.Cucumber;
        import io.cucumber.junit.CucumberOptions;
        import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"stepDefinitions"},
        tags = "@activity1",
        plugin = {"html:target/cucumber-reports/json-reports.json"},
        monochrome = true

)
public class Activity6_3Run {
    //empty
}


