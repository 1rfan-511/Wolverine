package com.generic;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoToursPageFactory {
	public DemoToursPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@name='userName']")
	private WebElement EnterUserName;
	@FindBy(xpath = "//*[@name='password']")
	private WebElement EnterPassword;
	@FindBy(xpath = "//*[@name='submit']")
	private WebElement ClickSubmit;
	@FindBy(xpath = "(//*[@class='mouseOut'])[8]")
	private WebElement ClickSignOff;
	@FindBy(xpath = "//*[@class='mouseOut']")
	private List<WebElement> ListSignoff_7;
	@FindBy(xpath = "//*[text()='Login Successfully']")
	private WebElement SuccessMsg;

//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
//	FindBy(xpath="")
//	private WebElement ;
//	@FindBy(xpath="")
//	private WebElement ;
	public WebElement getEnterUserName() {
		return EnterUserName;
	}

	public WebElement getEnterPassword() {
		return EnterPassword;
	}

	public WebElement getClickSubmit() {
		return ClickSubmit;
	}

	public WebElement getClickSignOff() {
		return ClickSignOff;
	}

	public List<WebElement> getListSignoff_7() {
		return ListSignoff_7;
	}

	public WebElement getSuccessMsg() {
		return SuccessMsg;
	}

}
