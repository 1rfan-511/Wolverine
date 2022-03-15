package com.generic;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZooplaPageFactory {

	public ZooplaPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//*[@data-testid='header-mobile-sign-in']")
	private WebElement FirstSigninButton;
	@FindBy(xpath="//a[@href='/signin/?page_after_login=%2F&return_url=%2F&with_confirmation=true']")
	private List<WebElement> ListSignin ;
	@FindBy(xpath="//*[@name='email']")
	private WebElement EnterUserName;
	@FindBy(xpath="//*[@name='password']")
	private WebElement EnterPassword;
	@FindBy(xpath="(//*[contains(text(),'Sign in')])[7]")
	private WebElement SecondClickSignin;
	@FindBy(xpath="//*[contains(text(),'Sign in')]")
	private List<WebElement> ListSecondClickSignin ;
	@FindBy(xpath="//*[contains(text(),'Welcome back!')]")
	private WebElement LoginStausSuccess;
	@FindBy(xpath="(//*[@href='/to-rent/'])[1]")
	private WebElement HoverOnRent;
	@FindBy(xpath="//*[@href='/to-rent/']")
	private List<WebElement> ListHoverOnRent ;
	@FindBy(xpath="//*[contains(text(),'UK property to rent')]")
	private WebElement GoRent;
	@FindBy(xpath="//*[@id='search-input-location']")
	private WebElement EnterRentLocation ;
	@FindBy(xpath="(//*[@name='price_min'])[2]")
	private WebElement EnterMinPrice;
	@FindBy(xpath="//*[@name='price_min']")
	private List<WebElement> ListMinPrice;
	@FindBy(xpath="(//*[@name='price_max'])[2]")
	private WebElement EnterMaxPrice;
	@FindBy(xpath="//*[@name='price_max']")
	private List<WebElement> ListMaxPrice ;
	@FindBy(xpath="//*[@id='property_type']")
	private WebElement SelectPropType;
	@FindBy(xpath="//*[@id='beds_min']")
	private WebElement SelectBedroomQty;
	@FindBy(xpath="(//a[@href='/myaccount/'])[1]")
	private WebElement HoverMyZoopla;
	@FindBy(xpath="//a[@href='/myaccount/']")
	private List<WebElement> ListHoverMyZoopla ;
	@FindBy(xpath="(//a[@href='/?signout=1'])[1]")
	private WebElement ClickSignOut;
	@FindBy(xpath="//a[@href='/?signout=1']")
	private List<WebElement> ListClickSignOut ;
	public WebElement getFirstSigninButton() {
		return FirstSigninButton;
	}
	public List<WebElement> getListSignin() {
		return ListSignin;
	}
	public WebElement getEnterUserName() {
		return EnterUserName;
	}
	public WebElement getEnterPassword() {
		return EnterPassword;
	}
	public WebElement getSecondClickSignin() {
		return SecondClickSignin;
	}
	public List<WebElement> getListSecondClickSignin() {
		return ListSecondClickSignin;
	}
	public WebElement getLoginStausSuccess() {
		return LoginStausSuccess;
	}
	public WebElement getHoverOnRent() {
		return HoverOnRent;
	}
	public List<WebElement> getListHoverOnRent() {
		return ListHoverOnRent;
	}
	public WebElement getGoRent() {
		return GoRent;
	}
	public WebElement getEnterRentLocation() {
		return EnterRentLocation;
	}
	public WebElement getEnterMinPrice() {
		return EnterMinPrice;
	}
	public List<WebElement> getListMinPrice() {
		return ListMinPrice;
	}
	public WebElement getEnterMaxPrice() {
		return EnterMaxPrice;
	}
	public List<WebElement> getListMaxPrice() {
		return ListMaxPrice;
	}
	public WebElement getSelectPropType() {
		return SelectPropType;
	}
	public WebElement getSelectBedroomQty() {
		return SelectBedroomQty;
	}
	public WebElement getHoverMyZoopla() {
		return HoverMyZoopla;
	}
	public List<WebElement> getListHoverMyZoopla() {
		return ListHoverMyZoopla;
	}
	public WebElement getClickSignOut() {
		return ClickSignOut;
	}
	public List<WebElement> getListClickSignOut() {
		return ListClickSignOut;
	}

	
}
