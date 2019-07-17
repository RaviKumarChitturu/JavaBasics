package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	private static WebDriver driver;

	  @DataProvider(name = "Authentication")

	  public static Object[][] credentials() {

	        return new Object[][]  {{"http://qa.circulus.io"},{"http://www.google.com"}};

	  }

	  // Here we are calling the Data Provider object with its Name

	  @Test(dataProvider = "Authentication")

	  public void test(String sUsername) throws Exception {

		  driver = new FirefoxDriver();

	      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	      driver.get(sUsername);

	      
	     // driver.findElement(By.id("TxtEmail")).sendKeys(sUsername);

	     // driver.findElement(By.id("TxtPassword")).sendKeys(sPassword);

	     // driver.findElement(By.id("BtnLogin")).click();

	      //driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();

	      driver.quit();

	  }
}
