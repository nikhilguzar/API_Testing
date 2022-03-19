package org.testing.TestSteps;

import static  io.restassured.RestAssured.*;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HTTPMethods 
{
	Properties prObject;                                      //Reference variable
	public HTTPMethods(Properties prObject)           //Constructor to initialize the value
	{
	
		this.prObject=prObject;
	}

	public Response PostMethod(String uriKey,String bodyData)
	{
	Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.post(prObject.getProperty(uriKey));
	
		//System.out.println("Status code is");/*code for 
		//System.out.println(res.statusCode()); printing status code*/
	
	    return res;
	}
	
	
	public Response GetMethod(String uriKey,String endPoint)
	{
		
		String uri = prObject.getProperty(uriKey)+"/"+endPoint;
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(uri);
			
	return res;
		 
		
	}
	
	public Response GetMethod(String uriKey,int queryPara1,int queryPara2)
	{
		
		String uri = prObject.getProperty(uriKey)+"?"+ "noofRecords=" + queryPara1 + "&" + "idStarts=" + queryPara2;
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(uri);
			
	return res;
		 
		
	}
	
	
	public Response GetAllMethod(String uriKey)
	{
		
		String uri = prObject.getProperty(uriKey);
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(uri);
			
	return res;
		 
		
	}
	
	public Response PutRequest(String bodyData,String uriKey,String endPoint)
	{
		
		String uri = prObject.getProperty(uriKey)+"/"+endPoint;
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.body(bodyData)
				.when()
				.put(uri);
		
		return res;
		
		
	}
	
	public Response DeleteMethod(String uriKey,String endPoint)
	{
		
		String uri = prObject.getProperty(uriKey)+"/"+endPoint;
		
		Response res=
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(uri);
			
	return res;
		 
		
	}
	
}
