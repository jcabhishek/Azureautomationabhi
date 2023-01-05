package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Readdata 
{

	Properties prop;
	public Readdata()
	{
		File src=new File(System.getProperty("user.dir")+"./configfiles/config.properties");
		try
		{
			FileInputStream fis=new FileInputStream(src);
			prop=new Properties();
			prop.load(fis);
		}
		catch(Exception e)
		{
			System.out.println("Exception is"+ e.getMessage());
		}
		
		
	
	}
	public String getUsername()
	{
		String username=prop.getProperty("username");
		return username;
	}
	public String getPassword()
	{
		String password=prop.getProperty("password");
		return password;
	}
	public String getvin()
	{
		String vin=prop.getProperty("vinno");
		return vin;
	}
	
	
	

}
