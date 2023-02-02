import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		glue= {"stepdefination"},
		features={"src/main/java/feature/addToCartAutoSecond.feature"}
		
		)
public class TestRunnerAutoSecond extends AbstractTestNGCucumberTests{

}
