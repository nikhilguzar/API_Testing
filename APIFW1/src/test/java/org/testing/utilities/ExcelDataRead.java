package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelDataRead 
{

	public static String readCell(int row ,int col) throws BiffException, IOException
	{
		File f = new File("");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet(0);
		Cell c1 = s.getCell(col, row);
		return c1.getContents();
		
	}
}
