package ass2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ass2step {
	@Test
	public void positive_response() {
		RestAssured.baseURI="http://api.exchangeratesapi.io/v1.latest?access_key=3b1bac69aac728d1eff6d580f81aa2ae";
		RequestSpecification httpreq=RestAssured.given();
		Response response=httpreq.get();
		System.out.println("response is"+response);
	
	}

}
