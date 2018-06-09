package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"/Users/verachimitova/Documents/selenium dependencies/drivers/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.etsy.com/c/clothing-and-shoes?ref=catnav-10923");
	}

}
