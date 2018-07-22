package com.java.hardwork;

public class FunctionInJava {
	
// main method-->Start point of execution
	public static void main(String[] args) {
		FunctionInJava obj1=new FunctionInJava();
		obj1.test();
		int s=obj1.sum();
		System.out.println(s);
		String a=obj1.aa();
		System.out.println(a);
		int d=obj1.div(10, 2);
		System.out.println(d);
	}
	// non static methods	
	//void means does not return any value
	public void test()    //no input ,no output
		{
			System.out.println("Test Method");
		}
		
		public int sum()     //no input,some output
		{
			System.out.println("Sum Method");
			int a=10;
			int b=20;
			int c=a+b;
			return c;
		}

		public String aa()		//no input,some output
		{
			System.out.println("String Method(aa)");
		    String s="SElenium";
		    return s;
		}
	
		//x,y input parameters/arguments
		public int div(int x,int y)  //some input,some output
		{
			System.out.println("Division Method");
			int d=x/y;
			return d;
		}

}
