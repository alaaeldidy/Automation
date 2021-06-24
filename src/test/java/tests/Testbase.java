package tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class Testbase {

public WebDriver driver;	
@Parameters({"browser"})	
@BeforeClass
public void useropenurl(@Optional("chrome") String browsername)
{
	if(browsername.equalsIgnoreCase("chrome"))
	{
     String path=System.getProperty("user.dir")+"//Drivers//chromedriver.exe";
     System.out.println(path);
     System.setProperty("webdriver.chrome.driver",path);
     driver=new ChromeDriver();
	}
	
	else if(browsername.equalsIgnoreCase("firefox"))
	{
     String path=System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe";
     System.setProperty("webdriver.gecko.driver",path);
     driver=new FirefoxDriver();
	}
	else if(browsername.equalsIgnoreCase("headless"))
	{
		String path=System.getProperty("user.dir")+"\\Drivers\\phantomjs.exe";
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setJavascriptEnabled(true);
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, path);
		String [] args= {"--web-security=false","--ignore-ssl-errors=yes"};
		caps.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, args);
		driver=new PhantomJSDriver(caps);
	}
	else if(browsername.equalsIgnoreCase("chrome headless"))
	{
		String path=System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--headless");
		opt.addArguments("--window-size=1920,1080");
		driver=new ChromeDriver(opt);
	}
	
	
	
	
      driver.manage().window().maximize();;
      driver.navigate().to("http://automationpractice.com");
}


@AfterMethod
public void takescreenshot(ITestResult result) throws IOException
{
	if(ITestResult.FAILURE==result.getStatus())
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source,new File("./Screenshots/"+result.getName()+".png"));
	}
	
}









	
@AfterClass
	public void usercloseurl()
	{
	
	driver.quit();
	}
	
	
	
	
	
	
	
	
	
	

}

