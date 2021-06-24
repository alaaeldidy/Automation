package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readpropertiesfile {
	
public static Properties Userdata=loadProperties(System.getProperty("user.dir")+"\\src\\test\\java\\data\\userdata.properties");

private static Properties loadProperties(String path) 
{
	Properties pro=new Properties();
	FileInputStream stream;
	try {
		stream = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\data\\userdata.properties");
		pro.load(stream);
	} catch (FileNotFoundException e) {
		System.out.println("file not found"+e.getMessage());
		e.printStackTrace();
	}

     catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return pro;
}
	
	
	
	
	
	
	
	
	

}
