package com.challenge.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	private WebDriver driver;

	public Base(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}
	
	public WebDriver chromeDriver() {
		System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public void visit(String url) {
		driver.get(url);
	}
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> findElements(By locator){
		return driver.findElements(locator);
	}

	public void clear(By locator) {
		driver.findElement(locator).clear();
	}
	
	public void type(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}
	
	public void enter(By locator) {
		driver.findElement(locator).submit();
	}

	public int getSize(By locator) {
		return driver.findElements(locator).size();
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException  e) {
			return false;
		}
	}
	
	

}
