package stepdefination;

import io.cucumber.java.ParameterType;
import io.cucumber.java.en.*;
import objects.Product;

public class addToCartStepDefParameterType {
	
	@ParameterType(".*")
	public Product product(String name)
	{
		return new Product(name);
	}

	@Given("I am on strore page")
	public void i_am_on_strore_page() {
	   System.out.println("In Given Method...");
	}
	
	@When("I add {string}  in cart")
	public void i_add_in_cart(String product) {
	    System.out.println("In When Method...");
	//    System.out.println("Product Name:"+product.getName());
	}
	
	
/*	@When("I add {product}  in cart")
	public void i_add_in_cart(Product product) {
	    System.out.println("In When Method...");
	    System.out.println("Product Name:"+product.getName());
	}*/
	
	@Then("I see {int} quantity in cart")
	public void i_see_quantity_in_cart(Integer int1) {
	   System.out.println("In Then Method...");
	}
	@Then("Successfully added to cart message")
	public void successfully_added_to_cart_message() {
	   System.out.println("In And Method..");
	}
	
}
