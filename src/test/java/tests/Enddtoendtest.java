package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.Readpropertiesfile;
import pages.Addtocartpage;
import pages.Athenticationpage;
import pages.Checkoutpage;
import pages.Homepage;
import pages.Searchpage;
import pages.Signinpage;
import pages.productcartpage;

public class Enddtoendtest extends Testbase {

	
	Homepage Homeobj;
	Athenticationpage  Athenticationobj;
	Signinpage Signinobj;
	Searchpage Searchobj;
	Addtocartpage Addtocartobj;
	productcartpage productcartobj;
	Checkoutpage Checkoutobj;
	
	String emailsignin= Readpropertiesfile.Userdata.getProperty("Emailsignin");
	String passsignin= Readpropertiesfile.Userdata.getProperty("Passsignin");	
	String product =Readpropertiesfile.Userdata.getProperty("pro");	
	String Quantity =Readpropertiesfile.Userdata.getProperty("quantity");	
	
	@Test(priority=1) //usersignin
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
	
	@Test(priority=4)
	public void userpressoncheckout() throws InterruptedException
	{
		Addtocartobj=new Addtocartpage (driver);;
		Addtocartobj.uaercheckoutt();
		Thread.sleep(5000);

	}
		

	@Test(priority=5) //order details
	public void productdetailscheck() throws InterruptedException
	{
		Checkoutobj= new Checkoutpage(driver) ;
		Checkoutobj.usershowproductinchart("Quantity");
		Thread.sleep(3000);
		Assert.assertEquals("Your order on My Store is complete.",Checkoutobj.confirmorder.getText());

		
	}
	

	
	
	
	
}
