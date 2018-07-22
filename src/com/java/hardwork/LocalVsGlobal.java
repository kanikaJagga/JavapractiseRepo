package com.java.hardwork;

public class LocalVsGlobal {
	
   String name="kanika";   //Gloabl variable
   int age=28;
   
	public static void main(String[] args) {
		int i=10;                           //Local variable of main method
		System.out.println(i);
		
		LocalVsGlobal g=new LocalVsGlobal();
		System.out.println(g.name);         //Global variable access through object name
		System.out.println(g.age);
        g.sum();
	}
	
	public void sum()
	{
		int i=20;                           //Local variable of sum method
		System.out.println(i);
	}

}
