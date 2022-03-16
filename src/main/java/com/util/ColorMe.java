package com.util;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ColorMe {
	public static void goColor (WebDriver driver, WebElement element,String color) {
		Map<String,String> mp = new HashMap<>();
		mp.put("RED", "arguments[0].style.border='5px solid red'");
		mp.put("BLUE", "arguments[0].style.border='5px solid blue'");
		mp.put("GREEN", "arguments[0].style.border='5px solid green'");
		mp.put("YELLOW", "arguments[0].style.border='5px solid yellow'");
		mp.put("PURPLE", "arguments[0].style.border='5px solid purple'");
		
		
		((JavascriptExecutor)driver).executeScript(mp.get(color), element);
		
			
	}
}

