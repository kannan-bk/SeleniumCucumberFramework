package com.test.check;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitialTest {
	
	
	
	public static void main(String[] args) {
		InitialTest InitialTest = new InitialTest();
		InitialTest.openBrowser();
		
	}

	public void openBrowser() {
		try {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mvnrepository.com");
			driver.quit();
		} catch(Exception e) {
			e.printStackTrace();;
		}
	}

	
}
