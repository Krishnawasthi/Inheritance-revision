package com.overring.ihr3;


class Customer{
	
	private void showDetails() {
		
		System.out.println("Customer.showdetails()......");
	}
	//this method can be reuse in the child classes or if child classes want to modify the functionalities of this method , they are free to do so
	public void calculatePrice() {
		
		System.out.println("Customer.calculatePrice()......");
	}
	
}

class goldCustomer extends Customer

{

	
  public void calculatePrice() 
	{
		System.out.println("Customer.calculatePrice()......");
	
	}
}


public class Driver

{
	
	public static void main(String[] args) {
		
	}

}
