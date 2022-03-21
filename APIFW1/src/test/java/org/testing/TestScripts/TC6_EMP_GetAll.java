package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC6_EMP_GetAll 
{
	@Test
	public void TC6() throws IOException
	{
		
		Properties p = LoadPropertiesFile.handlePropertyFile("../APIFW1/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.GetMethod("QA_URI_EMPLOYEE", 10, 1001);
		System.out.println("***********Testcase 6************");
		System.out.println("Status code is");
		System.out.println(res.statusCode());
		JsonParsingUsingOrgJson.parseAllIds(res.asString(), "id");
		
     }

}
