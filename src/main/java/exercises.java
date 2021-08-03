import java.time.YearMonth;
import com.google.common.primitives.Chars;

public class exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //a)Calculate the factorial of a number
		factorial(0);
		factorial(1);
		factorial(5);
		

	   //b)From the following array ['a''b''c''d'], validate if it contains the following values: 'a' 'b' 'f'. Return a Boolean depending on the result

		char[] array1= {'a','b','c','d'};
		char[] array2= {'a','b','f'};
		char[] array3= {'a','c','b'};
		
		
		System.out.println("Result from excercise b arrays 1 and 2 "+excerciseB(array1,array2));
		
		System.out.println("Result from excercise b arrays 1 and 3 "+excerciseB(array1,array3));
		
	   //c)Sum all the elements of an array: [1,34,56,72,123]
		int[] intarray = {1,34,56,72,123};
		int[] intarray2 = {1000,100,10,1};
		
		System.out.println("Result from excercise c "+excerciseC(intarray));
		System.out.println("Result from excercise c "+excerciseC(intarray2));
		

	   //d)Write a program to calculate the modules of two numbers without using any inbuilt modulus operator

		System.out.println(module(13,5));
		System.out.println(module(15,5));
	   
	   //e)Write a program to find the number of days in a month
		int year=2021;
		int august= 8 ;
	    int february= 2; 	
		
		System.out.println("Number of days in August 2021= "+excerciseE(year,august));
		System.out.println("Number of days in February 2021= "+excerciseE(year,february));
		
		
	}
	
	public static void factorial(int number) {
		int resul=1;
		for (int i = number; i >= 1 ; i--) {
			resul=resul*i;
		}
		System.out.println("Factorial de "+number+"="+resul);
	}
	
	public static boolean excerciseB(char[] array, char[] subArrya) {
		boolean result=true;
		for (int i = 0; i < subArrya.length; i++) {
			result= result&&Chars.contains(array,subArrya[i]);
		}
		return result;
	}

	public static int excerciseC(int[] array) {
		int result=0;
		for (int i : array) {
			result=result+i;
		}
		return result;
	}
	
	public static int module(int num1, int num2) {
		return (num1 - ((num1 / num2) * num2));
	}
	
	public static int excerciseE(int year, int monthnumber) {
		YearMonth yearMonthObject = YearMonth.of(year, monthnumber);
		return yearMonthObject.lengthOfMonth();
	}
	
	/*
    2. In Gherkin language, describe a test case to acquire a product online, beggining with the choice until the purchase
	
	 Feature: Acquire a product online
	 
  	 In order to get a product
     Customers should be able to
     select and purchase a product 
     from the e-commerce portal 


     Scenario: Buy a mug from e-commerce portal      
     
     Given Customer is logged in the e-commerce portal
     And Customer has enough money for a mug in their digital wallet
     When Customer search for "mug" in the search bar
     Then results for "mug" are shown
     And When Customer add the first result to the cart
     And select "proceed with purchase"
     Then a confirmation message is displayed
     And the price of the mug is deducted from the customer's e-wallet
     
     
     
	
	3. Explains the next lines of code:
	
	a) Driver.findElements(By.id(“btn-1”)).get(3).click();
	
	It searches for all the elements that have id="btn-1", this generates a list of web-elements that match the search.
	then the fourth web element(index 3) is selected and clicked.
	
	   
	b) WebDriverWait wait = new WebDriverWait(driver 30); 
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(“other-button”)));
	driver.findElement(By.id(“last_name”)).sendKeys(“Hi”);
	
	an instance is created for WebDriverWait, although a comma is needed, 
	since it receives 2 parameters (driver, maxDuration)
	then wait until the webElement with name “other-button” is visible on the page 
	with a maximum wait of 30 seconds ().
	And finally locate the element with id="last_name" and write "Hi"
	
	
	c) Assert.assertTrue(false);
	verify that the parameter sent is true, in this case it is false so the test would not pass
	
	
	4. Design a script with selenium commands (not is necessary use some language programming)
	
	Open browser
	Go to Amazon page
	Find  the word “pantallas”
	Extract the number of result on the first screen
	
	R=For this one you can find the test script in this project at
	  src/test/java (default package) in the file "SearchTest.java"
	 
	
	5. Design a high level architecture script using POM
	
	R=Same as before you can find the POM structure at
	  src/test/java and inside the package com.challenge.pom
	  You will notice that 3 files are shown,
	  a Base one with all the basics, another for the main page and finally
	  one for the results page
    */
}
