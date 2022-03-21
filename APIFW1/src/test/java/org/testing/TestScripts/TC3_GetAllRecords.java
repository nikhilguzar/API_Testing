package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC3_GetAllRecords 
{

	@Test
	public void TC3() throws IOException
	{
		
		Properties p = LoadPropertiesFile.handlePropertyFile("../APIFW1/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.GetAllMethod("QA_URI_Managers");
		System.out.println("***********Testcase 3************");
		System.out.println("Status code is");
		System.out.println(res.statusCode());
		JsonParsingUsingOrgJson.parseAllIds(res.asString(), "id");
		
     }
}
