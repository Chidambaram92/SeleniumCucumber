package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/testcases/resources/com/cucumber/features"},
		glue= {"stepdefinition","src/test/java/com/cucumber/appHooks"},
		
		format = {
				"pretty"
		},
		tags = {"@ignored"}
)
public class StepRunnerFile {

}
