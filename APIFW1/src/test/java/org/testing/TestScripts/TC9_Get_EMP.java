package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC9_Get_EMP 
{

	@Test
	public void TC9() throws IOException
	{
		
		Properties p = LoadPropertiesFile.handlePropertyFile("../APIFW/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res =http.GetMethod("QA_URI_EMP_GET","1");
		System.out.println("**************Testcase 9************");
		System.out.println("Status code is "+res.statusCode());
		System.out.println("Response data is ");
		System.out.println(res.asString());

     }
}
