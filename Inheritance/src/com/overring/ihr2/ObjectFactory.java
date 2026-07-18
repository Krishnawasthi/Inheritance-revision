package com.overring.ihr2;

public class ObjectFactory {
	
	public static Object getObject(String name) {
		
		Object obj = null;
		
		if(name.equalsIgnoreCase("Product")) {
			
			obj = new Product();
			
			
		}
		else if(name.equalsIgnoreCase("ElectronicProduct")) {
			
			 obj = new ElectronicProduct();
			
		}
		
		else {
			
			System.out.println("Invalid type ");
		}
		
		return obj;
		
	}

}
