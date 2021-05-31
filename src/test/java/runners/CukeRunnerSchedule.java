package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
   //    tags = "temp",
        features = "src/test/resources/features",
        glue = "stepDefs",
     dryRun = true,
      stepNotifications = true,// show us all details step by step
        plugin = { "summary",  // All about reports
                   "pretty",
                   "html:target/html-report.html",
                   "json:target/Cucumber.json"
//        "rerun:target/failed-scenarios.txt"
        }
)
public class CukeRunnerSchedule {



}
