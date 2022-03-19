package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonParsingUsingOrgJson;
import org.testing.utilities.LoadPropertiesFile;

import io.restassured.response.Response;

public class TC8_GetAll_EMP 
{
	
	public void TC8() throws IOException
	{
		
		Properties p = LoadPropertiesFile.handlePropertyFile("../APIFW/URI.properties");
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.GetAllMethod("QA_URI_EMP_GET_ALL");
		System.out.println("***********Testcase 8************");
		System.out.println("Status code is");
		System.out.println(res.statusCode());
		JsonParsingUsingOrgJson.parseAllIds(res.asString(), "id");
		
     }

}
