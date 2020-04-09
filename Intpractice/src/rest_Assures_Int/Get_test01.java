package rest_Assures_Int;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_test01 {

	@Test
	public void get_Weather_details()

	{
		// Request body
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httprequest = RestAssured.given();

		// Response Object
		Response response = httprequest.request(Method.GET, "/Bangalore");

		// printing response body
		String String_Response = response.getBody().asString();
		System.out.println("Response Body is---->" + String_Response);
		// getting status code
		int status_code = response.getStatusCode();
		System.out.println(status_code);
		// asserting status
		Assert.assertEquals(200, status_code);
		// printing status line
		String Status_Response = response.getStatusLine();
		System.out.println("Status response is---->" + Status_Response);
		Assert.assertEquals("HTTP/1.1 200 OK", "HTTP/1.1 200 OK");

	}

}
