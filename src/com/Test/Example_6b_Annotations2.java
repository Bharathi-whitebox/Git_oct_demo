package com.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Example_6b_Annotations2 {
	
		 @Test
		 public void testCase4() {
		 
			 System.out.println("Normal Test Case4");		 
		 }
		 
		 @BeforeMethod		 
		 public void beforeMethod1() {
		 
			 System.out.println("\nExecute BeforeMethod1");		 
		 }
		 
		 @AfterMethod		 
		 public void afterMethod1() {
			 
			 System.out.println("Execute AfterMethod1\n");		 
		 }
		 
		 @BeforeClass		 
		 public void beforeClass1() {
		 
			 System.out.println("Execute BeforeClass1");		 
		 }
		 
		 @AfterClass		 
		 public void afterClass1() {
		 
			 System.out.println("Execute AfterClass1");		 
		 }
		 
		 @Test
		 public void testCase5() {
		 
			 System.out.println("Normal Test Case5");	
			// int i= 10/0;
			// System.out.println("nullpointer");	
		 }
		 @BeforeTest		 
		 public void beforeTest1() {
		 
			 System.out.println("Execute BeforeTest1");		 
		 }
		 
		 @AfterTest		 
		 public void afterTest1() {
		 
			 System.out.println("Execute AfterTest1\n");		 
		 }
		 
		 @BeforeSuite		 
		 public void beforeSuite1() {
		 
			 System.out.println("Execute BeforeSuite1");		 
		 }
		 
		 @Test
		 public void testCase6() {
		 
			 System.out.println("Normal Test Case6");	
			
		 }
		 
		 @AfterSuite		 
		 public void afterSuite1() {
		 
			 System.out.println("Execute AfterSuite1");		 
		 }
		 
	 }