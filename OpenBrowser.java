package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenBrowser 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver dr=  new FirefoxDriver();//  to open chrome browser
		WebDriver dr1=  new ChromeDriver();
	
		String s="https:/google.com";
		dr1.get(s);
		dr1.manage().window().maximize();
		System.out.println(dr1.getTitle());
		
		String s1="https:/gmail.com";
		dr.get(s1);
		dr.manage().window().minimize();
		
		System.out.println(dr.getCurrentUrl());
		
		if(s.equalsIgnoreCase(s1))
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		dr.close();
		Thread.sleep(4000);
		dr1.close();
		
	}

}
