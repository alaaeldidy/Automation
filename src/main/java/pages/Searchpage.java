package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Searchpage extends Pagebase {

	public Searchpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="img.replace-2x.img-responsive")
	WebElement productdone;
	
	@FindBy(css="span.lighter")
	public WebElement sucesssearch;
	

	public void userpressonitem() throws InterruptedException
	{	
	userpress(productdone);	
	Thread.sleep(2000);
	
	}
	
	
}
