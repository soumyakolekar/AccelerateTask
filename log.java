package log;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.specification.ResponseSpecification;

public class log {

	
	@Test
	public void getUserdetailsStatusCodeData() {
		
		RestAssured.baseURI="https://reqres.in";
		ResponseSpecification response= RestAssured.given().when().log().ifValidationFails().then().statusCode(202);
		System.out.println("response is"+response.statusCode(202));
		

	
	}
}