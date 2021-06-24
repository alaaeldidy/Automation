package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.Readpropertiesfile;
import pages.Athenticationpage;
import pages.Homepage;
import pages.Signinpage;

public class Signintest extends Testbase {

	Homepage Homeobj;
	Athenticationpage  Athenticationobj;
	Signinpage Signinobj;
	
	String emailsignin= Readpropertiesfile.Userdata.getProperty("Emailsignin");
	String passsignin= Readpropertiesfile.Userdata.getProperty("Passsignin");
	
	
@Test
public void usersignintest() throws InterruptedException
{
	
	Homeobj=new Homepage(driver);
	Homeobj.userpressonsignin();
	Thread.sleep(2000);
	Athenticationobj=new  Athenticationpage(driver);
	Athenticationobj.userauthenticatesignin(emailsignin, passsignin);
	Thread.sleep(2000);
	Signinobj=new Signinpage(driver);
	Assert.assertEquals("MY ACCOUNT",Signinobj.successsignin.getText());

	
	

}
}
	
	

