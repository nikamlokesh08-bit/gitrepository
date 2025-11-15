package com.test;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actiondemo {

	public static void main(String[] args) 
	{
		WebDriver rr=new ChromeDriver();
		rr.get("https://accounts.saucelabs.com/am/XUI/#login/");
		System.out.println(rr.getTitle());
		WebElement wb=rr.findElement(By.id("idToken1"));
		Actions a =new Actions(rr);
		a.moveToElement(wb).contextClick().build().perform();
		wb.sendKeys("chhawa");
		a.doubleClick(wb).build().perform();
		
	}

}
