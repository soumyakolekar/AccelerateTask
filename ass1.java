package Steps;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.cucumber.gherkin.internal.com.eclipsesource.json.JsonObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class ass1 {
	@Test
@Given("API for foreign exchange")
public void api_for_foreign_exchange() {
    // Write code here that turns the phrase above into concrete actions
		String api="https://reqres.in/api/users";
	System.out.println("open");
}
@Test
@When("posted with correct Information")
public void posted_with_correct_information() {
	RestAssured.baseURI="https://reqres.in/api/users";
	String json="{\r\n"+ "    \"name\": \"morpheus\",\r\n"+ "    \"job\": \"leader\"\r\n"+ "}";
	
	 Response response1 = RestAssured.given().body(json)
             .when()
             .post("/posts")
             .then()
             .extract().response();

	  
	

}
@Test
@Then("validate positive response code received")
public void validate_positive_response_code_received() {
	RestAssured.baseURI="https://reqres.in/api/users";
	String json="{\r\n"+ "    \"name\": \"morpheus\",\r\n"+ "    \"job\": \"leader\"\r\n"+ "}";
	
	 Response response1 = RestAssured.given().body(json)
             .when()
             .post("/posts")
             .then()
             .extract().response();
	System.out.println("Response body is:" +response1.statusCode());
	Assert.assertEquals(201,response1.statusCode());
}}



