package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"}
        ,features = "src\\test\\java\\Features"
        ,glue={"Definitions"}
)

public class RunTests {

}