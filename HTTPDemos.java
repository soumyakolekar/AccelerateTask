package HTTPdemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HTTPDemos {
@Test
public void demo() {
	RestAssured.baseURI="https://reqres.in/api/users?";
//	RestAssured.given().param("page", "2")
//	.when()
//	.get()
//	.then()
//	.assertThat()
//	.log()
//	.all()
//	.statusCode(200);
	
	Response response=RestAssured.given().param("page","2").get();
	//	System.out.println(response.getBody().asString());	
System.out.println("res===="+response.getStatusCode());
System.out.println("content type===="+response.contentType());
System.out.println("time===="+response.time());
System.out.println("formatted===="+response.prettyPrint());

}
}
