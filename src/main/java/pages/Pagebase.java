package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pagebase {

	public WebDriver driver;
	public Select select;
	public Actions action ; 
	public JavascriptExecutor jse;

	public	Pagebase(WebDriver driver)

	{

		PageFactory.initElements(driver, this);

	}

public void userpress(WebElement ele)
{
	ele.click();
}

public void userwrite(WebElement ele,String txt)
{
	ele.sendKeys(txt);
}

public void scrilldown()
{
	jse.executeScript("SCROLLBY(0,3000)");

}






}
