package org.testing.utilities;

import org.json.JSONObject;
import org.json.XML;

public class Conversion 
{

	public static String xmltoJson(String xmlData)
	{
		
		JSONObject js = XML.toJSONObject(xmlData);
		
		return js.toString();
	}
	
	public static String  jsontoXml(String JsonData)
	{
		
		JSONObject obj = new JSONObject(JsonData);
		
		String xml_Data = XML.toString(obj);
		
		return xml_Data;
		
	}
	
}
