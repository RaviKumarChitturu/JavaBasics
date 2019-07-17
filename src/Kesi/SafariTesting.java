package Kesi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SafariTesting {

	public static WebDriver driver;

	@BeforeClass
	public void setUp() throws Exception {
		//driver = new FirefoxDriver();
		driver = new SafariDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void login() throws Exception   {
		
		driver.get("http://qa.xtbills.com");
		
		driver.findElement(By.id("TxtEmail")).sendKeys("adm1.suite4@gmail.com");
	
		driver.findElement(By.id("TxtPassword")).sendKeys("xeno@123");
	
		driver.findElement(By.id("BtnLogin")).click();
		Thread.sleep(5000);
		//driver.findElement(By.id("cpBody_divqlbillsearch")).click();
		//driver.findElement(By.id("cpBody_divqlvendormanagement")).click();
		
	/*	WebElement element = driver.findElement(By.xpath(".//*[@id='menu_aSearchPayments']"));
		
		System.out.println("The Value of mouse"+element);
		 
        Actions action = new Actions(driver);
 
        action.moveToElement(element).moveToElement(driver.findElement(By.id(".//*[@id='menu_aSearchPayment']"))).click().build().perform();
		
		*/
		Thread.sleep(5000);
		///driver.findElement(By.id("cpBody_aSearchVendor")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.id("menu_aDashboard")).click();
		System.out.println("Complted");
		
		
		
		//.//*[@id='tabwrap']/div/div[3]
		//menu_aBillPaymentsReport
		//Thread.sleep(5000);
		
	}

	@AfterClass
	public void tearDown() throws Exception {
		driver.quit();
	}
}
