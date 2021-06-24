package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.Readpropertiesfile;
import pages.Athenticationpage;
import pages.Homepage;
import pages.Searchpage;
import pages.Signinpage;
import pages.productcartpage;

public class productcartpagetest extends Testbase {

	Homepage Homeobj;
	Athenticationpage  Athenticationobj;
	Signinpage Signinobj;
	Searchpage Searchobj;
	productcartpage productcartobj;
	
	
	String emailsignin= Readpropertiesfile.Userdata.getProperty("Emailsignin");
	String passsignin= Readpropertiesfile.Userdata.getProperty("Passsignin");	
	String product =Readpropertiesfile.Userdata.getProperty("pro");	
	
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
	public void usersearchtest() throws InterruptedException
	{Homeobj = new Homepage(driver);
	Homeobj.usersearch(product);
	Thread.sleep(2000);
	Assert.assertTrue(driver.getCurrentUrl().contains("dresses"));
	Thread.sleep(2000);
	Searchobj = new Searchpage(driver) ;
	Searchobj.userpressonitem();
	Thread.sleep(4000);
	}
	@Test(priority=3)
	public void userproductpage() throws InterruptedException
	{
		productcartobj = new productcartpage (driver);
		productcartobj.uaeraddtocart();
		Thread.sleep(5000);
		Assert.assertEquals("Product successfully added to your shopping cart",productcartobj.addectocartsuccess.getText());
	}
	
}
