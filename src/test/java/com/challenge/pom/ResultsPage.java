package com.challenge.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage extends Base{

	//locators used for this page
	
	By resultsClassLocator = By.xpath("//*[@class=\"a-section aok-relative s-image-square-aspect\"]");
	
	
	public ResultsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public int getResultsNumber() throws InterruptedException{
		if (isDisplayed(resultsClassLocator)) {
			return getSize(resultsClassLocator);
		}
		else {
			System.out.println("Error al obtener resultados");
			return 0;
		}
	}


}
