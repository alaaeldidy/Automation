package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Hoverdressespage extends Pagebase {

	public Hoverdressespage(WebDriver driver) {
		super(driver);
		
		action = new Actions(driver); 	
	}
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	WebElement dresses;

	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[1]/a")
	WebElement ul;
	
	@FindBy(css="span.cat-name")
	public WebElement hoversuccess;
	
	
	
	public void userhoverdresses() throws InterruptedException
	{
		
		action.moveToElement(dresses).moveToElement(ul).click().build().perform();;
		
	}

	
	
	

}
