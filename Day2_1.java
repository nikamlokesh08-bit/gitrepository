package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_1
{

	public static void main(String[] args) 
	{
		WebDriver w=new ChromeDriver();
		String pw=w.getWindowHandle();
		String s="https://google.com";
		w.get(s);
		
		
		w.switchTo().newWindow(WindowType.TAB);
		String cw=w.getWindowHandle();
		String s1="https://gmail.com";
		w.get(s1);
		w.switchTo().window(pw);
		
		
		w.switchTo().newWindow(WindowType.TAB);
		String cw1=w.getWindowHandle();
		String s2="https://youtube.com";
		w.get(s2);
		w.switchTo().window(cw);
	

	}

}
