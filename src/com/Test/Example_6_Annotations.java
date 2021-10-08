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

public class Example_6_Annotations {
	
		 @Test
		 public void testCase1() {
		 
			 System.out.println("Normal Test Case1");		 
		 }
		 
		 @BeforeMethod		 
		 public void beforeMethod() {
		 
			 System.out.println("\nExecute BeforeMethod");		 
		 }
		 
		 @AfterMethod		 
		 public void afterMethod() {
			 
			 System.out.println("Execute AfterMethod\n");		 
		 }
		 
		 @BeforeClass		 
		 public void beforeClass() {
		 
			 System.out.println("Execute BeforeClass");		 
		 }
		 
		 @AfterClass		 
		 public void afterClass() {
		 
			 System.out.println("Execute AfterClass");		 
		 }
		 
		 @Test
		 public void testCase2() {
		 
			 System.out.println("Normal Test Case2");	
		//	 int i= 10/0;
		//	 System.out.println("nullpointer");	
		 }
		 @BeforeTest		 
		 public void beforeTest() {
		 
			 System.out.println("Execute BeforeTest");		 
		 }
		 
		 @AfterTest		 
		 public void afterTest() {
		 
			 System.out.println("Execute AfterTest\n");		 
		 }
		 
		 @BeforeSuite		 
		 public void beforeSuite() {
		 
			 System.out.println("Execute BeforeSuite");		 
		 }
		 
		 @Test
		 public void testCase3() {
		 
			 System.out.println("Normal Test Case3");	
			
		 }
		 
		 @AfterSuite		 
		 public void afterSuite() {
		 
			 System.out.println("Execute AfterSuite");		 
		 }
		 
	 }