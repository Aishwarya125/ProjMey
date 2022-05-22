
package org.sele;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lauch {
	public static WebDriver driver;
	public WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		return driver;
		
	}
	
	public  void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	
	}
	public void type(WebElement element, String data)
	{
	element.sendKeys(data);
	}
	public void  btnClick(WebElement element)
	{
		element.click();
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
	
	public String getpageUrl()
	{
		String url=driver.getCurrentUrl();
		return url;
		
	}
	public String getpageTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
}
