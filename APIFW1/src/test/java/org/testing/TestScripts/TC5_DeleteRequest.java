package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC5_DeleteRequest 
{

	@Test
	public void TC5() throws IOException
	{
		Properties p = LoadPropertiesFile.handlePropertyFile("../APIFW/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res =http.DeleteMethod("QA_URI_Managers", TC1_PostRequest.RespIdValue);
		System.out.println("**************Testcase 5************");
		System.out.println("Status code is "+res.statusCode());
		
	}
}
