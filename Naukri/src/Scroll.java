import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("file:///Users/apollozealot/Downloads/Practice.html");
		
		//chrome driver implements java script executor and webdriver
		
		JavascriptExecutor j = dr;
		
		WebElement w1 = dr.findElement(By.xpath("//button[text()='Button to get alert']"));
		
		j.executeScript("arguments[0].scrollIntoView();", w1);
		
		
		w1.click();
		
		Alert alt = dr.switchTo().alert();
		
		System.out.println(alt.getText());

		//alt.accept();
		alt.dismiss();
	}

}
