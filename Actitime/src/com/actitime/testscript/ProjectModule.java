package com.actitime.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class ProjectModule extends BaseClass {
	FileLib f=new FileLib();
	@Test
	public void createproject() throws InterruptedException, EncryptedDocumentException, IOException
	{   
		String projectname=f.readDataFromExcel("create project", 7,0);
		String description=f.readDataFromExcel("create project", 1, 1);
		HomePage h=new HomePage(driver);
		h.getTaskTab().click();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNew().click();
		t.getCreateNewProBtn().click();
		Thread.sleep(2000);
		t.getNewProjecctTbx().sendKeys(projectname);
		t.getCusDropDwn().click();
		Thread.sleep(2000);
		t.getSelectfrmDropDwn().click();
		t.getProjDesTxtBox().sendKeys(description);
		Thread.sleep(2000);
		t.getCreateProj().click();
		Thread.sleep(2000);
		String actualText=t.getHeadertxtProj().getText();
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualText,projectname);
		s.assertAll();
		t.getSearchbxTbx().sendKeys(projectname);
		//driver.findElement(By.xpath("//span[text()='"+projectname+"']/../../div[@class='editButton available']")).click();
		t.getSettbutton().click();
		Thread.sleep(2000);
		t.getActionbtn().click();Thread.sleep(2000);
		t.getDelbutn().click();
		t.getDelprojpermantly().click();
	}
}
