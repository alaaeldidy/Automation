package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.Readpropertiesfile;
import pages.Athenticationpage;
import pages.Homepage;
import pages.Hoverdressespage;
import pages.Signinpage;

public class Hoverdressestest extends Testbase {

	
	Homepage Homeobj;
	Athenticationpage  Athenticationobj;
	Signinpage Signinobj;
	Hoverdressespage Hoverdressesobj;
	
	String emailsignin= Readpropertiesfile.Userdata.getProperty("Emailsignin");
	String passsignin= Readpropertiesfile.Userdata.getProperty("Passsignin");	
	
	
@Test(priority=1)
public void usersignin() throws InterruptedException
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

@Test(priority=2)
public void userhovertest() throws InterruptedException
{
	Hoverdressesobj = new Hoverdressespage(driver);
	Hoverdressesobj.userhoverdresses();
	Thread.sleep(2000);
	Assert.assertEquals("EVENING DRESSES",Hoverdressesobj.hoversuccess.getText());



}
	
	
	
	
	
}
