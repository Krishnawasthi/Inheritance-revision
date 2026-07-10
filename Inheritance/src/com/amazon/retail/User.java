package com.amazon.retail;

public class User extends UserMGT {
	
	String prodName = "sugar";

	public static void main(String[] args) {
		
		User obj = new User();
		System.out.println(obj.location);
		System.out.println(obj.type);
		obj.doSomething();
		

	}

}
