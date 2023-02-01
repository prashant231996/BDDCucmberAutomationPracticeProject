package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.Assert;

public class addToCartAutoStepDef {
	
	WebDriver driver;
	
	@Given("I am on store page")
	public void i_am_on_store_page() {	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://askomdch.com/store/");
	}
	
	@When("I add a {string} to cart")
	public void i_add_a_to_cart(String string) {
	   By addToCartBtn=By.xpath("//a[@aria-label='Add “Basic Blue Jeans” to your cart']");
	   driver.findElement(addToCartBtn).click();
	  }
	
	@Then("I should see {int} {string} in the cart")
	public void i_should_see_in_the_cart(Integer expectedQuantity, String expectedProductName) throws InterruptedException {
		 By viewCartLink=By.linkText("View cart");
		 //Adding stattic wait to visible view cart link
		 Thread.sleep(3000);
         driver.findElement(viewCartLink).click();
         String actualProductName=driver.findElement(By.xpath("//td[@class='product-name']/a")).getText();
         System.out.println("Product Name"+actualProductName);
         By quantity=By.xpath("//input[@type='number']");
        String quantityactual=driver.findElement(quantity).getAttribute("value");
        System.out.println("Acual Quantity="+quantityactual);
        Assert.assertEquals(actualProductName, expectedProductName);
        Assert.assertEquals(quantityactual, expectedQuantity);
	}

}
