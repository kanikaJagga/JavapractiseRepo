package com.java.hardwork;

public class HSBCBank implements USBank,BrazilBank{

		public void credit()
		{
			System.out.println("HSBC credit");
		}

		public void debit()
		{
			System.out.println("HSBC debit method");
		
	}
		public void transferMoney()
		{
			System.out.println("HSBC transfer money Method");
		}
		
		public void educationLoan()
		{
			System.out.println("HSBC EducationLoan Method ");
		}
		
		public void mutualFund()
		{
			System.out.println("HSBC Mutual Fund Method");
		}

}
