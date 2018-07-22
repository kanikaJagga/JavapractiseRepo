package com.java.hardwork;

public class TestParent {

	public static void main(String[] args) {
		Child obj1= new Child();
        obj1.a();    //method overriding (compile time polymorphism)/static binding 
		obj1.b();
		obj1.c();
		obj1.d();
		
		Parent obj2=new Parent();
		obj2.a();
		obj2.b();
		obj2.c();
		
		Parent obj3=new Child();//dynamic polymorphism(top casting)--refering child object with parent reference variable
		obj3.a();
		obj3.b();
		obj3.c();

	}

}
