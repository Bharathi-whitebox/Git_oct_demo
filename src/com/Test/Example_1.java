package com.Test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example_1 {
	
//	@Parameters({"URL2"})
//	@Test
//	public void Pdemo1(String urlname){
//		System.out.println("Parameterize demo");
//		System.out.println(urlname);
//	}
//	
	@Test
	public void demo1(){
		System.out.println("Hello");
	}
	
	@Test
	public void App() {
		System.out.println(" Example_1");
	}
	
	@Test(groups = {"smoke Test"})
	public void STest() {
		System.out.println("Example_1_smokeTest");
	}

//	@AfterTest
//	public void lastmethod() {
//		System.out.println(" After Test method");
//	}
}
 