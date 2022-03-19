package org.testing.utilities;

import java.util.regex.Pattern;



public class JsonVariableReplacement 
{

	public static String jsonReplace(String Data,String varName,String varValue)
	{
		
		Data = Data.replaceAll(Pattern.quote("{{"+varName+"}}"), varValue);
	
		return Data;
		
	}
}
