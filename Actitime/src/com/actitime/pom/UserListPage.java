package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {
	
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement addUserbtn;
	@FindBy(id="userDataLightBox_firstNameField")
	private WebElement firstNametbx;
	@FindBy(id="userDataLightBox_lastNameField")
	private WebElement lastNametbx;
	@FindBy(id="userDataLightBox_emailField")
	private WebElement emailtbx;
	@FindBy(id="userDataLightBox_usernameField")
	private WebElement userNametbx;
	@FindBy(id="userDataLightBox_passwordField")
	private WebElement pwdtbx;
	@FindBy(id="userDataLightBox_passwordCopyField")
	private WebElement cnfrmPwdtbx;
	@FindBy(id="userDataLightBox_timeZoneGroupSelectorPlaceholder")
	private WebElement timeZoneGrp;
	@FindBy(xpath="//div[text()='GMT +0:00']")
	private WebElement selecttime;
	@FindBy(id="userDataLightBox_hireDatePlaceholder")
	private WebElement hiredtpopup;
	@FindBy(xpath="//td[@class='x-date-middle']")
	private WebElement calmonthNyr;
	@FindBy(xpath="//button[@class='x-date-mp-ok']")
	private WebElement okBtn;
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement createUser;
	@FindBy(xpath="//input[contains(@class,'filterFieldInput')]")
	private WebElement serchTxtBx;
	@FindBy(xpath="//div[@class='name']")
	private WebElement selectUser;
	@FindBy(id="userDataLightBox_deleteBtn")
	private WebElement deleteBtn;

	


	public UserListPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSelectUser() {
		return selectUser;
	}


	public WebElement getDeleteBtn() {
		return deleteBtn;
	}

	public WebElement getCreateUser() {
		return createUser;
	}
	
	public WebElement getSerchTxtBx() {
		return serchTxtBx;
	}

	public WebElement getOkBtn() {
		return okBtn;
	}
	@FindBy(xpath="//table[@class='tabularDataTable wdTable createMode']//input[@type='checkbox']")
	private WebElement checkbox;
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement createUserbtn;
	
	
	public WebElement getAddUserbtn() {
		return addUserbtn;
	}
	public WebElement getFirstNametbx() {
		return firstNametbx;
	}
	public WebElement getLastNametbx() {
		return lastNametbx;
	}
	public WebElement getEmailtbx() {
		return emailtbx;
	}
	public WebElement getUserNametbx() {
		return userNametbx;
	}
	public WebElement getPwdtbx() {
		return pwdtbx;
	}
	public WebElement getCnfrmPwdtbx() {
		return cnfrmPwdtbx;
	}
	public WebElement getTimeZoneGrp() {
		return timeZoneGrp;
	}
	public WebElement getSelecttime() {
		return selecttime;
	}
	public WebElement getHiredtpopup() {
		return hiredtpopup;
	}
	public WebElement getCalmonthNyr() {
		return calmonthNyr;
	}
	public WebElement getCheckbox() {
		return checkbox;
	}
	public WebElement getCreateUserbtn() {
		return createUserbtn;
	}
	

}
