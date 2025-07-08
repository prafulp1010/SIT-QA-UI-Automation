package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"src/test/java/featurefiles"},
		glue= {"stepdefinitions"},
		dryRun=false,
		monochrome=true
		
		
		
		)
public class RunnerTest extends AbstractTestNGCucumberTests {

	
}
