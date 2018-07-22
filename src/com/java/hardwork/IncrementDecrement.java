package com.java.hardwork;

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=5;
        int j=++i;                //pre INCREMENT
        System.out.println(i);    //6
        System.out.println(j);    //6
        
        int a=5;
        int b=a++;                //post INCREMENT
        System.out.println(a);	  //6
        System.out.println(b);    //5
        
        int c=5;
        int d=--c;				//pre DECREMENT
        System.out.println(c);  //4
        System.out.println(d);  //4
        
        int x=5;
        int y=x--;				//post DECREMENT
        System.out.println(x);  //4
        System.out.println(y);  //5
	}

}
