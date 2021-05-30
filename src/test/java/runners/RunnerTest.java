package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefs", // package name
        //tags = "@ek",
        dryRun = true,
        stepNotifications = true,
        plugin = {"summary",  // generates  a detailed report after each run and also generates snippets for unimplemented steps
                "pretty",  // adds more details to a console output
                "html:target/html-report.html", // generates cucumber's built in html report in indicated path
                "json:target/Cucumber.json",     // generate json report in target folder
                "rerun:target/failed-scenarios.txt"
        }

)
public class RunnerTest {
}
