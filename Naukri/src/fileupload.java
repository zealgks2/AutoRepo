import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("file:///Users/apollozealot/Downloads/Practice.html");
	}

}
