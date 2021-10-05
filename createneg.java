package demo567;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class createneg {
@Test
@Given("Set http Request")

public void set_http_request(){
	String api="http://api.exchangeratesapi.io/v1/latest?access_key=7169dac9c0fa2d550590cf3a5ea5cfac";
	
}

@When("create a  negative scenario")
@Test
public void create_a_negative_scenario() {
	RestAssured.baseURI="http://api.exchangeratesapi.io/v1/latest?access_key=7169dac9c0fa2d550590cf3a5ea5cfac";
	RequestSpecification http_request = RestAssured.given();
	Response response = http_request.request(Method.GET,"7169dac9c0fa2d550590cf3a5ea5cfac");
	response=http_request.get();
	System.out.println(response);
	
}

@Then("print the response into console")
@Test
public void print_the_response_into_console() {
	RequestSpecification http_request = RestAssured.given();
	Response response = http_request.request(Method.GET,"7169dac9c0fa2d550590cf3a5ea5cfac");
	response=http_request.get();
	System.out.println("Response body is:" +response);
	System.out.println("Negative response received");
}
}



