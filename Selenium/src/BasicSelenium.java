import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasicSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://sampleapp.tricentis.com/101/");
		
		//WebElement w1 = dr.findElement(By.id("nav_automobile"));
		
		//WebElement w1 = dr.findElement(By.name("Navigation Automobile"));
		
		//WebElement w1 = dr.findElement(By.linkText("Automobile"));
		
		//WebElement w1 = dr.findElement(By.partialLinkText("mobile"));
		
		
		// Xpath=//tagname[@attribute='value']
		
		//WebElement w1 = dr.findElement(By.xpath("//a[@id='nav_automobile'][@name='Navigation Automobile'][text()='Automobile'][@href='#']"));
		
		//WebElement w1 = dr.findElement(By.cssSelector("a#nav_automobile"));
		WebElement w1 = dr.findElement(By.cssSelector("a[name='Navigation Automobile']"));
		
		String s = w1.getText();
		
		System.out.println(s);
		
		
		
		//dr.close();
		
		w1.click();
		
WebElement w2 = dr.findElement(By.cssSelector(("input#engineperformance")));
		
		w2.sendKeys("1000");
		
		//Select w3 = new Select(dr.findElement(By.tagName("Select")));
		
		
		
		//Select w3 = new Select(dr.findElement(By.id("make")));
		
		Select w3 = new Select (dr.findElement(By.xpath("//select[@id='make']")));
		
		
		w3.selectByValue("Porsche");
		
		Actions a = new Actions(dr);
		
		
		//Action hover = a.moveToElement(dr.findElement(By.xpath("//Button[@id='opendateofmanufacturecalender'][@class='ui-datepicker-trigger']"))).build();
		
		
		//hover.perform();
		
		
		dr.findElement(By.id("opendateofmanufacturecalender")).click();
		
		String targetYear="2019";
		String targetMonth="July";
		String targetDate="10";
		
		
		
		while(!dr.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().equals(targetMonth))
			dr.findElement(By.xpath("//a[@title='Prev']")).click();
				
		
		String month = dr.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String year = dr.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		System.out.println(month);
		System.out.println(year);
		
		//rows
		
		//table[@class='ui-datepicker-calendar']/tbody/tr
		
		//columns
		
		//table[@class='ui-datepicker-calendar']/tbody/tr[1]/td/a

	    //date
		
		//table[@class='ui-datepicker-calendar']/tbody/tr[1]/td[4]/a
		
		int rows = dr.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr")).size();
		
		//int cols = dr.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[1]/td/a")).size();
		
		
		System.out.println(rows);
		
		//System.out.println(cols);
		
				
		for ( int r= 1; r<=rows ; r++)
		{
			int cols = dr.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["+r+"]/td")).size();

			for(int c=1; c<=cols; c++)
			{
WebElement dateText = dr.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["+r+"]/td["+c+"]"));

if(dateText.getText().equals(targetDate))
{
	dateText.click();
}


			}
		}
		
		
	
		
		
		
		
		
	}

}
