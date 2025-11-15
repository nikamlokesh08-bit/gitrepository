package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver w1=new ChromeDriver();
		
		String s="https://practicetestautomation.com/practice-test-login/";
		w1.get(s);
		w1.manage().window().fullscreen();;
		WebElement we=w1.findElement(By.id("username"));
		WebElement we1=w1.findElement(By.id("password"));
		WebElement we2=w1.findElement(By.id("submit"));
		
		System.out.println(we.getLocation());
		System.out.println(we.getTagName());
		System.out.println(we.isDisplayed());
		System.out.println(we.isEnabled());
		System.out.println(we.isSelected());
		System.out.println(we.getText());
		
		
		we.click();
		we1.click();
		we.sendKeys("Welcome");
		we.clear();
		we.sendKeys("sstudent");
		we1.sendKeys("Password123");
		we.sendKeys("student");
		we1.sendKeys("Pasgsword123");
		we2.click();
		WebElement message=w1.findElement(By.id("error"));
		WebElement message1=w1.findElement(By.id("error"));
	     Thread.sleep(2000);
		System.out.println(message.getText());
		System.out.println(message1.getText());
		
		
		
		
	
		
		
	
	
	   
		
	
	}

}
