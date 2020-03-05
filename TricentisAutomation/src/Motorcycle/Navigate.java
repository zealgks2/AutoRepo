package Motorcycle;

import Suite.TricentisSuite;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;



public class Navigate extends TricentisSuite{
	
	ChromeDriver dr = new ChromeDriver();
	

@BeforeTest
public void BeforeTest()
{
	System.out.println("Before Test");
	dr.manage().window().maximize();
	
	dr.get("http://sampleapp.tricentis.com/101/");
	
}
@AfterTest
public void AfterTest()

{
	System.out.println("After Test");
}

}
	
