package com.actitime.generic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public static WebDriver driver;
	FileLib f=new FileLib();
	@BeforeClass
	public void openBrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		String url=f.readDataFromProperty("url");
		driver.get(url) ;
		Reporter.log("Open Browser");
	}
	@BeforeMethod
	public void login() throws IOException
	{   
		String un=f.readDataFromProperty("un");
		String pwd=f.readDataFromProperty("pwd");
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Reporter.log("Login",true);
	}

	@AfterMethod
	public void logout()
	{
		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("logout",true);
	}
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
		Reporter.log("Close Browser",true);
	}

}
