import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;



public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {

		//Read property file
		
		 FileInputStream fs = new FileInputStream("C:\\Testing\\ReadWriteFile.properties");
		 Properties prop = new Properties();
		 prop.load(fs);
		 
		 String browser = prop.getProperty("browser");
		 System.out.println(browser);
		 
		 
		 System.out.println(prop.getProperty("testSiteName"));
		 System.out.println(prop.getProperty("environment"));
		 
		 
		 //Write into properties file
		 
		 prop.setProperty("name", "Nikul");
		 System.out.println(prop.getProperty("name"));
		 
		 prop.setProperty("last", "Patel");
		 System.out.println(prop.getProperty("last"));
		 
		 FileOutputStream fo = new FileOutputStream("C:\\\\Testing\\\\ReadWriteFile.properties");
		 prop.store(fo, "Adding to file");
	}

}
