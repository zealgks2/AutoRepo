import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.flipkart.com");
		
dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();		

Actions a = new Actions(dr) ; 


WebElement e1 = dr.findElement(By.xpath("//span[text()='Men']"));

Action hover = a.moveToElement(e1).build();

hover.perform();

//Thread.sleep(1000);

dr.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

/*implicitly wait will keep polling for presence of the element , 
if the element is visible , it will not wait for the complete timeout and execute the operation on the element*/

/* thread.sleep will wait for the given time even if the element is present */

dr.findElement(By.xpath("//a[text()='Shirts']")).click();

/*WebElement e2 = dr.findElement(By.xpath("//div[@class='_3G9WVX oVjMho']/div[@class='_3aQU3C']"));

Action Drag = a.dragAndDropBy(e2, 100, 0).build();

Drag.perform();

Thread.sleep(1000);

WebElement e3 = dr.findElement(By.xpath("//div[@class='_3G9WVX _2N3EuE']/div[@class='_3aQU3C']"));

Drag = a.dragAndDropBy(e3, -100, 0).build();

Drag.perform();*/


WebElement e4 = dr.findElement(By.xpath("//img[@class='_3togXc']"));

e4.click();

String tab1 = dr.getWindowHandle();

Set <String> tab2 = dr.getWindowHandles();

for(String s: tab2)
{
	if(!s.equals(tab1))
		dr.switchTo().window(s);
}


System.out.println(dr.findElements(By.xpath("//div[text()='Available offers']")).size());


	}

}




//Types of xpath access 

/* 1) Parent child 
2) Preceding -following 
3) preceding sibling - following sibling 
4) ancestors - descendent 

//span[text()='Men']//following::a[text()='Top wear']//following::a[text()='Shirts']

//a[text()='Suits & Blazers']//preceding::a[text()='Shirts']

//a[text()='Suits & Blazers']/..

//a[text()='Suits & Blazers']//parent::li

//a[text()='Suits & Blazers']/..//preceding-sibling::li/a[text()='Shirts']

//a[text()='Shirts']//preceding::span[text()='Men']

//a[text()='Top wear']/..//following-sibling::li/a[text()='Shirts']
 
//a[text()='Shirts']//ancestor::li/span[text()='Men']
 
//span[text()='Men']/../descendant::a[text()='Shirts'] 
  
//p[contains(.,'Automated Continuous Testing')]//following-sibling::div/div/a[contains(.,'Request a Demo')]  
  
*/






