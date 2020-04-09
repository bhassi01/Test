package rest_Assures_Int;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;

//importing statically

public class Post_test01 {
	
	@Test
	public void Post_Test01()
	{
		baseURI="http://restapi.demoqa.com/customer";
		JSONObject requestparameter= new JSONObject();
		requestparameter.put("FirstName","tester");
		requestparameter.put("LastName","01");
		requestparameter.put("UserName","test");
		requestparameter.put("Password","test01");
		requestparameter.put("Email","test01@gmail.com");
		
		
		
	Response response= given().header("Content-Type","application/json").body(requestparameter.toJSONString())
	.when().post("/register").thenReturn();
	//log().all();
	System.out.println( response.getStatusCode());
	System.out.println(response.getBody().asString());
	System.out.println(response.getStatusLine());
	
	
		
		
		
	}

	

}
