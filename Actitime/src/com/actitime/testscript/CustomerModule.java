package com.actitime.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	
	FileLib f=new FileLib();
	@Test
	public void createcustomer() throws EncryptedDocumentException, IOException, InterruptedException
	{
		String customername=f.readDataFromExcel("create customer", 1, 2);
		String description=f.readDataFromExcel("create customer", 1, 3);
		HomePage h=new HomePage(driver);
		h.getTaskTab().click();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNew().click();
		t.getAddNewCust().click();
		t.getCustomerNameTbx().sendKeys(customername);
		t.getCustDescription().sendKeys(description);
		t.getDropdwn().click();
		Thread.sleep(2000);
		t.getOurcompanyopt().click();
		t.getCreateCustBtn().click();
		Thread.sleep(2000);
		String actualText=t.getHeadertxt().getText();
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualText,customername);
		s.assertAll();
		t.getSearchbxTbx().sendKeys(customername);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='"+customername+"']/../../div[@class='editButton available']")).click();
		Thread.sleep(2000);
		t.getActionbttn().click();Thread.sleep(2000);
		t.getDeletebttn().click();
		t.getDelPermantlybttn().click();
	}
	}
