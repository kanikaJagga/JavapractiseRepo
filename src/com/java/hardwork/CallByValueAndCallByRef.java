package com.java.hardwork;

public class CallByValueAndCallByRef {

	int p;
	int q;
	public static void main(String[] args) {
		CallByValueAndCallByRef obj=new CallByValueAndCallByRef();
		int x=10;
		int y=20;
		int result=obj.sum(x, y);
		System.out.println(result);

		obj.p=50;
		obj.q=60;
		System.out.println(obj.p);
		System.out.println(obj.q);
		
		//After swapping
		obj.swap(obj);   //call by reference using object reference
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	public int sum(int x,int y)   //call by value or pass by value
	{
		//int a=100;
		//int b=200;
		int c=x+y;
		return c;
	}
	
	public void swap(CallByValueAndCallByRef t)//call by reference using object reference
	{
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
		
	}
}
