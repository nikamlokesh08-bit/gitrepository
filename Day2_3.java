package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Day2_3 {

	public static void main(String[] args) 
	{
		FirefoxOptions cc=new FirefoxOptions();
		//cc.addArguments("incognito");
		cc.addArguments("--headless");
		WebDriver dr=new FirefoxDriver();
		dr.get("https://www.google.com");
		System.out.println(dr.getTitle());
	}

}
