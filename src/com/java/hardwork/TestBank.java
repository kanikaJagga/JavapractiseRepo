package com.java.hardwork;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		HSBCBank obj=new HSBCBank();
		obj.credit();           //static polymorphism as we are overriding credit,debit and transfermoney method of interface
		obj.debit();
		obj.transferMoney();
		obj.educationLoan();
		obj.mutualFund();
		
		//dynamic polymorphism
		//child class object can be refered by parent interface variable
		USBank b=new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		//b.educationLoan(); -- not allowed only overridden methods can be accessed by Interface class

	}

}
