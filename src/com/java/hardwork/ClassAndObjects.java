package com.java.hardwork;

public class ClassAndObjects {

	int wheel;
	int modelno;
	public static void main(String[] args) {
	   //a,b,c are the object reference variables
		//new ClassAndObjects(); is the object of ClassAndObjects class
		
		ClassAndObjects a=new ClassAndObjects();  
		ClassAndObjects b=new ClassAndObjects();
		ClassAndObjects c=new ClassAndObjects();
		
		a.wheel=4;
		a.modelno=2018;
		
		b.wheel=4;
		b.modelno=2017;
		
		c.wheel=4;
		c.modelno=2016;
		//before shifting the refernce
		System.out.println(a.wheel);
		System.out.println(a.modelno);
		System.out.println(b.wheel);
		System.out.println(b.modelno);
		System.out.println(c.wheel);
		System.out.println(c .modelno);
		
		//After shifting the reference
		a=b;
		b=c;
		c=a;
		
		System.out.println(a.modelno);
		c.modelno=2019;
		System.out.println(c.modelno);
	}

}
