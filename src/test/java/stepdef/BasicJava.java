package stepdef;

import cucumber.api.java.en.Given;

public class BasicJava {
	@Given("^add (\\d+) numbers$")
	public void add_numbers(int arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Adding numbers");
	}

	@Given("^substract (\\d+) numbers$")
	public void substract_numbers(int arg1)  {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Substracting numbers");
	}

	@Given("^devide (\\d+) numbers$")
	public void devide_numbers(int arg1){ 
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Devide numbers");
	}

	@Given("^multiply (\\d+) numbers$")
	public void multiply_numbers(int arg1){ 
	    // Write code here that turns the phrase above into concrete actions
	System.out.println("Multiply numbers");
	}

}