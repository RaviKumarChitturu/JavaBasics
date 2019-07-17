package Kesi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestMultipleThreads {

	@Test(invocationCount = 2)
	public void loadTestThisWebsite() {

		WebDriver d = new FirefoxDriver();
		d.get("http://qa.xtbills.com/");
		d.findElement(By.id("TxtEmail")).sendKeys("admin1@gmail.com");
		d.findElement(By.id("TxtPassword")).sendKeys("xeno@123");
		d.findElement(By.id("BtnLogin")).click();
		d.quit();

	}
}
