package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Athenticationpage extends Pagebase {

	public Athenticationpage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(id="email_create")
	WebElement createmail;
	
	@FindBy(id="SubmitCreate")
	WebElement submitmail;
	
	@FindBy(id="email")
	WebElement mailsignin;
	
	@FindBy(id="passwd")
	WebElement pass;
	
	@FindBy(id="SubmitLogin")
	WebElement login;
	
	
	public void userauthenticateregister(String mail)
	{
	  userwrite(createmail,mail);
	  userpress(submitmail);
		
		
	}
	
	public void userauthenticatesignin(String emailsignin,String passsignin)
	{
	  userwrite(mailsignin, emailsignin);
	  userwrite(pass, passsignin);
	  userpress(login);
		
		
	}
	
	
	

}
