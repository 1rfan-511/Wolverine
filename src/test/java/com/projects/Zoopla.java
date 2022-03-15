package com.projects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import com.generic.ZooplaPageFactory;
import com.util.BaseConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Zoopla {
	
	@SuppressWarnings("deprecation")
	public void goZoopla() throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to(BaseConfig.readPro("ZooplaURL"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		ZooplaPageFactory zpf = new ZooplaPageFactory(driver);
		
		zpf.getFirstSigninButton().click();
		//zpf.getListSignin().get(0).click();
		zpf.getEnterUserName().sendKeys(BaseConfig.readPro("ZooplaUser"));
		zpf.getEnterPassword().sendKeys(BaseConfig.readPro("ZooplaPass"));
		//zpf.getSecondClickSignin().click();
		zpf.getListSecondClickSignin().get(6).click();
		
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(zpf.getLoginStausSuccess().isDisplayed());
		
		WebElement a = zpf.getHoverOnRent();
		Actions action = new Actions(driver);
		action.moveToElement(a);
		action.perform();
		
		driver.quit();
		soft.assertAll();
	}

}
