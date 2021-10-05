package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps {
	
	@Given("user is on login")
	public void user_is_on_login() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
	    System.out.println("enter login");
	}

	@When("user enters username and passsword")
	public void user_enters_username_and_passsword() {
	    // Write code here that turns the phrase above into concrete actions
	 //   throw new io.cucumber.java.PendingException();
	    System.out.println("enter username and password");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	    System.out.println("click login");
	}

	@Then("user is navigated")
	public void user_is_navigated() {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	    System.out.println("navigate");
	}
}
