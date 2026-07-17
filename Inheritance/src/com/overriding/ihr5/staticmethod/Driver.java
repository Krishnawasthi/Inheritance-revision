package com.overriding.ihr5.staticmethod;
//note : private methods can not be @Override by the child class.
class Delivery
{
	static void estimateTime(String stc ,String dest)
	{ 
		
		System.out.println("Delivery..estimateTime");
		
	} 
	
}

class ExpressDelivary extends Delivery
{   //static methods are hidden inside the child class they can not be @Override
	
	static void estimateTime(String stc ,String dest)
	{ 
		
		System.out.println("ExpressDelivery..estimateTime");
		
	}
	
}



public class Driver {
	

}
