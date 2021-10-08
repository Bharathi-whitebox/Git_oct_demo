package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ParallelTestingDemo {
	
	@Test  (threadPoolSize =2, invocationCount = 3)
	public void Test1() throws InterruptedException{
		
		System.out.println("I am inside Test1 |" + Thread.currentThread().getId());	
	}
	
	@Test
	public void Test2() throws InterruptedException{

		System.out.println("I am inside Test2  |" + Thread.currentThread().getId());		
	}
	
	@Test
	public void Test3() throws InterruptedException{
		
		System.out.println("I am inside Test3 |" + Thread.currentThread().getId());	
	
	}
}
