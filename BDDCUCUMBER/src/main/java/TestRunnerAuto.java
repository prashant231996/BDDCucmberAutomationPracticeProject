import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin= {"pretty","html:target/cucumber.html"},
		dryRun=false,
		monochrome = true,
		tags = "@ScenarioAddToCart",
		glue = {},
		features = {"src/main/java/feature/addToCartAuto.feature"}
		)
public class TestRunnerAuto extends AbstractTestNGCucumberTests{

}
