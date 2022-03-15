package com.util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleClick {
public static void bestClick(WebDriver driver, WebElement element){
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;//type casting
		jse.executeScript("arguments[0].click();", element);
	}

}
