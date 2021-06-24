package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signinpage extends Pagebase {


	public Signinpage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css="h1.page-heading")
	public WebElement successsignin;
	
	

	
}
