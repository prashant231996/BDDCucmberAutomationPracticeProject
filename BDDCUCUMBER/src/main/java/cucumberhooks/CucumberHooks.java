package cucumberhooks;

import org.apache.xmlbeans.impl.xb.xsdschema.All;

import io.cucumber.java.*;

public class CucumberHooks {
	
	@BeforeAll
	public static void beforeAll()
	{
		System.out.println("In Before All..");
	}
	
	@AfterAll
	public static void afterAll()
	{
		System.out.println("In After All...");
	}
	
	@Before("@PrameterTypeExample")
	public static void before(Scenario scenario)
	{
		System.out.println("In Before Method Which will only run for scenario tagged with @PrameterTypeExample ");
		System.out.println(scenario.getName());
		System.out.println(scenario.getSourceTagNames());
		System.out.println(scenario.getLine());
		System.out.println(scenario.isFailed());
	}
	
	@After
	public static void after()
	{
		System.out.println("In After...");
	}
	
	@Before(order=0)
	public void beforeWithOrderZero()
	{
		System.out.println("Before method with order as zero..");
	}
	
	@Before(order=1)
	public void beforeWithOrderOne()
	{
		System.out.println("Before method with order as one..");
	}
	
	@After(order=0)
	public void afterWithOrderZero()
	{
		System.out.println("After method with order as zero..");
	}
	
	@After(order=1)
	public void afterWithOrderOne()
	{
		System.out.println("After method with order as one..");
	}
	
	@BeforeStep
	public void beforeStep()
	{
		System.out.println("This method will excecute before each step mentioned in scenario..");
	}
	
	@AfterStep
	public void afterStep()
	{
		System.out.println("This method will excecute after each step def. mentioned in scenario..");
	}

}
