package Genaric;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_readExcel 
{
	public static String getdata(String sheet,int row, int cell)
	{
		String value="";
		try
		{
			FileInputStream fis=new FileInputStream("./Excel/hello1.xlsx");
			
			Workbook wb = WorkbookFactory.create(fis);
			Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
		}
		
		catch(Exception e)
		{
			System.out.println("unable to fetch the data");
		}
		
		return value;
	}
	

}
