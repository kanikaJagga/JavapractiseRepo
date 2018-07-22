package com.java.hardwork;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String age="100";
		int i=10;
		//string to int
		int s=Integer.parseInt(age);
		System.out.println(s+i);
		
		//string to double
		String x="10.12";
		double d=Double.parseDouble(x);
		System.out.println(d+12.12);
		
		//string to boolean
		String b="true";
		boolean b1=Boolean.parseBoolean(b);
		System.out.println(b1);
		
		//Int to string
		int i1=100;
		String s1=String.valueOf(i1);
		System.out.println(100+s1 );
	

	}

}
