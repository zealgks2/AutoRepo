import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.*;

public class WebdriverFirstSeleniumClass {

	public static void main (String[] args) {
		
	
		
		ChromeDriver dr = new ChromeDriver();
		
		dr.get("https://www.google.com");
		dr.manage().window().maximize();
		
		
	}
	
	
	
	
	

}
