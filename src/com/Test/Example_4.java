package com.Test;

import org.testng.annotations.Test;

public class Example_4 {

	@Test
	public void demo4(){
		System.out.println(" Example_4");
	}
	
	@Test(groups = {"smoke Test"})
	public void STest2() {
		System.out.println("Example_4_smokeTest");
	}
}
