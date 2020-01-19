package com.flymango;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Program extends Base{
	
	public static void main(String[] args) {
		
		Base.getDriver();
		
		Base.launchUrl("https://www.facebook.com/");
		
		Base.max();
		
		WebElement login = driver.findElement(By.id("email"));
		Base.type(login, "greenstechnology");
		
		WebElement p = driver.findElement(By.id("pass"));
		Base.checkIn(p, "1234567890");
		
		System.out.println(Base.getPassword(p));
		
		WebElement clk = driver.findElement(By.xpath("//input[@id='u_0_b']"));
		Base.clicking(clk);
		
		WebElement gettingText = driver.findElement(By.xpath("(//a[@role='button'])[1]"));
		System.out.println(Base.Text(gettingText));
		
		System.out.println(Base.title());
		
		System.out.println(Base.currentUrl());
		
		System.out.println(Base.a);
		
		Base.launchUrl("http://www.greenstech.in/selenium-course-content.html");
		
		
		
	}
	

}
