package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Registerpage extends Pagebase {

	Select select;
	
	
	public Registerpage(WebDriver driver) {
		super(driver);
	
	}

	@FindBy(id="id_gender2")
	WebElement gender;
	
	@FindBy(id="customer_firstname")
	WebElement Fname;
	
	@FindBy(id="customer_lastname")
	WebElement Lname;
	
	@FindBy(id="passwd")
	WebElement password;
	
	@FindBy(id="days")
	WebElement days;
	
	@FindBy(id="months")
	WebElement months;
	
	@FindBy(id="years")
	WebElement years;
	
	@FindBy(id="firstname")
	WebElement firstname;
	
	
	@FindBy(id="lastname")
	WebElement lastname;
	
	@FindBy(id="company")
	WebElement company;
	
	@FindBy(id="address1")
	WebElement address1;
	
	
	@FindBy(id="address2")
	WebElement address2;
	
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="id_state")
	WebElement id_state;
	
	@FindBy(id="postcode")
	WebElement postcode;
	
	@FindBy(id="id_country")
	WebElement id_country;
	
	
	@FindBy(id="other")
	WebElement other;
	
	@FindBy(id="phone")
	WebElement phone;
	
	@FindBy(id="phone_mobile")
	WebElement phone_mobile;
	
	
	@FindBy(id="alias")
	WebElement Alias;
	
	
	@FindBy(id="submitAccount")
	WebElement submitAccount;
	
	@FindBy(css="h1.page-heading")
	public WebElement successregister;
	
	
public void userregister(String fname,String lname,String pass,String firstn,String lastn,String comp ,String add1,String add2,String cityy,String zip,String othercomm,String Homephone,String Mobilephone,String aliascomm) throws InterruptedException
{
	Thread.sleep(1000);
	userpress(gender);
	Thread.sleep(1000);
	userwrite(Fname, fname);
	Thread.sleep(1000);
	userwrite(Lname, lname);
	Thread.sleep(1000);
	userwrite(password, pass);
	Thread.sleep(1000);
	Select selectday=new Select(days);
	selectday.selectByValue("19");
	Select selectmonth=new Select(months);
	selectmonth.selectByValue("9");
	Select selectyear=new Select(years);
	selectyear.selectByValue("1985");
	Thread.sleep(1000);
	userwrite(firstname, firstn);
	Thread.sleep(1000);
	userwrite(lastname, lastn);
	Thread.sleep(1000);
    userwrite(company, comp);
    Thread.sleep(1000);
    userwrite(address1, add1);
    Thread.sleep(1000);
    userwrite(address2, add2);
    Thread.sleep(1000);
    userwrite(city, cityy);
    Thread.sleep(1000);
	Select select=new Select(id_state);
	select.selectByVisibleText("California");
	Thread.sleep(1000);
	userwrite(postcode,zip);
	Thread.sleep(1000);
	Select selectcontry=new Select(id_country);
	selectcontry.selectByVisibleText("United States");
	Thread.sleep(1000);
    userwrite(other, othercomm);
    Thread.sleep(1000);
    userwrite(phone,Homephone);
    Thread.sleep(1000);
    userwrite(phone_mobile, Mobilephone);
    Thread.sleep(1000);
    userwrite(Alias, aliascomm);
    Thread.sleep(1000);
    userpress(submitAccount);
    Thread.sleep(1000);
    
    
    
}
	
	
	
}
