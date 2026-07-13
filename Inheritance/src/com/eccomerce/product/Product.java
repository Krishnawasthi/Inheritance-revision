package com.eccomerce.product;

public class Product {
    String prod_name;
    String prod_Id;
    int price;
    
    Product(String prod_name, String prod_Id, int price  ){
    	
    	this. prod_name =  prod_name;
    	this. prod_Id =   prod_Id;
    	this. price =   price;
    }
    
    public void acceptDetails() {
    	
    	System.out.println("Product.acceptDetails()..........read details.... ");
    }
   public void displayDetails() {
    	
    	System.out.println("Product name : "+ prod_name );
    	System.out.println("Product name : "+ prod_Id );
    	System.out.println("Product name : "+ price );
    }
   public int calculateDiscount() {
   	
	   int discount = 10;
	   
	   int discounted_Price = price + (price*discount)/100;
         
	   return discounted_Price;
   }
    
	
}
