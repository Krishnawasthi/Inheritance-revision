package com.overring.ihr2;

class Product{
	
	private String name;
	private int disc;
	
	
	public void displayProductDetails()
{ 
		
	System.out.println("Product.displayProductDetails()");	

}
}
 class ElectronicProduct{
    	
    	public void displayProductDetails() {
    		
    System.out.println("changing the details from parent class  ");	
    		
    	}
    }

public class Driver {

	
	
	public static void main(String[] args) {
	
		Object obj = ObjectFactory.getObject("ElectronicProduct");
		 ElectronicProduct p =  (ElectronicProduct) obj;
            p.displayProductDetails();
	}

}
