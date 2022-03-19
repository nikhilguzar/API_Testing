package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.JsonVariableReplacement;
import org.testing.utilities.LoadJsonFile;
import org.testing.utilities.LoadPropertiesFile;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC4_PutRequest 
{

    @Test
	public void TC4() throws IOException
	{
		Properties p = LoadPropertiesFile.handlePropertyFile("../APIFW/URI.properties");
		String body = LoadJsonFile.handleJson("../APIFW/src/test/java/org/testing/resources/updateBodyData.json");
		body =JsonVariableReplacement.jsonReplace(body, "id",TC1_PostRequest.RespIdValue );
		
		HTTPMethods http = new HTTPMethods(p);
		Response res = http.PutRequest(body,"QA_URI_Managers",TC1_PostRequest.RespIdValue);
		System.out.println("**************Testcase 4************");
		System.out.println("Status code is "+res.statusCode());
		System.out.println("Updated Body data is ");
		System.out.println(res.asString());
	}
}
