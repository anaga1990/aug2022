package map;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadAndWriteData {
	public static void main(String[] args) {
		try {
			String tc = "testcase3";
			File file = new File("./others/testData.properties");
			FileInputStream fis = new FileInputStream(file);
			Properties properties = new Properties();
			properties.load(fis);
			System.out.println(properties.getProperty("password") +" ------ "+
			properties.getProperty("browser"));
			properties.setProperty("browser", "firefox");
			properties.setProperty("screenShotsLocation", "Dummy");
			properties.store(new FileOutputStream("./others/testData1.properties"), "i am updating browser details");
			System.out.println(properties.getProperty(tc+".username"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
