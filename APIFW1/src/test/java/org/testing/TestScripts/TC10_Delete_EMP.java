package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC10_Delete_EMP 
{

	@Test
	public void TC10() throws IOException
	{
		Properties p = LoadPropertiesFile.handlePropertyFile("../APIFW1/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res =http.DeleteMethod("QA_URI_EMP_DEL","1");
		System.out.println("**************Testcase 10************");
		System.out.println("Status code is "+res.statusCode());
		
	}
}
