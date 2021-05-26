package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        features = "src/test/resources/features",
        glue = "stepDefs",
        stepNotifications = true,
        plugin = {"summary",
                "pretty",
                "html:target/html-report.html",
                "json:target/Cucumber.json",
                "rerun:target/failed-scenarios.txt"
        }


)


public class CukeRunner {


}
