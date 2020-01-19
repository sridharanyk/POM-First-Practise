package com.flymango;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver driver;
	static int a = 10;
		
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GT Sanatorium\\gobi04228\\SundayTask\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	public static void launchUrl(String Url) {
			driver.get(Url);
	}
	public static void type(WebElement element, String name) {
			element.sendKeys(name);
	}
	public static void checkIn(WebElement element, String pass) {
			element.sendKeys(pass);
	}
	public static void max() {
		driver.manage().window().maximize();
	}
	public static String title() {
		String v = driver.getTitle();	
		return v;
	}
	public static String currentUrl() {
		String v = driver.getCurrentUrl();
		return v;
	}
	public static void clicking(WebElement element) {
		element.click();
	}
	public static String getPassword(WebElement element) {
		String v = element.getAttribute("value");
		return v;
	}
	public static String Text(WebElement element) {
		String v = element.getText();
		return v;
	}
	
	
	
	
	
	
	

}
