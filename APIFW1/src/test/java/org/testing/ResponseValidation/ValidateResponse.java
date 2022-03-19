package org.testing.ResponseValidation;

import org.testing.utilities.JsonParsingUsingOrgJson;


import io.restassured.response.Response;


public class ValidateResponse 
{

	public static Boolean statusCodeValidate(int ExpectedStatusCode ,Response res)
	{
		
		//Assert.assertEquals(res.statusCode(), ExpectedStatusCode , "status code is not matching");
		
		if(ExpectedStatusCode == res.statusCode())
		{
			System.out.println("Status code is matching");
			return true;
			
		}
		
		else 
		{
			System.out.println("Status code is not matching");
			return false;
		}
	}
	
	
	public static Boolean dataValidate(String ExpectedData , Response res,String KeyName)
	{
		
		String actualData = JsonParsingUsingOrgJson.parseJson(res.asString(), KeyName);
		
		if(actualData.equals(ExpectedData))
		{
			System.out.println("Data is matching");
			return true;
		}
			
		else 
		{
			System.out.println("Data is not matching");
			return false;
			
		}
	}
}
