package org.testing.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadXml 
{

	public static String xml(String path) throws IOException
	{
		
		File f = new File(path);
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		String data = null;
		String s;
		
		while((s=b.readLine())!=null)
		{
			data = data + s;
		}
		return data;
	}
}
