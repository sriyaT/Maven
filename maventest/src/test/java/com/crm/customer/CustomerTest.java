package com.crm.customer;

import org.testng.annotations.Test;

public class CustomerTest {
	
	@Test
	
	public void createTest() {
		
		String browser= System.getProperty("browser");
		String url= System.getProperty("url");
		System.out.println(" customer is created ");
		
		}

		
		@Test
		public void deleteCustomer() {
			
			System.out.println("customer is deleted ");
			
		}
		
		@Test
		public void searchCustomer()
		{
			
			System.out.println("customer is found ");
			
		}
	

}
