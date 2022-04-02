package org.cts.Testing;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	static WebDriver driver;
@BeforeClass
public static void beforeClass() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
}
@AfterClass
public static void afterClass() {
	driver.quit();

}
@Before
public void before() {
	Date d = new Date();
	System.out.println(d);

}
@After
public void after() {
	Date d = new Date();
	System.out.println(d);
}
@Test 
public void test1() {
	WebElement txtUserName = driver.findElement(By.id("email"));
	txtUserName.sendKeys("Priyanka@gmail.com");
	
	WebElement txtPassword = driver.findElement(By.id("pass"));
	txtPassword.sendKeys("Hello@123");
	
	WebElement btnLogin = driver.findElement(By.name("login"));
	btnLogin.click();
}


}

