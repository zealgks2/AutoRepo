import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlecombobox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("file:///Users/apollozealot/Downloads/Practice.html");
	
		Select s1 = new Select(dr.findElement(By.id("anand")));
		
		s1.selectByIndex(1);
		s1.selectByIndex(2);
		s1.selectByIndex(3);
		
		Thread.sleep(2000);
		
		s1.deselectAll();

	}

}
