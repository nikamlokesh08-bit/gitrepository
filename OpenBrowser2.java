package com.test;




import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class OpenBrowser2 
{

	public static void main(String[] args) throws InterruptedException
	{
		//WebDriver dr=  new FirefoxDriver();//  to open chrome browser
		WebDriver dr1=  new ChromeDriver();
	
		String s="https:/google.com";
		Thread.sleep(2000);
		
		String s1="https:/gmail.com";
		Thread.sleep(2000);
		dr1.navigate().back();
		System.out.println(dr1.manage().window().getSize());
		Dimension d= new Dimension(500,850);
		dr1.manage().window().setSize(d);
		dr1.get(s);
		dr1.get(s1);
		
		
		
		
		
	}

}
