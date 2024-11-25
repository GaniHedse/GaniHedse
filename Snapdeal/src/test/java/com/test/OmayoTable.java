package com.test;

import java.io.FileInputStream;
import java.util.List;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tutorialsNinja.BaseTest;

public class OmayoTable {
	public static WebDriver driver=null;
	@BeforeMethod
	public void LaunchApplication()
	{
		driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
	}
	
	
	@Test
	public void Table()
	{
		List<WebElement> Rows = driver.findElements(By.xpath("//table[@id='table1']//tbody//tr"));
		for(WebElement row:Rows)
		{
			WebElement second = row.findElement(By.xpath("./td[2]"));
			if(Integer.parseInt(second.getText())<=25)
			{
				 List<WebElement> entirerow = row.findElements(By.xpath("./td"));
				 for(WebElement ele:entirerow)
				 {
					 System.out.print(ele.getText()+"  ");
				 }
				 System.out.println();
				
			}
		}
	}
	
	
	@Test
	public void ReadExcel()
	{
		try
		{
			String filePath="C:\\Users\\ganesh.hn\\Downloads\\Omayo.xlsx";
			FileInputStream fin=new FileInputStream(filePath);
			XSSFWorkbook workbook=new XSSFWorkbook(fin);
			XSSFSheet sheet=workbook.getSheetAt(0);
			for(Row row:sheet)
			{
				Cell secondCell = row.getCell(1);
				if(secondCell.getCellType()==CellType.NUMERIC && secondCell!=null)
				{
					double valuesecondCell = secondCell.getNumericCellValue();
					if(valuesecondCell<=25)
					{
						for(Cell cell:row)
						{
							switch(cell.getCellType())
							{
							case STRING: System.out.print(cell.getStringCellValue()+" ");
							break;
							case NUMERIC:System.out.print(cell.getNumericCellValue()+" ");
							break;
							
							
							}
						}
					}
					
				}
				System.out.println();
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
}
