package com.java.hardwork;

public class Array2D {

	public static void main(String[] args) {
		// 2D Array
		//String 2 Dimensional Array
		String s[][]=new String[3][5];
		System.out.println(s.length); //total no. of rows 
		System.out.println(s[0].length);//total no.of columns
		//1st row
		s[0][0]="A";
		s[0][1]="B";
		s[0][2]="C";
		s[0][3]="D";
		s[0][4]="E";
		
		//2nd row
		s[1][0]="A1";
		s[1][1]="B1";
		s[1][2]="C1";
		s[1][3]="D1";
		s[01][4]="E1";
		
		//3rd row
		s[2][0]="A2";
		s[2][1]="B2";
		s[2][2]="C2";
		s[2][3]="D2";
		s[2][4]="E2";
				
		//print all the values of 2D array 
		//row 0-> col 0 to 4
		//row 1-> col 0 to 4
		//row 2-> col 0 to 4
		for(int row=0;row<s.length;row++)                           //outer loop
		{
			for(int column=0;column<s[0].length;column ++)          //inner loop
			{
				System.out.println(s[row][column]);
			}
		}

	}

}
