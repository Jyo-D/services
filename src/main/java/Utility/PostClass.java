package Utility;

import static com.jayway.restassured.RestAssured.given;

import org.apache.commons.codec.binary.Base64;
import org.testng.annotations.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import Test_Case.Create;
import Test_Case.Update;
//import Test_Case.DynamicQ;


public class PostClass {
	
	public static String APIUrl;
	static String actualValue1;
	static String admin_token;
	public static Response  response;
	
	
	    public static void POST() {
	    	
	    	String authCookie = ("jyoti.dubey@incture.com" + ":" + "jyoti@123");
	    	String authCookieEncoded =
	    	new String(Base64.encodeBase64(authCookie.getBytes()));
		
		RequestSpecBuilder builder = new RequestSpecBuilder();
		
		builder.setBody(Create.s1);
		builder.setContentType("application/json; charset=UTF-8");
		RequestSpecification requestSpec = builder.build();
		  response = given().header("Authorization", "Basic " + authCookieEncoded).headers(Create.map)
										.spec(requestSpec).
										when().
										post(APIUrl).prettyPeek();
							
		// String actualValue = JsonPath.from(response.getBody().asString()).getString("data._id");
		// actualValue1 = JsonPath.from(response.getBody().asString()).getString("data.token");
		}
	    
 public static void POST(String path, String val) {
	    	
	    	String authCookie = ("jyoti.dubey@incture.com" + ":" + "jyoti@123");
	    	String authCookieEncoded =
	    	new String(Base64.encodeBase64(authCookie.getBytes()));
		
		RequestSpecBuilder builder = new RequestSpecBuilder();
		System.out.println("API url "+PostClass.APIUrl);
		builder.setBody(Update.s1);
		builder.setContentType("application/json; charset=UTF-8");
		RequestSpecification requestSpec = builder.build();
		  response = given().pathParam(path, val).header("Authorization", "Basic " + authCookieEncoded).headers(Create.map)
										.spec(requestSpec).
										when().
										post(APIUrl).prettyPeek();
		  
		  System.out.println(APIUrl);
							
		// String actualValue = JsonPath.from(response.getBody().asString()).getString("data._id");
		// actualValue1 = JsonPath.from(response.getBody().asString()).getString("data.token");
		}
 
 public static void POST_query(String path, String val) {
 	
 	String authCookie = ("jyoti.dubey@incture.com" + ":" + "jyoti@123");
 	String authCookieEncoded =
 	new String(Base64.encodeBase64(authCookie.getBytes()));
	
	RequestSpecBuilder builder = new RequestSpecBuilder();
	System.out.println("API url "+PostClass.APIUrl);
	//builder.setBody(DynamicQ.APIBody);
	RestAssured.urlEncodingEnabled = false;
//	builder.setContentType("application/json; charset=UTF-8");
	RequestSpecification requestSpec = builder.build();
	  response = given().pathParam(path, val).pathParam("rank","1" ).pathParam("count","1" ).header("Authorization", "Basic " + authCookieEncoded).headers(Create.map)
									.spec(requestSpec).
									when().
									post(APIUrl).prettyPeek();
	  
	  System.out.println(APIUrl);
						
	// String actualValue = JsonPath.from(response.getBody().asString()).getString("data._id");
	// actualValue1 = JsonPath.from(response.getBody().asString()).getString("data.token");
	}

}
