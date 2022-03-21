package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.ValidateResponse;
import org.testing.TestSteps.HTTPMethods;

import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.LoadJsonFile;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.RandomNumberGeneration;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC1_PostRequest 
{
	
    static String RespIdValue; 
    
    @Test
	public  void TC1() throws IOException
	{
		
        Properties p = LoadPropertiesFile.handlePropertyFile("../APIFW1/URI.properties");  
        String body = LoadJsonFile.handleJson("../APIFW1/src/test/java/org/testing/resources/bodyData.json");
        body =JsonVariableReplacement.jsonReplace(body, "id", RandomNumberGeneration.generateRandom());   
        
        
		HTTPMethods http = new HTTPMethods(p);
		Response r = http.PostMethod("QA_URI_Managers", body);
		System.out.println("**************Testcase 1************");
		System.out.println("Status code is"+ r.statusCode());
		
		Assert.assertTrue(ValidateResponse.statusCodeValidate(201, r));
		
		RespIdValue = JsonParsingUsingOrgJson.parseJson(r.asString(), "id"); 
		//RespIdValue = JsonParsingUsingJsonPath.parseJson("id", r);
		/*ValidateResponse.statusCodeValidate(201, r);
		RespIdValue = JsonParsingUsingJsonPath.parseJson("id", r);*/
	}
	
}
