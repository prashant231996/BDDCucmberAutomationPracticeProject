package stepdefination;

import io.cucumber.java.en.*;

public class addToCartStepDef {
	
	@Given("I am on Store Page")
	public void i_am_on_store_page() {
		System.out.println("In Given method.");
	    
	}

	@When("I add a {string} in cart")
	public void i_add_a_in_cart(String string) {
	  System.out.println("In When method.");
	}

	@Then("I see {int} Blue Shoes in Cart")
	public void i_see_blue_shoes_in_cart(Integer int1) {
	   System.out.println("In Then method..");
	}

	@Then("I see successfull message on screen.")
	public void i_see_successfull_message_on_screen() {
	    
	}

	@Given("I am on Product Page")
	public void i_am_on_product_page() {
	   
	}

	@Given("I am on Product Page\\/Store Page")
	public void i_am_on_product_page_store_page() {
	    
	}

	@When("I enter {int} in quantity field")
	public void i_enter_in_quantity_field(Integer int1) {
	    
	}

	@Then("Erro message should be displayed as {string}")
	public void erro_message_should_be_displayed_as(String string) {
	    
	}

	@When("I press up arrow of quantity")
	public void i_press_up_arrow_of_quantity() {
	    
	}

	@Then("quantity should increase")
	public void quantity_should_increase() {
	    
	}

	@When("I press down arrow of quantity")
	public void i_press_down_arrow_of_quantity() {
	    
	}

	@Then("quantity should decrease")
	public void quantity_should_decrease() {
	    
	}
}
