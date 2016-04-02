package JavaExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumFirst {
	

	public static void main(String [] args) throws Exception
	{
	
		try {
			ProfilesIni allprof = new ProfilesIni();
		
	FirefoxProfile myprof = allprof.getProfile("default");
	WebDriver driver = null;
	String BrowserType = "Mozilla";
	
	if (BrowserType.equals("Mozilla"))
	{
		driver = new FirefoxDriver(myprof);
	}
	else if (BrowserType.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		 driver = new ChromeDriver();
	}
	else {
		System.setProperty("webdriver.ie.driver", "C:\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	//WebDriver driver2 = new FirefoxDriver();
	/*driver.get("https://www.hertzcarsales.com");
		System.out.println(driver.getTitle());
		
	if (driver.getTitle().contentEquals("Buy Affordable Used Cars for Sale by Owner- Hertz Car Sales"))
	{
		System.out.println("Test is passed");
		
	}
	else
	{
		System.out.println("Test is failed");
	}
	*/
	driver.get("https://google.com");
	driver.findElement(By.linkText("Gmail")).click();
	driver.findElement(By.partialLinkText("Sign")).click();
	//String pagesource = driver.getPageSource();
	//System.out.println(pagesource); //print in console
	//System.out.println(driver.getCurrentUrl());/// print in console
	driver.navigate().to("http://www.yahoo.com");
	driver.navigate().back(); // back to gmail
	System.out.println("test is passed");
	
	//how to switch to frame by name or index. Get the name and index from HTML in firebug.
	//driver.switchTo().defaultContent() // to focus to URL
	//switch from top window to first frame
	driver.navigate().to("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
	driver.switchTo().frame("packageListFrame");
	driver.findElement(By.xpath("html/body/div[2]/ul/li[2]/a")).click();
	String text = driver.findElement(By.xpath("html/body/div[1]/ul[1]/li[1]/a/i")).getText();
	System.out.println(text);
	if(text.equals("conditionRunner"))
	{
		System.out.println(("frame switch window test is passed"));
		
	}
	else {
		System.out.println("Frame switch window test is failed");
	}
	driver.quit();
		}catch(Exception e)
		{
			System.out.println("exception caught");
		}
	}
}
