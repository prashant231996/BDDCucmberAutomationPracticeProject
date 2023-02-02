package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class addToCartAutoSecondStepDef {

	public WebDriver driver;
	
	@Given("I am guest customer")
	public void i_am_guest_customer() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://askomdch.com/store/"); 
	}

	@Given("I have product in cart")
	public void i_have_product_in_cart() throws InterruptedException {
	   By addToCartBtn=By.cssSelector("a[aria-label='Add “Anchor Bracelet” to your cart']");
	   driver.findElement(addToCartBtn).click();
	   Thread.sleep(3000);
	   By viewCartLink=By.linkText("View cart");
	   driver.findElement(viewCartLink).click();
	}

	@Given("I am on the checkout page")
	public void i_am_on_the_checkout_page() {
	   By checkOutBtn=By.cssSelector(".checkout-button ");
	   driver.findElement(checkOutBtn).click();
	}

	@When("I provide billing details")
	public void i_provide_billing_details() {
	  By firstName=By.id("billing_first_name");
	  By lastName=By.id("billing_last_name");
	  By countryDropDown=By.id("billing_country");
	  By streetName=By.id("billing_address_1");
	  By town=By.id("billing_city");
	  By stateDropDown=By.id("select2-billing_state-container");
	  By zipCode=By.id("billing_postcode");
	  By email=By.id("billing_email");
	 
	  driver.findElement(firstName).clear();
	  driver.findElement(firstName).sendKeys("Prashant");
	  driver.findElement(lastName).clear();
	  driver.findElement(lastName).sendKeys("More");
	  Select countrySelect=new Select(driver.findElement(countryDropDown));
	  countrySelect.selectByVisibleText("United Arab Emirates");
	  driver.findElement(streetName).clear();
	  driver.findElement(streetName).sendKeys("Ichalkaranji");
	  driver.findElement(town).clear();
	  driver.findElement(town).sendKeys("Pune");
	  driver.findElement(email).clear();
	  driver.findElement(email).sendKeys("abc@testing.com");
	  
	}

	@When("I place an order")
	public void i_place_an_order() {
		 By placeOrderBtn=By.id("place_order");
		 driver.findElement(placeOrderBtn).click();
	}

	@Then("The order should be placed successfully")
	public void the_order_should_be_placed_successfully() throws InterruptedException {
		Thread.sleep(5000);
	    By sucMsg=By.xpath("//p[text()='Thank you. Your order has been received.']");
	    String actualMsg=driver.findElement(sucMsg).getText();
	    Assert.assertEquals(actualMsg, "Thank you. Your order has been received.");
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
