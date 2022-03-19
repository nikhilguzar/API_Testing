package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonParsingUsingOrgJson 
{

	public static String parseJson(String data,String Keyname)
	{
		
		JSONObject	ob = new JSONObject(data);
		 return ob.get(Keyname).toString();
		
	}
	
	public static void parseAllIds(String data,String KeyName)//For getall method to get all id's of Testcase 3
	{
		
		JSONArray a = new JSONArray(data);
		int len = a.length();
		
		for(int i=0;i<len;i++)
		{
			
			JSONObject obj = a.getJSONObject(i);
			System.out.println(obj.get(KeyName));
			
		}
		
	}
}
