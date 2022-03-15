package com.projects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import com.generic.DemoToursPageFactory;
import com.util.BaseConfig;
import com.util.HandleClick;
import com.util.HighLighter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTours {
	
	public void goFlight() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to(BaseConfig.readPro("DemoURL"));
		
		
		
		DemoToursPageFactory dtp = new DemoToursPageFactory(driver);
		
		Thread.sleep(3000);
		HighLighter.getColor(dtp.getEnterUserName(), driver, "red");
		dtp.getEnterUserName().sendKeys(BaseConfig.readPro("DemoUser"));
		Thread.sleep(3000);
		HighLighter.getColor(dtp.getEnterPassword(), driver, "blue");
		dtp.getEnterPassword().sendKeys(BaseConfig.readPro("DemoPass"));
		//dtp.getClickSubmit().click();
		Thread.sleep(3000);
		HighLighter.getColor(dtp.getClickSubmit(), driver, "green");
		HandleClick.bestClick(driver, dtp.getClickSubmit());
		
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(dtp.getSuccessMsg().isDisplayed());
		Thread.sleep(3000);
		HighLighter.getColor(dtp.getClickSignOff(), driver, "white");
		HandleClick.bestClick(driver, dtp.getClickSignOff());
		
		driver.quit();
		soft.assertAll();
		
	}

}
