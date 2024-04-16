package com.actitime.testscript;

import java.io.IOException;
import java.time.Year;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.UserListPage;

public class UserModule extends BaseClass{
	FileLib f=new FileLib();
	@Test
	public void createUser() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String userfirstname=f.readDataFromExcel("create user",1,0);
		String lastName=f.readDataFromExcel("create user",1,1);
		String email=f.readDataFromExcel("create user",1,2);
		String username=f.readDataFromExcel("create user",1,3);
		String password=f.readDataFromExcel("create user",1,4);
		HomePage h=new HomePage(driver);
		h.getUserTab().click();
		UserListPage u=new UserListPage(driver);
		u.getAddUserbtn().click();
		u.getFirstNametbx().sendKeys(userfirstname);Thread.sleep(2000);
		u.getLastNametbx().sendKeys(lastName);Thread.sleep(2000);
		u.getEmailtbx().sendKeys(email);Thread.sleep(2000);
		u.getUserNametbx().sendKeys(username);
		u.getPwdtbx().sendKeys(password);Thread.sleep(2000);
		u.getCnfrmPwdtbx().sendKeys(password);Thread.sleep(2000);
		u.getTimeZoneGrp().click();Thread.sleep(2000);
		u.getSelecttime().click();Thread.sleep(2000);
		//u.getHiredtpopup().click();Thread.sleep(2000);
		//u.getCalmonthNyr().click();Thread.sleep(2000);
		//String year=f.readDataFromExcel("create user",1,6);
		//String month=f.readDataFromExcel("create customer",1,5);
		//String day=f.readDataFromExcel("create customer",1,7);


		//driver.findElement(By.xpath("//a[text()='"+year+"']")).click();Thread.sleep(2000);
		//driver.findElement(By.xpath("//a[text()='"+month+"']")).click();Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[@class=\"x-date-mp-ok\"]")).click();
		//driver.findElement(By.xpath("//span[text()='"+day+"']")).click();Thread.sleep(2000);
		boolean res=u.getCheckbox().isEnabled();
		if(res==false)
		{
			u.getCheckbox().click();
		}
		u.getCreateUserbtn().click();Thread.sleep(2000);
		u.getSerchTxtBx().sendKeys(userfirstname);
		u.getSelectUser().click();Thread.sleep(2000);
		u.getDeleteBtn().click();
		driver.switchTo().alert().accept();
		
	}






}
