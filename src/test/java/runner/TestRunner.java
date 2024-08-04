package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"src/test/java/features"},
        glue={"utility","stepDefs"},
        plugin={"json:target/cucumber.json", "html:target/cucumber-reports"}
)
public class TestRunner {
}
