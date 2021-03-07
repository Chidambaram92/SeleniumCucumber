package runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue="step_definition",
		//strict = false,
		plugin="html:target/cucumber-html-report"
		)

public class Scriptsrunner {

}
