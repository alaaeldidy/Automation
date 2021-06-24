package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Pagebase {

	public Homepage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText="Sign in")
	WebElement signinlink;
	
	@FindBy(id="search_query_top")
	WebElement Searchtxt;
	
	@FindBy(css="button.btn.btn-default.button-search")
	WebElement submitbtn;

	
public void userpressonsignin()
{
userpress(signinlink);	
}
public void usersearch(String product) throws InterruptedException
{	
userwrite(Searchtxt,product);
userpress(submitbtn);
Thread.sleep(2000);
	
}
	
}
