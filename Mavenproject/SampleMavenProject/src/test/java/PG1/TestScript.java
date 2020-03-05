package PG1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestScript {
	WebDriver dr;
	
	
	
	
	
	@Test
	public void test1()
	{
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
		
		System.out.println("test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test2");
	}
	@Test
	public void test3()
	{
		System.out.println("test3");
	}

}
