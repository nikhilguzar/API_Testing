package org.testing.Runner;

import java.io.IOException;

import org.testing.TestScripts.TC10_Delete_EMP;
import org.testing.TestScripts.TC1_PostRequest;
import org.testing.TestScripts.TC2_GetRequest;
import org.testing.TestScripts.TC3_GetAllRecords;
import org.testing.TestScripts.TC4_PutRequest;
import org.testing.TestScripts.TC5_DeleteRequest;
import org.testing.TestScripts.TC6_EMP_GetAll;
import org.testing.TestScripts.TC7_Post_EMP;
import org.testing.TestScripts.TC8_GetAll_EMP;
import org.testing.TestScripts.TC9_Get_EMP;

public class Runner 
{

	public static void main(String[] args) throws IOException 
	{
		
		TC1_PostRequest tc1 = new TC1_PostRequest();
		tc1.TC1();
		TC2_GetRequest tc2 =  new TC2_GetRequest();
		tc2.TC2();
		TC3_GetAllRecords tc3 = new TC3_GetAllRecords();
		tc3.TC3();
		TC4_PutRequest tc4 = new TC4_PutRequest();
		tc4.TC4();
		TC5_DeleteRequest tc5 = new TC5_DeleteRequest();
		tc5.TC5();
		TC6_EMP_GetAll tc6 = new TC6_EMP_GetAll();
		tc6.TC6();
		/*TC7_Post_EMP tc7 = new TC7_Post_EMP();
		tc7.TC7();
		TC8_GetAll_EMP tc8 = new TC8_GetAll_EMP();
		tc8.TC8();*/
		TC9_Get_EMP tc9 = new TC9_Get_EMP();
		tc9.TC9();
		TC10_Delete_EMP tc10 = new TC10_Delete_EMP();
		tc10.TC10();
		
	}
}
