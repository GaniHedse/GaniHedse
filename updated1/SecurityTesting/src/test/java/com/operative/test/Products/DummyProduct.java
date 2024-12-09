package com.operative.test.Products;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;
import org.zaproxy.clientapi.core.ClientApiException;

import com.operative.base.BaseTest;
import com.operative.pages.ProductsUI;

public class DummyProduct extends BaseTest {

    ProductsUI product;

    @BeforeTest
    public void Setup() throws InterruptedException {
        IntializeBrowser();
        LaunchApplication();
        Login();
    }

    @Test(priority = 1)
    public void SearchPublish() throws InterruptedException {
        product = new ProductsUI(driver);
        
        product.clickOnTemplate();
        
        product.clickOnLocalLinear();
        Thread.sleep(4000);
        product.clickOnProductStatus();
        product.selectPublishedOption();
        product.clickOnApply();
    }

    @Test(priority = 2)
    public void Sort() throws InterruptedException {
        Thread.sleep(5000);
        product.clickOnProductSort();
    }

    @AfterTest
    public void tearup() throws InterruptedException, ClientApiException {
        Thread.sleep(3000);
        GenerateReport();
        driver.quit();
    }
}
