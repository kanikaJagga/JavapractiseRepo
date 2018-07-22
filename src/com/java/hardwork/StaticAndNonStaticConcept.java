package com.java.hardwork;

public class StaticAndNonStaticConcept {

	String name="kanika";  //non static variable
	static int age=28;     //static variable
	
	public static void main(String[] args) {
	//Type 1--Calling static methods
		//Direct Calling
		sum();
		
	//Type 2--Calling static methods
	//calling by class name
		StaticAndNonStaticConcept.sum();
		
		//Type1--Calling Static Variables
		//direct calling
		System.out.println(age);
		
		//Type2--Calling Static Variables
        //calling by class name
		System.out.println(StaticAndNonStaticConcept.age);
		
		//calling Non-static Method
		StaticAndNonStaticConcept s=new StaticAndNonStaticConcept();
		s.sendmail();
		//calling non-static variable
		System.out.println(s.name);
	}
	public void sendmail()
	{
		System.out.println("Send Mail Method");
	}

	public static void sum()
	{
		System.out.println("Sum method");
	}
}
