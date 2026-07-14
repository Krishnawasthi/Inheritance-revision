package com.overriding.ihr4.covarient;

 class Delivery {
	public Post doDelivery() {
		
		System.out.println("Delivery..doDelivery().........");
		return new Post();  //return same Object type 
	}

}
 
 class OneDayDelivery extends Delivery
 {
	 @Override
	 
	 public SpeedPost doDelivery() {
		 System.out.println("OneDayDelivery..doDelivery().........");
		 
			return new SpeedPost();  //the return type of child class will always be the return type of its parent class or it's child class's return type
		 
	 }
	 
 }
 
