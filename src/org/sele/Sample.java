package org.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Sample {

	public static void main(String[] args) {
	Lauch l=new Lauch();
	WebDriver driver=l.launchBrowser();
	l.launchUrl("https://www.facebook.com/");
	
	String url=l.getpageUrl();
	System.out.println(url);
	
	System.out.println(l.getpageTitle());
	
	WebElement txtuser=driver.findElement(By.id("email"));
	l.type(txtuser, "greens");
	
	WebElement txtpass=driver.findElement(By.id("pass"));
	l.type(txtpass, "greens123");
	
	WebElement btnlogin=driver.findElement(By.name("login"));
	l.btnClick(btnlogin);
	

	l.closeBrowser();
	

	
	
}
}
