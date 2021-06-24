package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productcartpage extends Pagebase {

	public productcartpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="add_to_cart")
	WebElement addtocart;
	
	@FindBy(xpath="//*[@id=\"layer_cart\"]/div[1]/div[1]/h2")
	public WebElement addectocartsuccess;

	

	public void uaeraddtocart() throws InterruptedException
	{
		Thread.sleep(2000);	
		userpress(addtocart);
		Thread.sleep(4000);
	
	}
	
	
	
	
	

}
