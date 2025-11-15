package com.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_2 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver ww=new ChromeDriver();
		ww.get("https://demo.automationtesting.in/Alerts.html");
		WebElement w2=ww.findElement(By.xpath("// a[@href='#CancelTab']"));
		Thread.sleep(2000);
		WebElement w3=ww.findElement(By.xpath("// a[@href='#CancelTab']"));

		WebElement w1=ww.findElement(By.xpath("//button[@onclick='alertbox()']"));
		w1.click();
		Thread.sleep(2000);
		Alert al=ww.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
	}

}
