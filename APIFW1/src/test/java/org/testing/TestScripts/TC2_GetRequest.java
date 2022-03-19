package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;


import org.testing.ResponseValidation.ValidateResponse;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC2_GetRequest 
{

	@Test
	public void TC2() throws IOException
	{
		
		Properties p = LoadPropertiesFile.handlePropertyFile("../APIFW/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res =http.GetMethod("QA_URI_Managers", TC1_PostRequest.RespIdValue);
		System.out.println("**************Testcase 2************");
		System.out.println("Status code is "+res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());
		
		//Assert.assertTrue(ValidateResponse.statusCodeValidate(200, res));
		//Assert.assertTrue(ValidateResponse.dataValidate("Nihil", res, "firstaname"));
		
	}
}
