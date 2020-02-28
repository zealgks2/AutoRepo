import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class handleiframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.paytm.com");
	
		Thread.sleep(2000);

		dr.findElement(By.xpath("//div[@class='_3ac-'][text()='Log In/Sign Up']")).click();
		
		
		
		//iframe is a window /htmlpage embedded inside a window
		
		Thread.sleep(5000);
		
		
		//dr.switchTo().frame(0);
		
		dr.switchTo().frame(dr.findElement(By.xpath("//iframe")));
		
		dr.findElement(By.xpath("//span[text()='Login/Signup with mobile number and password']")).click();
		
	
	}

}
