package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import com.generic.DemoToursPageFactory;
import com.util.BaseConfig;
import com.util.HandleClick;
import com.util.HighLighter;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoToursStepDef {
	WebDriver driver;
	DemoToursPageFactory dtp;
	SoftAssert soft;
	
	@Given("Open Browser")
	public void open_Browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	@Given("Go to URL")
	public void go_to_URL() throws Throwable {
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.navigate().to(BaseConfig.readPro("DemoURL"));
	}

	@When("Enter UserName and Password")
	public void enter_UserName_and_Password() throws Throwable {
		dtp = new DemoToursPageFactory(driver);
		Thread.sleep(3000);
		HighLighter.getColor(dtp.getEnterUserName(), driver, "red");
		dtp.getEnterUserName().sendKeys(BaseConfig.readPro("DemoUser"));
		Thread.sleep(3000);
		HighLighter.getColor(dtp.getEnterPassword(), driver, "blue");
		dtp.getEnterPassword().sendKeys(BaseConfig.readPro("DemoPass"));
		Thread.sleep(3000);
		HighLighter.getColor(dtp.getClickSubmit(), driver, "green");
		HandleClick.bestClick(driver, dtp.getClickSubmit());

	}

	@When("Verify Login Success Msg")
	public void verify_Login_Success_Msg() throws Throwable {
		soft = new SoftAssert();
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(dtp.getSuccessMsg().isDisplayed());
		Thread.sleep(3000);
		HighLighter.getColor(dtp.getClickSignOff(), driver, "white");
		HandleClick.bestClick(driver, dtp.getClickSignOff());

	}

	@Then("Close Browser")
	public void close_Browser() {
		driver.quit();
		soft.assertAll();

	}

}
