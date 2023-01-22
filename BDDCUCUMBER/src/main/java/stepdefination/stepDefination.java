package stepdefination;

import io.cucumber.java.en.*;


public class stepDefination {
	
	@Given("I am learning Cucumber")
	public void i_am_learning_cucumber() {
	    System.out.println("I am in Given Method");
	}

	@When("I do Paractice")
	public void i_do_paractice() {
		System.out.println("I am in When method");
	   
	}

	@Then("I will understand cocepts of BDD Cucumber")
	public void i_will_understand_cocepts_of_bdd_cucumber() {
	    System.out.println("I am in Then method");
	}

}
