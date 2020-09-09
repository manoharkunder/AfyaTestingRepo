package com.niveus;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {

	   public String  getPropertyKeyValue(String key)
	   {
		   FileInputStream ip=null;
			 Properties pro=null;
		   try {
			 ip=new FileInputStream("./src/com/niveus/Afya/testdata/commandata.properties");		 
			 pro=new Properties();
			 pro.load(ip);

		   } 
		   catch (Exception e) 
		   {

			   e.printStackTrace();
		   }
	    return  pro.getProperty(key);	 
		   }
	   /*
	    This method is used to get the from exel
	   */
	   public String getExcelData( String path,String sheetName, int rowNum, int cellNum)
		{
			FileInputStream ip = null;
			Workbook wb = null;
			try
			{
				ip = new FileInputStream(path);
				wb = WorkbookFactory.create(ip);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}


			 Sheet sh = wb.getSheet(sheetName);
			 Cell c = sh.getRow(rowNum).getCell(cellNum);
			 CellType cType = c.getCellType();

			if(cType.toString().equals("NUMERIC"))
			{
				int data = (int)c.getNumericCellValue();
				return String.valueOf(data);
			}
			else
			{
				String data = c.getStringCellValue();
				return data;
			}
		}

}
