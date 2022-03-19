package org.testing.utilities;

import java.util.Random;

public class RandomNumberGeneration 
{

	public static String generateRandom()
	{
		
		Random r = new Random();
		Integer num = r.nextInt();
		return num.toString();
		
		
	}
}
