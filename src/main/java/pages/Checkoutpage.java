package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Checkoutpage extends Pagebase {

	public Checkoutpage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id="cart_summary")
	WebElement table;
	
	@FindBy(css="input.cart_quantity_input.form-control.grey")
	WebElement quantity;

	@FindBy(css="a.button.btn.btn-default.standard-checkout.button-medium")
	WebElement proceecdtocheckout1;
	
	@FindBy(css="button.button.btn.btn-default.button-medium")
	WebElement proceecdtocheckout2;
	
	@FindBy(css="button.button.btn.btn-default.standard-checkout.button-medium")
	WebElement proceecdtocheckout3;
	
	
	@FindBy(id="address_delivery")
	WebElement ulmydata;
	
	@FindBy(id="uniform-cgv")
	WebElement delevery;
	
	@FindBy(css="a.bankwire")
	WebElement paymentmethod;
	
	@FindBy(css="button.button.btn.btn-default.button-medium")
	WebElement confirmorderbtn;
	
	@FindBy(css="strong.dark")
	public WebElement confirmorder;
	

	public void usershowproductinchart(String Quantity) throws InterruptedException
	{
		
		userwrite(quantity,Quantity);	
		
	List<WebElement>rows=table.findElements(By.tagName("tr"));
	for(WebElement row:rows)
	{
		
		List<WebElement>cols=row.findElements(By.tagName("td"));
		for(WebElement col:cols)
		{
			System.out.println(col.getText());
		}
		
	}	
	    userpress(proceecdtocheckout1);
		
	    List<WebElement>datas=ulmydata.findElements(By.tagName("li"));
		for(WebElement data:datas)
		{
			System.out.println(data.getText());
		}
		
	    userpress(proceecdtocheckout2);
	    Thread.sleep(2000);
	    userpress(delevery);
	    Thread.sleep(2000);
	    userpress(proceecdtocheckout3);
	    Thread.sleep(2000);
	    userpress(paymentmethod);
	    Thread.sleep(2000);
	    userpress(confirmorderbtn);
	    Thread.sleep(4000);
	    
		
	    

	}
	

}
