package com.operative.base;

import java.io.File;
import com.operative.utils.Log;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.zaproxy.clientapi.core.ApiResponse;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver;
	static ClientApi clientApi;
	static Proxy proxy;
	static ApiResponse apiResponse;
	static final String zapAddress = "127.0.0.1";
	static final int zapPort = 8080;
	static final String apiKey = "rgfc8d5jhbmlsdvqs6qvp0imp9";
	public Properties prop;
	WebDriverWait wait;
	
	
	//login locators
	By username=By.id("idToken1");
	By password=By.id("idToken2");
	By loginButton=By.id("loginButton_0");
	
	 public BaseTest() {
	        clientApi = new ClientApi(zapAddress, zapPort, apiKey);
	        proxy = new Proxy().setSslProxy(zapAddress + ":" + zapPort).setHttpProxy(zapAddress + ":" + zapPort);
	    }

	    public WebDriver IntializeBrowser() {
	        if (driver == null) {
	            try {
	                prop = new Properties();
	                File file = new File("C:\\project_perf\\SecurityTesting\\propertyFiles\\Automation.properties");
	                FileInputStream fin = new FileInputStream(file);
	                prop.load(fin);

	                String browser = prop.getProperty("Browser");
	                if (browser.equalsIgnoreCase("Chrome")) {
	                    ChromeOptions option = new ChromeOptions();
	                    option.setProxy(proxy);
	                    option.addArguments("incognito");
	                   // option.addArguments("--headless");
	                    option.setAcceptInsecureCerts(true);
	                   // WebDriverManager.chromedriver().setup();
	                    driver = new ChromeDriver(option);
	                    driver.manage().window().maximize();
	                } else if (browser.equalsIgnoreCase("firefox")) {
	                    FirefoxOptions options = new FirefoxOptions();
	                    options.setProxy(proxy);
	                    options.setAcceptInsecureCerts(true);
	                    WebDriverManager.firefoxdriver().setup();
	                    driver = new FirefoxDriver(options);
	                    driver.manage().window().maximize();
	                } else {
	                    throw new RuntimeException("Unsupported browser: " + browser);
	                }
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }
	        return driver;
	    }
	
//	public void GenerateReport()
//	{
//		try {
//			if (clientApi != null) {
//				Log.info("Generating consolidated ZAP HTML Report...");
//				
//				byte[] report = clientApi.core.htmlreport();
//				try (java.io.FileOutputStream fos = new java.io.FileOutputStream("zap-consolidated-report.html")) {
//					fos.write(report);
//					Log.info("Consolidated ZAP HTML Report generated: zap-consolidated-report.html");
//					
//				} catch (java.io.IOException e) {
//					System.err.println("Error writing consolidated report: " + e.getMessage());
//					e.printStackTrace();
//				}
//			} else {
//				System.err.println("ZAP API is not initialized. Skipping report generation.");
//			}
//		} catch (Exception e) {
//			System.err.println("Error during teardown: " + e.getMessage());
//			e.printStackTrace();
//		}
//	}
//	
	public void LaunchApplication()
	{
		try
		{
			String Module = prop.getProperty("URL");
			String url=("https://aos-dev.operativeone.com/"+Module+"/");
			if (url != null) {
			    driver.get(url); 
			}
			
			Log.info(">>>>>> Launching the Application with the url..."  +url);
			System.out.println();
			Thread.sleep(20000);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public void Login()
	{
		try
		{
			String userName=prop.getProperty("username");
			String Password=prop.getProperty("password");
			
			VisibuilityOfWebElement(username);
			driver.findElement(username).sendKeys(userName);
			VisibuilityOfWebElement(password);
			driver.findElement(password).sendKeys(Password);
			ElementClickableWait(loginButton);
			driver.findElement(loginButton).click();
			Thread.sleep(40000);
			
			/**
			final WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idToken1")));
			username.sendKeys(userName);

			WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("idToken2")));
			password.sendKeys(Password);

			WebElement login = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginButton_0")));
			login.click();*/
			Log.info(">>>>> Clicked on Login Button");
			
			
			/**WebElement loadicon=driver.findElement(By.xpath("//span[@class='icon-loader'][1]"));
			if(loadicon.isDisplayed())
			{
				//wait.until(ExpectedConditions.invisibilityOf(loadicon));
				
				//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='SintecMedia, NYC, Inc. D/B/A Operative.']")));
				System.out.println("Login successful.");
				
			}
*/
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	public void VisibuilityOfWebElement(By element)
	
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		
	}
	
	public void ElementClickableWait(By element)
	{
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	public void generateAndSaveZAPReport(ITestResult result) {
        try {
            String reportName = "zap-reports/" + result.getMethod().getMethodName() + "-zap-report.html";
            byte[] reportBytes = clientApi.core.htmlreport();
            File reportFolder = new File("zap-reports");
            if (!reportFolder.exists()) reportFolder.mkdirs();
            try (FileOutputStream fos = new FileOutputStream(reportName)) {
                fos.write(reportBytes);
                Reporter.log("ZAP report saved: " + reportName);
            } catch (IOException e) {
                e.printStackTrace();
                Reporter.log("Error saving ZAP report: " + e.getMessage());
            }
        } catch (Exception e) {
            e.printStackTrace();
            Reporter.log("Error generating ZAP report: " + e.getMessage());
        }
        
    }
	
	
	public File generateAndSaveZAPReport1(ITestResult result) {
	    File reportFile = null;
	    try {
	        String reportName = "zap-reports/" + result.getMethod().getMethodName() + "-zap-report.html";
	        byte[] reportBytes = clientApi.core.htmlreport();
	        File reportFolder = new File("zap-reports");
	        if (!reportFolder.exists()) reportFolder.mkdirs();
	        reportFile = new File(reportName);
	        
	        try (FileOutputStream fos = new FileOutputStream(reportFile)) {
	            fos.write(reportBytes);
	            Reporter.log("ZAP report saved: " + reportFile.getAbsolutePath());
	        } catch (IOException e) {
	            e.printStackTrace();
	            Reporter.log("Error saving ZAP report: " + e.getMessage());
	            return null;  // Return null if there's an error
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        Reporter.log("Error generating ZAP report: " + e.getMessage());
	        return null;  // Return null if there's an exception
	    }
	    
	    return reportFile;  // Return the File object on success
	}



    public void GenerateReport() {
        try {
            if (clientApi != null) {
                Log.info("Generating consolidated ZAP HTML Report...");
              
                byte[] report = clientApi.core.htmlreport();

                File reportFile = new File(System.getProperty("user.dir") + "/zap-consolidated-report.html");

                try (FileOutputStream fos = new FileOutputStream(reportFile)) {
                    fos.write(report);
                    Log.info("Consolidated ZAP HTML Report generated: " + reportFile.getAbsolutePath());
                } catch (IOException e) {
                    Log.error("Error writing consolidated ZAP report: " + e.getMessage());
                    e.printStackTrace();
                }
            } else {
                Log.error("ZAP API is not initialized. Skipping report generation.");
            }
        } catch (Exception e) {
            Log.error("Error during report generation: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public  static String getScreenShot(String testCaseName,WebDriver driver) throws IOException
	{
		File soource = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		File file=new File(System.getProperty("user.dir")+"//Test output//screenshot//"+testCaseName+".png");
		FileUtils.copyFile(soource, file);
		return System.getProperty("user.dir")+"//Test output//screenshot//"+testCaseName+".png";

	}
	
	
	

}
