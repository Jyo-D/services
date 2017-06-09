package Utility;


import static com.jayway.restassured.RestAssured.given;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.codec.binary.Base64;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import com.jayway.restassured.builder.RequestSpecBuilder;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Header;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

import Test_Case.GetAll;
import Test_Case.GetData;
import UTILEXC.*;

public class GetClass {
             
	public static Response  response;
	public static String APIUrl;
        
	    	//candidate-get.md
	    	
	        public static void GET() throws Exception {
	        	
	        	String authCookie = ("jyoti.dubey@incture.com" + ":" + "jyoti@123");
		    	String authCookieEncoded =
		    	new String(Base64.encodeBase64(authCookie.getBytes()));
	    		
	    		RequestSpecBuilder builder = new RequestSpecBuilder();
	    		builder.setContentType("application/json; charset=UTF-8");
	    		
	    		RequestSpecification requestSpec = builder.build();
	    		System.out.println("--------------------------------------------->"+PostClass.actualValue1);
	    	  response = given().header("Authorization", "Basic " + authCookieEncoded).headers(GetAll.map).
	    		when().get(APIUrl).prettyPeek();
	    		
	        }
	        
 public static void GET(String path,String val) throws Exception {
	        	
	        	String authCookie = ("jyoti.dubey@incture.com" + ":" + "Incture@123");
		    	String authCookieEncoded =
		    	new String(Base64.encodeBase64(authCookie.getBytes()));
	    		
	    		RequestSpecBuilder builder = new RequestSpecBuilder();
	    		builder.setContentType("application/json; charset=UTF-8");
	    		
	    		RequestSpecification requestSpec = builder.build();
	    		System.out.println("--------------------------------------------->"+PostClass.actualValue1);
	    	  response = given().pathParam(path, val).header("Authorization", "Basic " + authCookieEncoded).headers(GetData.map).
	    		when().get(APIUrl).prettyPeek();
	    		
	        }


 public static void GET_query(String query,String val) throws Exception {
 	
 	String authCookie = ("jyoti.dubey@incture.com" + ":" + "jyoti@123");
 	String authCookieEncoded =
 	new String(Base64.encodeBase64(authCookie.getBytes()));
		
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setContentType("application/json; charset=UTF-8");
		
		RequestSpecification requestSpec = builder.build();
		System.out.println("--------------------------------------------->"+PostClass.actualValue1);
	  response = given().queryParam(query, val).header("Authorization", "Basic " + authCookieEncoded).headers(GetAll.map).
		when().get(APIUrl).prettyPeek();
		
 }


}
	    		
//	    		map.put("x-email-id", "balakrishnan@britindia.com");
		    	//	map.put("x-access-token","eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE0OTQ1ODE5ODA1Mjh9.-GKkoVYsAd_LC2-FBcFIEWgII1BhOJT4sTo1FfiBypM");
	    		//Response obj=given().headers(TS1.map).when().get(TS1.APIUrl);
	    		
	    		
	    		//JasonHandler.JArrayContaint(response, "data", "_id");
	    		
	    		
	    		
	    		
	    		
	    	
	    		//Response  response = given().header("x-access-token",PostClass.actualValue1).header("x-email-id", "balakrishnan@britindia.com").header("organisation", "britannia").
				
	    	
	        
	    
		

