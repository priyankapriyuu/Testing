package org.cts.Testing;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.TestCase;

public class AssertProgram {
	static WebDriver driver;
	

	@Test
	public void testCase1() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		String url = driver.getCurrentUrl();
		boolean b = url.contains("facebook");
		
		Assert.assertTrue("Verify URL", b);
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("Priyanka@gmail.com");
				
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("Hello@123");
		String value = txtPassword.getAttribute("value");
		
		Assert.assertEquals("verify username", "Hello", value);
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
	
	}
	@Test
	public void testCase2() {
		driver.quit();

	}
}
