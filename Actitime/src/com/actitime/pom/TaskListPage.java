package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewbtn;
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement addNewCust;
	@FindBy(id="customerLightBox_nameField")
	private WebElement customerNameTbx;
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement custDescription;
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createcustbtn;
	@FindBy(className = "x-btn-text")
	private WebElement dropdwn;
	@FindBy(linkText = "Our Company")
	private WebElement ourcompanyopt;
	@FindBy(xpath="//div[@class='navigationLinks']/../div[2]")
	private WebElement headertxt;
	@FindBy(xpath="//input[@placeholder='Start typing name ...']")
	private WebElement searchbxTbx;
	@FindBy(xpath="//div[contains(@class,'edit_customer')]//div[text()='ACTIONS']")
	private WebElement actionbttn;
	@FindBy(xpath="//div[contains(@class,'edit_customer')]//div[text()='Delete']")
	private WebElement deletebttn;
	@FindBy(id="customerPanel_deleteConfirm_submitTitle")
	private WebElement delPermantlybttn;
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement createNewProBtn;
	@FindBy(id="projectPopup_projectNameField")
	private WebElement newProjecctTbx;
	@FindBy(xpath="//button[text()='-- Please Select Customer to Add Project for  --']")
	private WebElement cusDropDwn;
	@FindBy(linkText = "Our Company")
	private WebElement selectfrmDropDwn;
	@FindBy(id="projectPopup_projectDescriptionField")
	private WebElement projDesTxtBox;
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement createProj;
	@FindBy(xpath="//div[@id='taskListBlock']//div[@class='title ellipsis']")
	private WebElement headertxtProj;
	@FindBy(xpath="//div[@class='node projectNode selected']//div[@class='editButton available']")
	private WebElement settbutton;
	@FindBy(xpath="//div[@class='editProjectPanelHeader']//div[text()='ACTIONS']")
	private WebElement actionbtn;
	@FindBy(xpath="//div[@class='edit_project_sliding_panel sliding_panel']//div[@class='deleteButton']")
	private WebElement delbutn;
	@FindBy(id="projectPanel_deleteConfirm_submitTitle")
	private WebElement delprojpermantly;
	
	
	public WebElement getSettbutton() {
		return settbutton;
	}

	public WebElement getActionbtn() {
		return actionbtn;
	}

	public WebElement getDelbutn() {
		return delbutn;
	}

	public WebElement getDelprojpermantly() {
		return delprojpermantly;
	}

	public WebElement getCreateNewProBtn() {
		return createNewProBtn;
	}

	public WebElement getNewProjecctTbx() {
		return newProjecctTbx;
	}

	public WebElement getCusDropDwn() {
		return cusDropDwn;
	}

	public WebElement getSelectfrmDropDwn() {
		return selectfrmDropDwn;
	}

	public WebElement getProjDesTxtBox() {
		return projDesTxtBox;
	}

	public WebElement getCreateProj() {
		return createProj;
	}

	public WebElement getHeadertxtProj() {
		return headertxtProj;
	}

	public WebElement getActionbttn() {
		return actionbttn;
	}

	public WebElement getDeletebttn() {
		return deletebttn;
	}

	public WebElement getDelPermantlybttn() {
		return delPermantlybttn;
	}

	public WebElement getSearchbxTbx() {
		return searchbxTbx;
	}

	public TaskListPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getHeadertxt() {
		return headertxt;
	}

	public WebElement getAddNew()
	{
		return addNewbtn;
	}
	public WebElement getAddNewCust() {
		return addNewCust;
	}
	public WebElement getCustomerNameTbx() {
		return customerNameTbx;
	}
	public WebElement getCustDescription() {
		return custDescription;
	}
	public WebElement getDropdwn() {
		return dropdwn;
	}
	public WebElement getCreateCustBtn() {
		return createcustbtn;
	}
	public WebElement getOurcompanyopt() {
		return ourcompanyopt;
	}
}

