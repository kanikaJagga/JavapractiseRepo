package com.java.hardwork;

public class Array {

	public static void main(String[] args) {
		// 1 DIMENTIONAL ARRAY
		
		//1.int array
		int i[]=new int[4];
		 i[0]=10;
		 i[1]=20;
		 i[2]=30;
		 i[3]=40;
		 System.out.println(i[0]);
		 System.out.println(i[3]);
		 System.out.println(i.length);    //size of array
		 for(int j=0;j<i.length;j++)      //print all the values of array
		 {
			 System.out.println(i[j]);
		 }
	
	   //2.double array
		 double d[]=new double[3];
		 d[0]=10.33;
		 d[1]=11.33;
		 System.out.println(d[1]);
	   //System.err.println(d[3]);   //java.lang.ArrayIndexOutOfBoundsException
		 
	  //3.char array
		 char c[]=new char[2];
		 c[0]='a';
		 c[1]='d';
		 System.out.println(c[1]);
		 
	  //4.String array
		 String s[]=new String[3];
		 s[1]="java";
		 s[2]="is";
		 s[0]="language";
		 System.out.println(s[0]);
		 System.out.println(s.length);
		 
	  //5. boolean Array
		 boolean b[]=new boolean[2];
		 b[0]=true;
		 b[1]=false;
		 System.out.println(b[0]);
	  
	  //6.Object array
		 Object o[]=new Object[5];
		 o[0]="kanika";
		 o[1]=28;
		 o[2]="07/02/1990";
		 o[3]='F';
		 o[4]=4.05;
		 for(int x=0;x<o.length;x++)
		 {
			 System.out.println(o[x]);
		 }
				 
		
	}

}
