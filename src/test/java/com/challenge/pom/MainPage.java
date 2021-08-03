package com.challenge.pom;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends Base {
	
	//locators used for this page
	By searchBoxLocator = By.name("field-keywords");
	By filterSearchLocator= By.className("a-dropdown-prompt");

	public MainPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void performSearch(String text) throws InterruptedException{
		clear(searchBoxLocator);
		type(searchBoxLocator, text);
		enter(searchBoxLocator);
		Thread.sleep(3000);
		if (!isDisplayed(filterSearchLocator)) {
			System.out.println("Error al ejecutar la búsqueda");
		}
	}
	
	


}
