package com.java.hardwork;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=100;
		int b=200;
		
		String x="hello";
		String y="world";
		
		System.out.println(a+b);  			//300
		System.out.println(x+y);  			//helloworld
		System.out.println(a+b+x+y); 		//300helloworld
		System.out.println(x+y+a+b); 		//helloworld100200
		System.out.println(a+b+x+a+y+b);	//300hello100world200

	}

}
