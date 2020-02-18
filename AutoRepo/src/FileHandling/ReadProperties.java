package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		FileInputStream file = new FileInputStream("/Users/apollozealot/Documents/AutoRepo/AutoRepo/AutoRepo/src/FileHandling/SampleData.csv");
		
		Properties Or = new Properties();
		
		Or.load(file);
		
		System.out.println(Or.get("name"));
		System.out.println(Or.get("age"));
		System.out.println(Or.get("surname"));
	}

}
