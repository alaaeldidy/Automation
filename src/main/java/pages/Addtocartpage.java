package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Addtocartpage extends Pagebase {

	public Addtocartpage(WebDriver driver) {
		super(driver);
	}
		
	@FindBy(css="a.btn.btn-default.button.button-medium")
	WebElement proceedtocheckout;
	
	public void uaercheckoutt() throws InterruptedException
	{
	
		userpress(proceedtocheckout);
		Thread.sleep(2000);
		
	}

}
