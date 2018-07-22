package com.java.hardwork;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading  m=new MethodOverloading();
		m.sum();
		m.sum(10);
		m.sum(10,20);
	}
	
	public void sum()   //o input parameter
	{
		System.out.println("sum method--Zero input parameter");
	}

	public void sum(int i)
	{
		System.out.println("sum method--1 input parameter");
		System.out.println(i);
	}
	
	public void sum(int i,int j)
	{
		System.out.println("Sum method-- 2 input parameter");
		System.out.println(i+j);
	}
}
