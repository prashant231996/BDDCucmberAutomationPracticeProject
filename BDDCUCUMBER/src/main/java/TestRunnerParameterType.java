import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin= {"pretty","html:target/cucumber.html"},
		dryRun=false,
		monochrome = true,
	    glue = {"stepdefination","cucumberhooks"},
		features = {"src/main/java/feature/addToCartParameterType.feature"}
		)
public class TestRunnerParameterType extends AbstractTestNGCucumberTests{

}
