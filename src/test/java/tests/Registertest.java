package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.Readpropertiesfile;
import pages.Athenticationpage;
import pages.Homepage;
import pages.Registerpage;

public class Registertest extends Testbase {

	
	Homepage Homeobj;
	Athenticationpage  Athenticationobj;
	Registerpage Registerobj;
	String mail=Readpropertiesfile.Userdata.getProperty("Mail");
	String fname = Readpropertiesfile.Userdata.getProperty("Firstname");
	String lname = Readpropertiesfile.Userdata.getProperty("Lastname");
	String pass= Readpropertiesfile.Userdata.getProperty("Password");
	String firstn= Readpropertiesfile.Userdata.getProperty("Fname");
	String lastn= Readpropertiesfile.Userdata.getProperty("Lname");
	String comp= Readpropertiesfile.Userdata.getProperty("company");
	String add1= Readpropertiesfile.Userdata.getProperty("Address1");
	String add2= Readpropertiesfile.Userdata.getProperty("Address2");
	String cityy= Readpropertiesfile.Userdata.getProperty("City");
	String zip= Readpropertiesfile.Userdata.getProperty("Zipcode");
	String othercomm= Readpropertiesfile.Userdata.getProperty("Others");
	String Homephone= Readpropertiesfile.Userdata.getProperty("telephone");
	String Mobilephone= Readpropertiesfile.Userdata.getProperty("mobile");
	String aliascomm= Readpropertiesfile.Userdata.getProperty("Alias");
	
	
	
	@Test
	public void userregistertest() throws InterruptedException
	{
		Homeobj=new Homepage(driver);
		Homeobj.userpressonsignin();
		Thread.sleep(2000);
		Athenticationobj=new  Athenticationpage(driver);
		Athenticationobj.userauthenticateregister(mail);
		Thread.sleep(5000);
		Registerobj =new Registerpage(driver);
		Registerobj.userregister(fname, lname, pass, firstn, lastn, comp, add1, add2, cityy, zip, othercomm, Homephone, Mobilephone, aliascomm);
		Thread.sleep(2000);
		Assert.assertEquals("MY ACCOUNT",Registerobj.successregister.getText());
		
	}
	
	
	
	
	
}
