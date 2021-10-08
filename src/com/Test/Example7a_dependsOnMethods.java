package com.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example7a_dependsOnMethods {

			@Test(priority = 5)
		void openUrl()
		{
			Assert.assertTrue(true);
			System.out.println("Launched the url");
		}
		@Test(priority =6)
		void login()
		{
			Assert.assertTrue(true);
			System.out.println("Login to the application");
		}
		@Test(dependsOnMethods= {"openUrl"},priority = 0, alwaysRun = true)
		void search()
		{
			Assert.assertTrue(true);
			System.out.println("Search for an item");
		}
		@Test(dependsOnMethods = {"search"}, priority = 6)
		void zaddToCart()
		{
			Assert.assertTrue(true);
			System.out.println("Adding an item to the cart");
		}
		@Test(dependsOnMethods = {"login"},priority = 7)
		void logout()
		{
			System.out.println("Logout from the application");
		}

	}

