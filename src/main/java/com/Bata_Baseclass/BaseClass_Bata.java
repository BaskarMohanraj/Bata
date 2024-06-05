package com.Bata_Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass_Bata {
	
	public WebDriver driver;
	public void BrowserLaunch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.bata.com/in");
		driver.manage().window().maximize();
	
	}
	
	public void BrowserExit() {
		
		driver.quit();
		
	}

}
