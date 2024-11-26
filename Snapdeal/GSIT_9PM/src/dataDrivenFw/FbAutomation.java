package dataDrivenFw;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class FbAutomation {

	public static void main(String[] args) throws Exception {
		
		FileInputStream f = new FileInputStream(
				"C:\\Users\\manas.tuwani\\OneDrive - SintecMedia Ltd\\Desktop\\DataSheet.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver", s.getCell(1, 13).getContents());

		WebDriver driver = new ChromeDriver();
		driver.get(s.getCell(1, 1).getContents());
		driver.manage().window().maximize();
		Thread.sleep(1500);
		
		driver.findElement(By.id(s.getCell(1, 8).getContents())).sendKeys(s.getCell(1, 4).getContents());
		Thread.sleep(1500);
		driver.findElement(By.id(s.getCell(1, 9).getContents())).sendKeys(s.getCell(1, 5).getContents());
		
		Thread.sleep(1500);	
		driver.close();
		

	}

}
