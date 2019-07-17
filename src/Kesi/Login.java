package Kesi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Login {
	public WebDriver driver;
	
	//public String baseUrl;
	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		//driver = new SafariDriver();
		driver = new FirefoxDriver();
		//baseUrl = "http://google.com/";
	}



	@Test
	public void f() throws Exception  {

		driver.get("http://qa.circulus.io/login.aspx");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath(".//*[@id='ahrefFPWD']")).click();
		
		//driver.findElement(By.xpath(".//*[@id='btnreset']")).sendKeys(Keys.RETURN);
		//driver.findElement(By.xpath(".//*[@id='Btncancel']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath(".//*[@id='divLogo']/h3/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='btnRegisterNow']")).sendKeys(Keys.ENTER);
		
		
		
		
		//driver.findElement(By.xpath("//body")).sendKeys(Keys.RETURN);
		Thread.sleep(5000);
		/*driver.findElement(By.id("TxtEmail")).sendKeys("payments.circulus@gmail.com");
		driver.findElement(By.id("TxtPassword")).sendKeys("xeno@123");
		driver.findElement(By.id("BtnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("cpBody_divqlbillsearch")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='cpBody_divmenusec']/a/i")).click();
		driver.findElement(By.id("cpBody_lbtnBillsVcs")).click();
		Thread.sleep(3000);*/
		
		//driver.findElement(By.xpath(".//*[@id='menu_aLogoWithOutName']/img")).click();
		
		//driver.findElement(By.xpath(".//*[@id='cpBody_divqlbillpayments']")).click();
		//driver.findElement(By.id("cpBody_GVSearchBills_lbDynamicPager")).click();
		//new Select(driver.findElement(By.xpath(".//*[@id='cpBody_divqlbillpayments']"))).selectByValue("300");
		//driver.findElement(By.id("cpBody_GVSearchBills_lbDynamicPager")).click();
		//driver.findElement(By.id("/select[@id='cpBody_GVSearchBills_lbDynamicPager']/option[5]")).click();
		
		/*driver.findElement(By.id("cpBody_GVSearchBills_lbDynamicPager")).click();
	    new Select(driver.findElement(By.id("cpBody_GVSearchBills_lbDynamicPager"))).selectByVisibleText("300");*/
	    //driver.findElement(By.xpath("//select[@id='cpBody_GVSearchBills_lbDynamicPager']/option[5]")).click();
		
		
		
		Thread.sleep(5000);
	
		
	}

	@AfterClass()
	public void tearDown() throws Exception {
		driver.quit();
	}
}
