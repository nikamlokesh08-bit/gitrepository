package com.test;



import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day2_4 {

	public static void main(String[] args)
	{
		WebDriver d=new ChromeDriver();
		d.get("https://demo.automationtesting.in/Static.html");
//		d.manage().window().fullscreen();
//		WebElement dd= d.findElement(By.xpath("//img[@id=\"angular\"]"));
//		WebElement dd1=d.findElement(By.xpath("//img[@id=\"node\"]"));
//		
//		Actions ac=new Actions(d);
//		ac.dragAndDrop(dd, dd1).build().perform();
		
		//File screnshot=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		//
		 //Files.copy(screnshot, new File("C:\\Users\\cdac.CDACLAB-148\\Desktop"));
	}

}
