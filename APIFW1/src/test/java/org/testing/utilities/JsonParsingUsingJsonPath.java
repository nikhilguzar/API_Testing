package org.testing.utilities;

import io.restassured.response.Response;

public class JsonParsingUsingJsonPath 
{

	public static String parseJson(String JsonPath, Response res)
	{
		
		return res.jsonPath().get(JsonPath);
	}
}
