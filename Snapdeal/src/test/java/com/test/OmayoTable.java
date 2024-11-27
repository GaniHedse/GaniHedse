package com.test;

import java.io.FileInputStream;
import java.io.IOException;
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

@Test
public class OmayoTable {
	public static WebDriver driver=null;
	@BeforeMethod
	public void LaunchApplication()
	{
		driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		
	}
	
	
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
	@Test
	public void BooksTable()
	{
		try
		{
			String filePath="C:\\bookexcel\\bookTable1.xlsx";
			FileInputStream fin=new FileInputStream(filePath);
			XSSFWorkbook workbook=new XSSFWorkbook(fin);
			XSSFSheet sheet = workbook.getSheetAt(0);
			int rowcount=sheet.getPhysicalNumberOfRows();
			for(int i=0;i<=rowcount;i++)
			{
				if(sheet.getRow(i).getCell(0).getStringCellValue().equalsIgnoreCase("ReportSubmission"))
				{
					int cellcount = sheet.getRow(i+1).getPhysicalNumberOfCells();
					for(int j=1;j<=cellcount;j++)
					{
						String value = sheet.getRow(i+2).getCell(j).getStringCellValue();
						System.out.print(value+" ");
					}
				}
			}
			
			workbook.close();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}
	public void book()
	{
		try {
		    String filePath = "C:\\bookexcel\\bookTable1.xlsx";
		    FileInputStream fin = new FileInputStream(filePath);
		    XSSFWorkbook workbook = new XSSFWorkbook(fin);
		    XSSFSheet sheet = workbook.getSheetAt(0);
		    int rowcount = sheet.getPhysicalNumberOfRows();

		    for (int i = 1; i < rowcount; i++) { // Adjusted to "< rowcount" to prevent going out of bounds
		        Row currentRow = sheet.getRow(i);
		        if (currentRow != null) {
		            Cell cell = currentRow.getCell(0);
		            if (cell != null && cell.getCellType() == CellType.STRING 
		                && cell.getStringCellValue().equalsIgnoreCase("ReportSubmission")) {

		                Row nextRow = sheet.getRow(i + 1); // Check for the next row
		                if (nextRow != null) {
		                    int cellcount = nextRow.getPhysicalNumberOfCells();
		                    Row targetRow = sheet.getRow(i + 2); // Check for the row i+2
		                    if (targetRow != null) {
		                        for (int j = 1; j < cellcount; j++) { // Adjusted to "< cellcount"
		                            Cell targetCell = targetRow.getCell(j);
		                            if (targetCell != null && targetCell.getCellType() == CellType.STRING) {
		                                String value = targetCell.getStringCellValue();
		                                System.out.print(value + " ");
		                            } else {
		                                System.out.print("Empty/Invalid Cell ");
		                            }
		                        }
		                    } else {
		                        System.out.println("Row " + (i + 2) + " is missing!");
		                    }
		                } else {
		                    System.out.println("Row " + (i + 1) + " is missing!");
		                }
		            }
		        } else {
		            System.out.println("Row " + i + " is missing!");
		        }
		    }

		    workbook.close();
		    fin.close();

		} catch (Exception e) {
		    e.printStackTrace();
		}

	}
	@Test
	public void TableData() throws IOException
	{
		String filePath="C:\\bookexcel\\bookTable1.xlsx";
		FileInputStream fin=new FileInputStream(filePath);
		XSSFWorkbook workbook=new XSSFWorkbook(fin);
		XSSFSheet sheet=workbook.getSheetAt(0);
		for(Row row:sheet)
		{
			for(Cell cell:row)
			{
				System.out.print(cell.getStringCellValue()+" ");
			}System.out.println();
		}
		
		
		
	}
	
}
