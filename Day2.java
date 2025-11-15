package com.test;

import java.lang.reflect.Field;
import java.nio.channels.SelectableChannel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver wb=new ChromeDriver();
		String  s="https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php";
		wb.get(s);
		wb.manage().window().fullscreen();
		WebElement we=wb.findElement(By.id("name"));
		WebElement we1=wb.findElement(By.id("email"));
		WebElement we2=wb.findElement(By.id("gender"));
		we.click();
		we1.click();
		we.sendKeys("Lokesh");
		we1.sendKeys("lokesh@121gmail.com");
		
		Thread.sleep(2000);
		//we2.findElement(By.xpath("//input[@id='name']//following::input[3]")).click();
		Thread.sleep(2000);
		we2.findElement(By.xpath("//input[@id='name']//following::input[2]")).click();
		WebElement we3=wb.findElement(By.id("mobile"));
		we3.sendKeys("9823805526");
		WebElement we4=wb.findElement(By.id("subjects"));
		we4.sendKeys("Java");
		WebElement we5=wb.findElement(By.id("hobbies"));
		we5.findElement(By.xpath("//input[@id='name']//following::input[9]"));
		we5.click();
		WebElement we6=wb.findElement(By.id("dob"));
		we6.sendKeys("14/04/2002");
		WebElement we7=wb.findElement(By.xpath("//textarea[@placeholder='Currend Address']"));
		we7.sendKeys("nashik");
		wb.findElement(By.name("picture")).sendKeys("C:\\Users\\cdac.CDACLAB-148\\Pictures");
		WebElement we8=wb.findElement(By.xpath("//select[@id='state']"));
		WebElement we9=wb.findElement(By.xpath("//select[@id='city']"));
		Select se=new Select(we8);
		se.selectByIndex(2);
		System.out.println(we8.getText());
		Select se1=new Select(we9);
		se1.selectByIndex(3);
		System.out.println(we9.getText());

		

	}

}
