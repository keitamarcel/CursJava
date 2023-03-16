package Curs8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFileProcesor {

	public void writePropertiesFile() throws IOException {
		//try and catch - arunca eroare si genereaza exceptii
		try {
			OutputStream outputStream =new FileOutputStream("test.properties");
			
			Properties file = new Properties();
			file.setProperty("user","admin");
			file.setProperty("pass","admin123");
			
			file.store(outputStream, " Am salvat properties file");
		      
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	public void readPropertiesFile(String key) throws IOException {
		
		InputStream inputStream =new FileInputStream("test.Properties");
		Properties file =new Properties();
		file.load(inputStream);
		System.out.println(file.getProperty(key));
		
		
		
	}
	
}
