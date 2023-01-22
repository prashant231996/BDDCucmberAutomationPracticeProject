import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		plugin= {"pretty","html:target/cucumber.html"},
		dryRun=false,
		monochrome = true,
		tags = "@scenario1",
		glue = {"stepdefination","src/main/java/CucumberHooks"},
		features = {"src/main/java/feature"}
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
