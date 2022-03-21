package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.LoadJsonFile;
import org.testing.utilities.LoadPropertiesFile;


import io.restassured.response.Response;

public class TC7_Post_EMP 
{
	
	
	public  void TC7() throws IOException
	{
		
        Properties p = LoadPropertiesFile.handlePropertyFile("../APIFW1/URI.properties");  
        String body = LoadJsonFile.handleJson("../APIFW1/src/test/java/org/testing/resources/EmpPost.json");
        //body =JsonVariableReplacement.jsonReplace(body, "id", RandomNumberGeneration.generateRandom());   
        
        
		HTTPMethods http = new HTTPMethods(p);
		Response r = http.PostMethod("QA_URI_EMP_POST", body);
		System.out.println("**************Testcase 7************");
		System.out.println("Status code is" + r.statusCode());
		String Respstat =JsonParsingUsingOrgJson.parseJson(r.asString(), "status");
		//System.out.println(Respstat);
		
		if(Respstat.equals("success"))
		{
			
			System.out.println("POST Request is Successful , Status is " + Respstat);
		}
		
		else
		{
		
			System.out.println("FAILURE");
		}
		
	
	}

}
